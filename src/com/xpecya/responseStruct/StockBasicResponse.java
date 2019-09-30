package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StockBasicResponse {

    private String ts_code;     // ts代码
    private String symbol;      // 股票代码
    private String name;        // 股票名称
    private String area;        // 所在地域
    private String industry;    // 所属行业
    private String full_name;   // 股票全称
    private String en_name;     // 英文全称
    private String market;      // 市场类型（主板/中小板/创业板/科创板）
    private String exchange;    // 交易所代码
    private String curr_type;   // 交易货币
    private String list_status; // 上市状态 L上市D退市P暂停上市
    private String list_date;   // 上市日期
    private String delist_date; // 退市日期
    private String is_hs;       // 是否沪深港通标的，N否 H沪股通 S深股通
}
