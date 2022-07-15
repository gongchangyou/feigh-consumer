package com.mouse.feign_consumer.controller;

import com.mouse.feigndemo.intf.StuRpcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/7/15 21:07
 */
@Slf4j
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private StuRpcService stuRpcService;

    @RequestMapping("feign")
    int add(int a , int b) {
        return stuRpcService.add(a, b);
    }

}
