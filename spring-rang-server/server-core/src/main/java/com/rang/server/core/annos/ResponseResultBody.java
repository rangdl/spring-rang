package com.rang.server.core.annos;

import java.lang.annotation.*;

/**
 * 返回注解
 *
 * @ClassName ResponseResultBody
 * @Author rdl
 * @Date 2021/4/8 18:49
 * @Version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@ResponseBody//继承
public @interface ResponseResultBody {
}
