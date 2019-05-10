package com.example.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/3 12:06
 * @Version 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule iRule(){
        return new MySelfRandomRule();
    }
}
