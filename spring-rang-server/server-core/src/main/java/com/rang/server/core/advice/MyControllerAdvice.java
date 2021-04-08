package com.rang.server.core.advice;

import com.rang.server.core.annos.ResponseResultBody;
import com.rang.server.core.contant.StatusEnum;
import com.rang.server.core.exception.BaseException;
import com.rang.server.core.model.ResultVO;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.annotation.Annotation;

/**
 * 全局异常处理
 *
 * @ClassName MyControllerAdvice
 * @Author rdl
 * @Date 2021/4/8 18:46
 * @Version 1.0
 **/
@ControllerAdvice
public class MyControllerAdvice implements ResponseBodyAdvice<Object> {
    private static final Class<? extends Annotation> ANNOTATION_TYPE = ResponseResultBody.class;

    /**
     * 判断类或者方法是否使用了 @ResponseResultBody
     */
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return AnnotatedElementUtils.hasAnnotation(returnType.getContainingClass(), ANNOTATION_TYPE) || returnType.hasMethodAnnotation(ANNOTATION_TYPE);
    }

    /**
     * 当类或者方法使用了 @ResponseResultBody 就会调用这个方法
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        // 防止重复包裹的问题出现
        if (body instanceof ResultVO) {
            return body;
        }
        return ResultVO.ofSuccess(body);
    }

    /**
     * 统一 json 异常处理
     *
     * @param e BaseException
     * @return 统一返回异常信息
     */
    @ResponseBody
    @ExceptionHandler(value = BaseException.class)
    public ResultVO BaseExceptionHandler(BaseException e) {
        return ResultVO.ofException(e);
    }
    /**
     * 统一 数据绑定 异常处理
     *
     * @param e ServletRequestBindingException
     * @return 统一返回异常信息
     */
    @ResponseBody
    @ExceptionHandler(value = ServletRequestBindingException.class)
    public ResultVO ServletRequestBindingExceptionHandler(ServletRequestBindingException e) {
        return ResultVO.ofStatus(StatusEnum.DATA_VALIDATION_ERROR,e.getLocalizedMessage());
    }

    /**
     * 统一 异常处理
     *
     * @param e Exception
     * @return 统一返回 json 格式
     */
    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    public ResultVO ExceptionHandler(RuntimeException e) {
        e.printStackTrace();
        return ResultVO.ofStatus(StatusEnum.ERROR,e.getLocalizedMessage());
    }
}
