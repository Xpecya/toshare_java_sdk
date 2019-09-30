package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HkHoldParam implements Param {

    private String code;
    private String ts_code;
    private String trade_date;
    private String start_date;
    private String end_date;
    private String exchange;

    @Override
    public String getApiName() {
        return "hk_hold";
    }
}
