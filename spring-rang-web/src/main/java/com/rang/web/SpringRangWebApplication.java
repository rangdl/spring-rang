package com.rang.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author rdl
 */
@SpringBootApplication
@MapperScan("com.rang.dao")
@ComponentScan({"com.rang.service","com.rang.web"})
@Slf4j
public class SpringRangWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRangWebApplication.class, args);
		int length = context.getBeanDefinitionNames().length;
		log.trace("Spring boot启动初始化了 {} 个 Bean", length);
		log.debug("Spring boot启动初始化了 {} 个 Bean", length);
		log.info("Spring boot启动初始化了 {} 个 Bean", length);
		log.warn("Spring boot启动初始化了 {} 个 Bean", length);
		log.error("Spring boot启动初始化了 {} 个 Bean", length);
	}

}
