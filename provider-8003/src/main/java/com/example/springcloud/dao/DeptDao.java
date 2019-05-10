package com.example.springcloud.dao;

import com.example.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 16:53
 * @Version 1.0
 */
@Mapper
public interface DeptDao {
    List<Dept> findAll();
}
