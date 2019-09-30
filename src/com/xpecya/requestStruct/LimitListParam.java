package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LimitListParam implements Param {

    private String trade_date;
    private String ts_code;
    private String limit_type;
    private String start_date;
    private String end_date;

    @Override
    public String getApiName() {
        return "limit_list";
    }
}
