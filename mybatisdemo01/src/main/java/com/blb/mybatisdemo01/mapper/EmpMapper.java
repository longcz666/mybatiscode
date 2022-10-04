package com.blb.mybatisdemo01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blb.mybatisdemo01.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author l'c'z
* @description 针对表【emp(员工表)】的数据库操作Mapper
* @createDate 2022-10-03 20:02:31
* @Entity com.blb.mybatisdemo01.entity.Emp
*/
@Mapper
public interface EmpMapper extends BaseMapper<Emp> {

    Emp getEmpAndDept(Integer id);

    Emp selectEmpAndDept(Integer id);

    List<Emp> selectEmpAndDeptTwo(@Param("did") Integer did);

    @Select("select * from duobiaochaxun.emp where id = #{id}")
    Emp mySelectById(Integer id);

    Page<Emp> selectAllByPage(Page<Emp> page,Integer age);

}




