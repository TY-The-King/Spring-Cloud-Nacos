package com.king.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TheKing
 * @version 1.0
 * @className NacosConfigComtroller
 * @description
 * @date 2022/7/25 16:32
 */
@RestController
@RefreshScope
public class NacosConfigComtroller {

    @Value("${user.name}")
    String name;

    @Value("${user.age}")
    String age;

    @GetMapping("/get")
    public String getProperties(){
        return "My name is:"+name+" ,age:"+age;
    }
}
