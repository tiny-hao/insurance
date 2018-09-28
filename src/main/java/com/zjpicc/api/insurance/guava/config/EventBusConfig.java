package com.zjpicc.api.insurance.guava.config;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventBusConfig {

    //定义事件总线bean
    @Bean("_baseEventBus")
    public EventBus eventBus(){
        return new EventBus();
    }
}
