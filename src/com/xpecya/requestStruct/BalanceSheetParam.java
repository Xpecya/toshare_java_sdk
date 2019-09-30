package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BalanceSheetParam implements VipParam {



    @Override
    public String getApiName() {
        return "balancesheet";
    }
}
