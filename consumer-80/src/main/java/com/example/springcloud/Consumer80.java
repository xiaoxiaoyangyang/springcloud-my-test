package com.example.springcloud;

import com.example.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 18:00
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER",configuration = MySelfRule.class)
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class,args);
    }
}
