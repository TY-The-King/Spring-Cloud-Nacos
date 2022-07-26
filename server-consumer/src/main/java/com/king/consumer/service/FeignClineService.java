package com.king.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author theking
 * @date 2022/7/26 10:37
 */
@FeignClient(value = "server-provider")
public interface FeignClineService {

    /**
     * FeignClineService
     * @author TheKing
     * @date 2022/7/26 10:49
     * @param name my name
     * @return java.lang.String
     */
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "TheKing", required = false) String name);
}
