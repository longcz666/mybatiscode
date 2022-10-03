package com.blb.mybatisdemo01.mapper;

import com.blb.mybatisdemo01.entity.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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

}




