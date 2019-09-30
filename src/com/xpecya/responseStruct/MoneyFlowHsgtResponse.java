package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoneyFlowHsgtResponse {

    private String trade_date;
    private String ggt_ss;
    private String ggt_sz;
    private String hgt;
    private String sgt;
    private String north_money;
    private String south_money;
}
