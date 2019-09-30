package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DailyBasicResponse {

    private String ts_code;
    private String trade_date;
    private Float close;
    private Float turnover_rate;
    private Float turnover_rate_f;
    private Float volume_ratio;
    private Float pe;
    private Float pt_ttm;
    private Float pb;
    private Float ps;
    private Float ps_ttm;
    private Float total_share;
    private Float float_share;
    private Float free_share;
    private Float total_mv;
    private Float circ_mv;
}
