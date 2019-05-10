package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 18:00
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer6001Test{
    public static void main(String[] args) {
        SpringApplication.run(Consumer6001Test.class,args);
    }
}
