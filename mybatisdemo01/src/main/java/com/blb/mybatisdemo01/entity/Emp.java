package com.blb.mybatisdemo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工表
 * @TableName emp
 */
@TableName(value ="emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职位
     */
    private String job;

    /**
     * 薪资
     */
    private Integer salary;

    /**
     * 入职时间
     */
    private Date entrydate;

    /**
     * 直属领导ID
     */
    private Integer managerid;

    /**
     * 部门ID
     */
    private Integer deptId;

    private Dept dept;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}