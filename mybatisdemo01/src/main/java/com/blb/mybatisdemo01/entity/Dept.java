package com.blb.mybatisdemo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 部门表
 * @TableName dept
 */
@TableName(value ="dept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    private List<Emp> emps;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}