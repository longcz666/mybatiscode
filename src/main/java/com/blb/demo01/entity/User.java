package com.blb.demo01.entity;


import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * 用户表(User)表实体类
 *
 * @author makejava
 * @since 2022-10-01 15:30:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends Model<User> {
    //编号
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //性别
    private String sex;
    //版本号
    @Version
    private Integer version;

}

