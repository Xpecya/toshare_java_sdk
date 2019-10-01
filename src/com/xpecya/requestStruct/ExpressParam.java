package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpressParam implements VipParam {

    private String ts_code;
    private String ann_date;
    private String start_date;
    private String end_date;
    private String period;

    @Override
    public String getApiName() {
        return "express";
    }
}
