package com.blb.mybatisdemo01.mapper;

import com.blb.mybatisdemo01.entity.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author l'c'z
 * @description 针对表【dept(部门表)】的数据库操作Mapper
 * @createDate 2022-10-03 20:03:14
 * @Entity com.blb.mybatisdemo01.entity.Dept
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

    Dept mySelectById(Integer deptId);

    Dept selectDeptAndEmp(Integer id);

    Dept selectDeptAndEmpStep(Integer did);
}




