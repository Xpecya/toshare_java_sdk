package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StkManagersParam implements Param {

    private String ts_code;

    @Override
    public String getApiName() {
        return "stk_managers";
    }
}
