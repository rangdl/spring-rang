package com.rang.web.listener;

import com.rang.core.spring.ApplicationContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;

/**
 * @ClassName ApplicationReadyEventListener
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:30
 * @Version 1.0
 **/
@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent>, Ordered {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        ApplicationContext context = ApplicationContextHolder.getApplicationContext();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        int length = beanDefinitionNames.length;
        log.trace("Spring boot启动初始化了 {} 个 Bean", length);
        log.debug("Spring boot启动初始化了 {} 个 Bean", length);
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
        log.warn("Spring boot启动初始化了 {} 个 Bean", length);
        log.error("Spring boot启动初始化了 {} 个 Bean", length);
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
