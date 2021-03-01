package com.rang.core.exception;

import com.rang.core.contant.StatusEnum;

/**
 * 全局基础异常类
 *
 * @ClassName BaseException
 * @Author rdl
 * @Date 2020/6/20 16:18
 * @Version 1.0
 **/

public class BaseException extends RuntimeException {
    private Integer code;
    private String message;

    public BaseException(StatusEnum statusEnum) {
        super(statusEnum.getMessage());
        this.code = statusEnum.getCode();
        this.message = statusEnum.getMessage();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
