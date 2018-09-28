package com.zjpicc.api.insurance.controller;

import com.google.common.eventbus.EventBus;
import com.zjpicc.api.insurance.exception.GeneralPiccException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    EventBus eventBus;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public void test(@RequestParam("s") String s) throws GeneralPiccException {
        eventBus.post(s);
    }

}
