package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TradeCalParam implements Param {

    private String exchange;
    private String start_date;
    private String end_date;
    private String is_open;

    @Override
    public String getApiName() {
        return "trade_cal";
    }
}
