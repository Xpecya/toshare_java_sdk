package com.xpecya.responseStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicResponse {

    private Integer code;
    private String msg;
    private BasicData data;
}
