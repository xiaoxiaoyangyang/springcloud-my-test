package com.example.springcloud.service.impl;

import com.example.springcloud.dao.DeptDao;
import com.example.springcloud.entity.Dept;
import com.example.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:25
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> findAll() {
        List<Dept> all = deptDao.findAll();
        return all;
    }
}
