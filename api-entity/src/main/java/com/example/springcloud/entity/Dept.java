package com.example.springcloud.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/2 16:42
 * @Version 1.0
 */

public class Dept{
    private Long deptno;
    private String dname;
    private String db_source;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
