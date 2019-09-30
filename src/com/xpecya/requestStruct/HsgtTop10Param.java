package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HsgtTop10Param implements Param {

    private String ts_code;
    private String trade_date;
    private String start_date;
    private String end_date;
    private String market_type;

    @Override
    public String getApiName() {
        return "hsgt_top10";
    }
}
