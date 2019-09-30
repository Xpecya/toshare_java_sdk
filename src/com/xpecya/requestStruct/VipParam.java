package com.xpecya.requestStruct;

public interface VipParam extends Param {

    default String getVipApiName() {
        return getApiName() + "_vip";
    }
}
