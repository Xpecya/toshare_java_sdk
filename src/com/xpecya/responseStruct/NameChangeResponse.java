package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NameChangeResponse {

    private String ts_code;
    private String name;
    private String start_date;
    private String end_date;
    private String ann_date;
    private String change_reason;
}
