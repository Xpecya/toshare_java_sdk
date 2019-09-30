package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdjFactorResponse {

    private String ts_code;
    private String trade_date;
    private Float adj_factor;
}
