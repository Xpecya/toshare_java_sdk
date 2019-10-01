package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CashFlowParam implements VipParam {

    private String ts_code;
    private String ann_date;
    private String start_date;
    private String end_date;
    private String period;
    private String report_type;
    private String comp_type;

    @Override
    public String getApiName() {
        return "cashflow";
    }
}
