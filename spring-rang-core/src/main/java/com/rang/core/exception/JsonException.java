package com.rang.core.exception;

import com.rang.core.contant.StatusEnum;

/**
 * @ClassName JsonException
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/7 16:02
 * @Version 1.0
 **/
public class JsonException extends BaseException {
    public JsonException(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
