package com.rang.core.exception;

import com.rang.core.contant.StatusEnum;

/**
 * 页面异常
 *
 * @ClassName PageException
 * @Author rdl
 * @Date 2020/7/7 15:57
 * @Version 1.0
 **/
public class PageException extends BaseException {

    public PageException(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public PageException(Integer code, String message) {
        super(code, message);
    }
}
