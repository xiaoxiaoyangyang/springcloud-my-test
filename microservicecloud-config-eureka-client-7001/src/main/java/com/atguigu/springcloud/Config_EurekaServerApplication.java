package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/22 14:57
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Config_EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Config_EurekaServerApplication.class,args);
    }
}
