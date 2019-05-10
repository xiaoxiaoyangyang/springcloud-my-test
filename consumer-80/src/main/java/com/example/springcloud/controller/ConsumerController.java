package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 18:07
 * @Version 1.0
 */
@RestController
public class ConsumerController {
//    public final static String url="http://localhost:8001";
    public final static String url="http://SPRINGCLOUD-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "findAll")
    public ResponseEntity<List> findAll(){
        String findAll = String.format("%s/%s", url, "findAll");
        ResponseEntity<List> forEntity = restTemplate.getForEntity(findAll, List.class);
        return forEntity;
    }
}
