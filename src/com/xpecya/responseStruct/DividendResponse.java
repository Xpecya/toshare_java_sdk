package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DividendResponse {

    private String ts_code;
    private String end_date;
    private String ann_date;
    private String div_proc;
    private Float stk_div;
    private Float stk_bo_rate;
    private Float stk_co_rate;
    private Float cash_div;
    private Float cash_div_tax;
    private String record_date;
    private String ex_date;
    private String pay_date;
    private String div_listdate;
    private String imp_ann_date;
    private String base_date;
    private Float base_share;
}
