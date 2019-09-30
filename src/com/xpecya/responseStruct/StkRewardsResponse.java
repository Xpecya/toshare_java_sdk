package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StkRewardsResponse {

    private String ts_code;
    private String ann_date;
    private String end_date;
    private String name;
    private String title;
    private Float reward;
    private Float hold_vol;
}
