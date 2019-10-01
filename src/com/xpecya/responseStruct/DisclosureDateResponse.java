package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisclosureDateResponse {

    private String ts_code;
    private String ann_date;
    private String end_date;
    private String pre_date;
    private String actual_date;
    private String modify_date;
}
