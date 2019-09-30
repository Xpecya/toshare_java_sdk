package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockCompanyParam implements Param {

    private String exchange;

    @Override
    public String getApiName() {
        return "stock_company";
    }
}
