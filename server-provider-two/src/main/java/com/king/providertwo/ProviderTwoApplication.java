package com.king.providertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author TheKing
 * @version 1.0
 * @className ProviderTwoApplication
 * @description provider-two service
 * @date 2022/7/26 9:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderTwoApplication.class,args);
    }
}
