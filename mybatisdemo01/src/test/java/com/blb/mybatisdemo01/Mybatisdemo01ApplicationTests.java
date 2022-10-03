package com.blb.mybatisdemo01;

import com.blb.mybatisdemo01.entity.Dept;
import com.blb.mybatisdemo01.entity.Emp;
import com.blb.mybatisdemo01.mapper.DeptMapper;
import com.blb.mybatisdemo01.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisdemo01ApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private DeptMapper deptMapper;


    @Test
    void contextLoads() {
        List<Emp> emps = empMapper.selectList(null);
        System.out.println(emps);
    }

    @Test
    void contextLoads2() {
        empMapper.getEmpAndDept(1);
    }
    @Test
    void contextLoads3() {
        empMapper.selectEmpAndDept(1);
    }

    @Test
    void contextLoads4() {
        deptMapper.mySelectById(1);
    }

    @Test
    void contextLoads5() {
        Dept dept = deptMapper.selectDeptAndEmp(1);
        System.out.println(dept);
    }

}
