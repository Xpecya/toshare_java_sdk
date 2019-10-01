package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisclosureDateParam implements Param {

    private String ts_code;
    private String end_date;
    private String pre_date;
    private String actual_date;

    @Override
    public String getApiName() {
        return "disclosure_date";
    }
}
