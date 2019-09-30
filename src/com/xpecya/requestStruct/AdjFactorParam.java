package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdjFactorParam implements Param {

    private String ts_code;
    private String trade_date;
    private String start_date;
    private String end_date;

    @Override
    public String getApiName() {
        return "adj_factor";
    }
}
