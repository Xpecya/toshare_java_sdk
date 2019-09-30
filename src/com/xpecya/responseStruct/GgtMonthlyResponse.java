package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GgtMonthlyResponse {

    private String month;
    private Float day_buy_amt;
    private Float day_buy_vol;
    private Float day_sell_amt;
    private Float day_sell_vol;
    private Float total_buy_amt;
    private Float total_buy_vol;
    private Float total_sell_amt;
    private Float total_sell_vol;
}
