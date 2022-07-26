package com.king.consumer.controller;

import com.king.consumer.service.FeignClineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author TheKing
 * @version 1.0
 * @className ConsumerController
 * @description
 * @date 2022/7/26 9:35
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignClineService feignClineService;

    /**
     * RestTemplate方式
     * @param str pathValue
     * @return String
     */
    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://server-provider/echo/" + str, String.class);
    }

    /**
     * Openfeign方式
     * @return String
     */
    @GetMapping("/hi-feign")
    public String feign(){
        return feignClineService.hi("feign");
    }

}
