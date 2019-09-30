package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeeklyResponse {

    private String ts_code;
    private String trade_date;
    private Float close;
    private Float open;
    private Float high;
    private Float low;
    private Float pre_close;
    private Float change;
    private Float pct_chg;
    private Float vol;
    private Float amount;
}
