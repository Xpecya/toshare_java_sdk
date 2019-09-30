package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HsConstParam implements Param {

    private String hs_type;
    private String is_new;

    @Override
    public String getApiName() {
        return "hs_const";
    }
}
