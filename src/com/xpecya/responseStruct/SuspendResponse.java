package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuspendResponse {

    private String ts_code;
    private String suspend_date;
    private String resume_date;
    private String ann_date;
    private String suspend_reason;
    private String reason_type;
}
