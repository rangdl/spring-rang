package com.rang.server.core.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;

/**
 * 启动监听
 *
 * @ClassName ApplicationReadyEventListener
 * @Author rdl
 * @Date 2021/4/9 8:30
 * @Version 1.0
 **/
public abstract class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent>, Ordered{
    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
