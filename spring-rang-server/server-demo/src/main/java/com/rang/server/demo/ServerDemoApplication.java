package com.rang.server.demo;

import com.rang.server.core.listener.ApplicationReadyEventListener;
import com.rang.server.core.spring.ApplicationContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;

@Slf4j
@SpringBootApplication
//@MapperScan("com.pt.gdxl.trans.dao")
@ComponentScan({"com.rang.server", "com.rang.server.core"})
public class ServerDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}

	/**
	 * war包启动
	 *
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ServerDemoApplication.class);
	}

	/**
	 * 设置监听
	 *
	 * @return
	 */
	@Bean
	public ApplicationListener applicationReadyEventListener() {
		return new ApplicationReadyEventListener() {
			@Override
			public void onApplicationEvent(ApplicationReadyEvent event) {
				ApplicationContext context = ApplicationContextHolder.getApplicationContext();
				String[] beanDefinitionNames = context.getBeanDefinitionNames();
				int length = beanDefinitionNames.length;
				log.trace("Spring boot启动初始化了 {} 个 Bean", length);
				log.debug("Spring boot启动初始化了 {} 个 Bean", length);
				log.info("Spring boot启动初始化了 {} 个 Bean", length);
				log.warn("Spring boot启动初始化了 {} 个 Bean", length);
				log.error("Spring boot启动初始化了 {} 个 Bean", length);
				//CronUtil.setMatchSecond(true);
				//CronUtil.start();
				//log.info("定时任务开启!");
			}
		};
	}

	/**
	 * 设置全局UTF-8编码过滤器
	 *
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
