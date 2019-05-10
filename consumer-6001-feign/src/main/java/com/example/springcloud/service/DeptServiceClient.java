package com.example.springcloud.service;

import com.example.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:25
 * @Version 1.0
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER")
public interface DeptServiceClient {

    @GetMapping(value = "/findAll")
    List<Dept> findAll();
}