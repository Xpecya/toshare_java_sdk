package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinaAuditResponse {

    private String ts_code;
    private String ann_date;
    private String end_date;
    private String audit_result;
    private Float audit_fees;
    private String audit_agency;
    private String audit_sign;
}
