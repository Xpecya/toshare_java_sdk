package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StkRewardsParam implements Param {

    private String ts_code;
    private String end_date;

    @Override
    public String getApiName() {
        return "stk_rewards";
    }
}
