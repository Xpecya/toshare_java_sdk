package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DividendParam implements Param {

    private String ts_code;
    private String ann_date;
    private String record_date;
    private String ex_date;
    private String imp_ann_date;

    @Override
    public String getApiName() {
        return "dividend";
    }
}
