package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TradeCalResponse {

    private String exchange;
    private String cal_date;
    private String is_open;
    private String pretrade_date;
}
