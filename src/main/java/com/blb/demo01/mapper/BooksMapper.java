package com.blb.demo01.mapper;

import com.blb.demo01.entity.Books;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author l'c'z
* @description 针对表【books】的数据库操作Mapper
* @createDate 2022-10-01 21:22:17
* @Entity com.blb.demo01.entity.Books
*/
@Mapper
public interface BooksMapper extends BaseMapper<Books> {

    List<Books> mySelectedBooks();

}




