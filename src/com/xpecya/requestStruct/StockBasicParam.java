package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockBasicParam implements Param {

    // 是否沪深港通标的
    // N: 否
    // H: 港股通
    // S: 深股通
    private String is_hs;

    // 上市状态
    // L: 上市
    // D: 退市
    // P: 暂停上市
    private String list_status;

    // 交易所
    // SSE: 上交所
    // SZSE: 深交所
    // HKEX: 港交所
    private String exchange;

    @Override
    public String getApiName() {
        return "stock_basic";
    }
}
