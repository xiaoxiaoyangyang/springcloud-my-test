package com.example.springcloud.controller;

import com.example.springcloud.entity.Dept;
import com.example.springcloud.service.DeptServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 18:07
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private DeptServiceClient deptService;

    @GetMapping(value = "find")
    public ResponseEntity<List> find(){
        List<Dept> all = deptService.findAll();
        return new ResponseEntity<List>(all,HttpStatus.OK);
    }
}
