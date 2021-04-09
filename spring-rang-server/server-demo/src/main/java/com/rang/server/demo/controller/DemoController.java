package com.rang.server.demo.controller;

import com.rang.server.core.annos.ResponseResultBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试
 *
 * @ClassName DemoController
 * @Author rdl
 * @Date 2021/4/9 8:27
 * @Version 1.0
 **/
@Controller
public class DemoController {

    @ResponseResultBody
    @GetMapping("")
    public Integer test(@RequestParam Integer i){
        return i;
    }
}
