package com.rang.web.handler;

import com.rang.core.exception.JsonException;
import com.rang.core.exception.PageException;
import com.rang.core.model.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName WebExceptionHandler
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/7 16:01
 * @Version 1.0
 **/
@ControllerAdvice
@Slf4j
public class WebExceptionHandler {
    private static final String DEFAULT_ERROR_VIEW = "error";


    /**
     * 统一 页面 异常处理
     *
     * @param exception PageException
     * @return 统一跳转到异常页面
     */
    @ExceptionHandler(value = PageException.class)
    public ModelAndView pageErrorHandler(PageException exception) {
        log.error("【PageException】:{}", exception.getMessage());
        ModelAndView view = new ModelAndView();
        view.addObject("code", exception.getCode());
        view.addObject("message", exception.getMessage());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;
    }

    /**
     * 统一 json 异常处理
     *
     * @param exception JsonException
     * @return 统一返回 json 格式
     */
    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public ResultVO jsonErrorHandler(JsonException exception) {
        log.error("【JsonException】:{}", exception.getMessage());
        return ResultVO.ofException(exception);
    }

}
