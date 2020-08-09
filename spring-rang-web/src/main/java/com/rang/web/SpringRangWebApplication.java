package com.rang.web;

import com.rang.web.listener.ApplicationReadyEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author rdl
 */
@SpringBootApplication
@MapperScan("com.rang.dao")
@ComponentScan({"com.rang.core","com.rang.service","com.rang.web"})
public class SpringRangWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringRangWebApplication.class, args);
	}
	/**
	 * war包启动
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringRangWebApplication.class);
	}

	/**
	 * 设置监听
	 * @return
	 */
	@Bean
	public ApplicationReadyEventListener applicationReadyEventListener() {
		return new ApplicationReadyEventListener();
	}

	/**
	 * 设置全局UTF-8编码过滤器
	 * @return
	 */
	@Bean
	@Order(Integer.MAX_VALUE)//设置执行先后顺序
	public FilterRegistrationBean<CharacterEncodingFilter> characterFilterRegistration() {
		FilterRegistrationBean<CharacterEncodingFilter> registration = new FilterRegistrationBean<CharacterEncodingFilter>();
		registration.setFilter(new CharacterEncodingFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("characterEncodingFilter");
		return registration;
	}

}
