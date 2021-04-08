package com.rang.server.core.model;

import com.rang.server.core.contant.StatusEnum;
import com.rang.server.core.exception.BaseException;
import com.sun.istack.internal.Nullable;

import java.io.Serializable;

/**
 * @ClassName ResultVO
 * @Description 接口返回类型
 * @Author rdl
 * @Date 2020/6/20 15:44
 * @Version 1.0
 **/
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 1696194043024336235L;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回内容
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 无参构造函数
     */
    private ResultVO() {

    }

    /**
     * 全参构造函数
     *
     * @param code    状态码
     * @param message 返回内容
     * @param data    返回数据
     */
    private ResultVO(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 构造一个自定义的API返回
     *
     * @param code    状态码
     * @param message 返回内容
     * @param data    返回数据
     * @return ResultVO
     */
    public static <T> ResultVO<T> of(Integer code, String message, @Nullable T data) {
        return new ResultVO(code, message, data);
    }

    /**
     * 构造一个成功不带数据的API返回
     *
     * @return ResultVO
     */
    public static <T> ResultVO<T> ofSuccess() {
        return ofStatus(StatusEnum.SUCCESS);
    }

    /**
     * 构造一个成功且带数据的API返回
     *
     * @param data 返回数据
     * @return ResultVO
     */
    public static <T> ResultVO<T> ofSuccess(@Nullable T data) {
        return ofStatus(StatusEnum.SUCCESS, data);
    }

    /**
     * 构造一个成功且自定义消息的API返回
     *
     * @param message 返回内容
     * @return ResultVO
     */
    public static <T> ResultVO<T> ofMessage(String message) {
        return of(StatusEnum.SUCCESS.getCode(), message, null);
    }

    /**
     * 构造一个有状态的API返回
     *
     * @param statusEnum 状态 {@link StatusEnum}
     * @return ResultVO
     */
    public static <T> ResultVO<T> ofStatus(StatusEnum statusEnum) {
        return ofStatus(statusEnum, null);
    }

    /**
     * 构造一个有状态且带数据的API返回
     *
     * @param statusEnum 状态 {@link StatusEnum}
     * @param data       返回数据
     * @return ResultVO
     */
    public static <T> ResultVO<T> ofStatus(StatusEnum statusEnum, @Nullable T data) {
        return of(statusEnum.getCode(), statusEnum.getMessage(), data);
    }

    /**
     * 构造一个异常且带数据的API返回
     *
     * @param t    异常
     * @param data 返回数据
     * @param <T>  {@link BaseException} 的子类
     * @return ResultVO
     */
    public static <T extends BaseException> ResultVO<T> ofException(T t, @Nullable T data) {
        return of(t.getCode(), t.getMessage(), data);
    }

    /**
     * 构造一个异常且带数据的API返回
     *
     * @param t   异常
     * @param <T> {@link BaseException} 的子类
     * @return ResultVO
     */
    public static <T extends BaseException> ResultVO<T> ofException(T t) {
        return ofException(t, null);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
