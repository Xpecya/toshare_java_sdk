package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StkLimitResponse {

    private String trade_date;
    private String ts_code;
    private Float pre_close;
    private Float up_limit;
    private Float down_limit;
}
