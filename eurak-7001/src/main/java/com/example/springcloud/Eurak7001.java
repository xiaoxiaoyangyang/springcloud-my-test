package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:17
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Eurak7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eurak7001.class,args);
    }
}
