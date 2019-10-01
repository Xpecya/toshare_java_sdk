package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpressResponse {

    private String ts_code;
    private String ann_date;
    private String end_date;
    private Float revenue;
    private Float operate_profit;
    private Float total_profit;
    private Float n_income;
    private Float total_assets;
    private Float total_hldr_eqy_exc_min_int;
    private Float diluted_eps;
    private Float diluted_roe;
    private Float yoy_net_profit;
    private Float bps;
    private Float yoy_sales;
    private Float yoy_op;
    private Float yoy_tp;
    private Float yoy_dedu_np;
    private Float yoy_eps;
    private Float yoy_roe;
    private Float growth_assets;
    private Float yoy_equity;
    private Float growth_bps;
    private Float or_last_year;
    private Float op_last_year;
    private Float tp_last_year;
    private Float np_last_year;
    private Float eps_last_year;
    private Float open_net_assets;
    private Float open_bps;
    private Float perf_summary;
    private Float is_audit;
    private Float remark;
}
