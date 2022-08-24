package com.vegetable.entity;

import com.vegetable.config.Result;

public class BusinessException extends RuntimeException {
    private final int code;

    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description=description;
    }
    public BusinessException(Result<?> resultCode, String description) {
        super(resultCode.getMsg());
        this.code = resultCode.getCode();
        this.description=description;
    }
}

