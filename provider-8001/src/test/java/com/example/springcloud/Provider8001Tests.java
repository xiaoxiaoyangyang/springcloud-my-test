package com.example.springcloud;

import com.alibaba.fastjson.JSON;
import com.example.springcloud.dao.DeptDao;
import com.example.springcloud.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 17:28
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Provider8001Tests {
    @Autowired
    private DeptDao deptDao;
    @Test
    public void contextLoad(){
        List<Dept> all = deptDao.findAll();
        System.out.println(all.toString());

    }
}
