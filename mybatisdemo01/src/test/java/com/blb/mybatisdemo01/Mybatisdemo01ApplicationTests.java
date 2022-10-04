package com.blb.mybatisdemo01;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        Emp empAndDept = empMapper.getEmpAndDept(1);
        System.out.println(empAndDept);
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

    @Test
    void contextLoads6() {
        Dept dept = deptMapper.selectDeptAndEmpStep(1);
        System.out.println(dept);
    }


    @Test
    void contextLoads7() {
        empMapper.selectEmpAndDeptTwo(1);
    }

    @Test
    void contextLoads8() {
        Emp emp = empMapper.mySelectById(1);
        System.out.println(emp);
        Emp emp1 = empMapper.mySelectById(1);
        System.out.println(emp1);
        boolean flag = emp.equals(emp1);
        System.out.println(flag);
    }

    @Test
    void contextLoads9() {
        Page<Emp> empPage = new Page<>(1, 3);
        Page<Emp> empPage1 = empMapper.selectAllByPage(empPage, 20);
        System.out.println(empPage1);
    }

}
