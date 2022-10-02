package com.blb.demo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blb.demo01.entity.Books;
import com.blb.demo01.service.BooksService;
import com.blb.demo01.mapper.BooksMapper;
import org.springframework.stereotype.Service;

/**
 * @author l'c'z
 * @description 针对表【books】的数据库操作Service实现
 * @createDate 2022-10-01 21:22:17
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books>
        implements BooksService {

}




