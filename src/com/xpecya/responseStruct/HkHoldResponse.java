package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HkHoldResponse {

    private String code;
    private String trade_date;
    private String ts_code;
    private String name;
    private Integer vol;
    private Float ratio;
    private String exchange;
}
