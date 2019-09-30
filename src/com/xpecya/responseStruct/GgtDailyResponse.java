package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GgtDailyResponse {

    private String trade_date;
    private Float buy_amount;
    private Float buy_volume;
    private Float sell_amount;
    private Float sell_volume;
}
