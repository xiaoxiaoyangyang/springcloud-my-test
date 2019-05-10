package com.example.springcloud.controller;

import com.example.springcloud.entity.Dept;
import com.example.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:50
 * @Version 1.0
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping(value = "findAll")
    public ResponseEntity<List<Dept>> findAll(){
        List<Dept> all = deptService.findAll();
        ResponseEntity<List<Dept>> li = new ResponseEntity<>(all, HttpStatus.OK);
        return li;
    }
}
