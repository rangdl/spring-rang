package com.rang.web.controller;

import com.rang.core.contant.StatusEnum;
import com.rang.core.exception.JsonException;
import com.rang.core.exception.PageException;
import com.rang.core.model.ResultVO;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName controller
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/3 11:42
 * @Version 1.0
 **/
@RestController
public class TestController {

	@GetMapping("/index")
	public ResultVO index(){
		Map<String,Object> map = new HashMap<>(3);
		map.put("1",123);
		map.put("name","index");
		map.put("path","/index");
		return ResultVO.ofSuccess(map);
	}
	@GetMapping("/hello")
	public Map hello(){
		Map<String,Object> map = new HashMap<>(3);
		map.put("1",123);
		map.put("2","aaa");
		map.put("3","色灯阿森");
		return map;
	}

	@GetMapping("/json")
	public ResultVO jsonException() {
		throw new JsonException(StatusEnum.ERROR);
	}

	@GetMapping("/page")
	public ModelAndView pageException() {
		throw new PageException(StatusEnum.ERROR);
	}
}
