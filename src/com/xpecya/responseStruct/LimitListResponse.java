package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LimitListResponse {

    private String trade_date;
    private String ts_code;
    private String name;
    private Float close;
    private Float pct_chg;
    private Float amp;
    private Float fc_ratio;
    private Float fl_ratio;
    private Float fd_amount;
    private String first_time;
    private String last_time;
    private Integer open_times;
    private Float strth;
    private String limit;
}
