package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:24
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider8001 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001.class,args);
    }
}
