package com.xpecya.requestStruct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicRequest<T> {

    // 接口名称
    private String api_name;

    // 用户唯一标识
    private String token;

    // 接口参数
    private T params;

    // 返回值字段数量
    private String fields;
}
