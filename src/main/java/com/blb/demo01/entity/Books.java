package com.blb.demo01.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName books
 */
@TableName(value ="books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 书名
     */
    private String bookTitle;

    /**
     * 作者
     */
    private String author;

    /**
     * 字数
     */
    private Integer zishu;

    /**
     * 价格
     */
    private Integer price;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}