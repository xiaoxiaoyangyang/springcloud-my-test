package com.example.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 18:05
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {
    @Bean(value = "restTemplate")
    @LoadBalanced
    public RestTemplate getRest(){
        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory());
        return restTemplate;

    }
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(5000);
        return factory;
    }

    @Bean
    public IRule getIRule(){
        return new RoundRobinRule();
    }
}
