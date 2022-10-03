package com.blb.mybatisdemo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blb.mybatisdemo01.entity.Dept;
import com.blb.mybatisdemo01.service.DeptService;
import com.blb.mybatisdemo01.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
 * @author l'c'z
 * @description 针对表【dept(部门表)】的数据库操作Service实现
 * @createDate 2022-10-03 20:03:14
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
        implements DeptService {

}




