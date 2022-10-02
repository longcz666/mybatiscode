package com.blb.demo01.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blb.demo01.entity.Emp;

/**
* @author l'c'z
* @description 针对表【emp(员工表)】的数据库操作Mapper
* @createDate 2022-10-01 21:20:53
* @Entity com.blb.demo01.entity.Emp
*/
public interface EmpMapper extends BaseMapper<Emp> {

    int insertSelective(Emp emp);
}




