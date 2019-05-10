package com.example.springcloud.service;

import com.example.springcloud.entity.Dept;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:25
 * @Version 1.0
 */
public interface DeptService {
    List<Dept> findAll();
}
