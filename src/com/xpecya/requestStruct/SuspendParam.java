package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuspendParam implements Param {

    private String ts_code;
    private String suspend_date;
    private String resume_date;

    @Override
    public String getApiName() {
        return "suspend";
    }
}
