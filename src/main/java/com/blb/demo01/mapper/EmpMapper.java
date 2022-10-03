package com.blb.demo01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blb.demo01.entity.Emp;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author l'c'z
* @description 针对表【emp(员工表)】的数据库操作Mapper
* @createDate 2022-10-01 21:20:53
* @Entity com.blb.demo01.entity.Emp
*/
@Mapper
public interface EmpMapper extends BaseMapper<Emp> {

    int insertSelective(Emp emp);

    Emp selectByNameAndAge(String name, Integer age);

    Emp selectByNameAndAge(Emp emp);

    @MapKey("id")
    Map<String,Object> selectAllMap();

    List<Emp> selectLikeByName(String name);

    int deleteByIds(List<Integer> ids);

    int myInsert(Emp emp);
}




