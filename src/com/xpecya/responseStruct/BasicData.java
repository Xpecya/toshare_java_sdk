package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;

@Getter
@Setter
public class BasicData {

    private Boolean has_more;
    private String[] fields;
    private String[][] items;

    public <T> Collection<T> getInstances(Class<T> itemClass) throws IllegalAccessException, InstantiationException {
        Collection<T> collection = new HashSet<>();
        Field[] declaredFields = itemClass.getDeclaredFields();
        int length = fields.length;
        int declaredLength = declaredFields.length;
        Field[] dataFields = new Field[length];
        for (int i = 0; i < length; i++) {
            String fieldName = fields[i];
            for (int j = 0; j < declaredLength; j++) {
                Field field = declaredFields[j];
                if (fieldName.equals(field.getName())) {
                    field.setAccessible(true);
                    dataFields[i] = field;
                    break;
                }
            }
        }
        int itemLength = items.length;
        int dataLength = items[0].length;
        for (int i = 0; i < itemLength; i++) {
            String[] data = items[i];
            T t = itemClass.newInstance();
            for (int j = 0; j < dataLength; j++) {
                Field dataField = dataFields[j];
                dataField.set(t, data[j]);
            }
            collection.add(t);
        }
        return collection;
    }
}
