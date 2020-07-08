package com.rang.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author rdl
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.rang.mapper"})
public class SpringRangWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRangWebApplication.class, args);
	}

}
