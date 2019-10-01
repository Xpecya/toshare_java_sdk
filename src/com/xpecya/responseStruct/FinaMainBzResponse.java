package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinaMainBzResponse {

    private String ts_code;
    private String end_date;
    private String bz_item;
    private Float bz_sales;
    private Float bz_profit;
    private Float bz_cost;
    private Float curr_type;
    private Float update_flag;
}
