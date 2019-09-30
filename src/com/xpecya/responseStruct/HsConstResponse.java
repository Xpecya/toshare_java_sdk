package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HsConstResponse {

    private String ts_code;
    private String hs_type;
    private String in_date;
    private String out_date;
    private String is_new;
}
