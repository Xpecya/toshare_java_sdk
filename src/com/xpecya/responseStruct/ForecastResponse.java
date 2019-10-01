package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForecastResponse {

    private String ts_code;
    private String ann_date;
    private String end_date;
    private String type;
    private Float p_change_min;
    private Float p_change_max;
    private Float net_profit_min;
    private Float net_profit_max;
    private Float last_parent_net;
    private String first_ann_date;
    private String sumamry;
    private String change_reason;
}
