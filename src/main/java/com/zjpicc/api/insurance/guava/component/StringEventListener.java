package com.zjpicc.api.insurance.guava.component;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

@Component
public class StringEventListener {

    //当注册到的事件总线上发生String消息时，会在控制台输出相应的消息
    @Subscribe
    public void listener(String event){
        System.out.println("recevice msg"+event);
    }
}
