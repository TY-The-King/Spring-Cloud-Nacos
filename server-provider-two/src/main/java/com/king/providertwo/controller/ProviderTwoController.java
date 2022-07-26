package com.king.providertwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TheKing
 * @version 1.0
 * @className ProviderTwoController
 * @description
 * @date 2022/7/26 9:33
 */
@RestController
public class ProviderTwoController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/echo/{str}")
    public String get(@PathVariable String str){
        return "Hello discovery " + str;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "TheKing",required = false) String name){
        return "Hello "+name+"i'm provider,my port is: "+port;
    }
}
