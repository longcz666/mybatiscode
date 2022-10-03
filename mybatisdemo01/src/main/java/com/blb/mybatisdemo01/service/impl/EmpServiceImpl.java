package com.blb.mybatisdemo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blb.mybatisdemo01.entity.Emp;
import com.blb.mybatisdemo01.service.EmpService;
import com.blb.mybatisdemo01.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author l'c'z
* @description 针对表【emp(员工表)】的数据库操作Service实现
* @createDate 2022-10-03 20:02:31
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




