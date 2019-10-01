package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinaMainBzParam implements VipParam {

    private String ts_code;
    private String period;
    private String type;
    private String start_date;
    private String end_date;

    @Override
    public String getApiName() {
        return "fina_mainbz";
    }
}
