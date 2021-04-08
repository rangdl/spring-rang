package com.rang.server.core.contant;

/**
 * @ClassName StatusEnum
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/7 10:27
 * @Version 1.0
 **/
public enum StatusEnum {
    /**
     * 操作成功
     */
    SUCCESS(20000, "请求成功!"),

    /**
     * 未知异常
     */
    ERROR(50000, "服务器出错!"),
    DATA_VALIDATION_ERROR(50002, "数据验证异常!");

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 内容
     */
    private String message;

    StatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
