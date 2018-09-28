package com.zjpicc.api.insurance.base;

import lombok.Data;

@Data
public class GeneralErrorInfo<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 0;

    private Integer code;
    private String message;
    private T data;
}
