package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GgtDailyParam implements Param {

    private String trade_date;
    private String start_date;
    private String end_date;

    @Override
    public String getApiName() {
        return "ggt_daily";
    }
}
