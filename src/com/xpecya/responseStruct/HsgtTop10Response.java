package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HsgtTop10Response {

    private String trade_date;
    private String ts_code;
    private String name;
    private Float close;
    private Float change;
    private Integer rank;
    private String market_type;
    private Float amount;
    private Float net_amount;
    private Float buy;
    private Float sell;
}
