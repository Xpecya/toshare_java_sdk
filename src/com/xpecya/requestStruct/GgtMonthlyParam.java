package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GgtMonthlyParam implements Param {

    private String month;
    private String start_month;
    private String end_month;

    @Override
    public String getApiName() {
        return "ggt_monthly";
    }
}
