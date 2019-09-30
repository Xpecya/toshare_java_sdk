package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewShareParam implements Param {

    private String start_date;
    private String end_date;

    @Override
    public String getApiName() {
        return "new_share";
    }
}
