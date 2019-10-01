package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinaAuditParam implements Param {

    private String ts_code;
    private String ann_date;
    private String start_date;
    private String end_date;
    private String period;

    @Override
    public String getApiName() {
        return "fina_audit";
    }
}
