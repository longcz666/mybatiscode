package com.blb.demo01;

import com.blb.demo01.entity.Books;
import com.blb.demo01.entity.Emp;
import com.blb.demo01.mapper.BooksMapper;
import com.blb.demo01.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CRUDTest {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private BooksMapper booksMapper;

    @Test
    void test01() {
        Emp 卡莎 = empMapper.selectByNameAndAge("卡莎", 18);
        System.out.println(卡莎);
    }

    @Test
    void test02() {
        Emp emp = new Emp();
        emp.setName("卡莎");
        emp.setAge(18);
        Emp emp1 = empMapper.selectByNameAndAge(emp);
        System.out.println(emp1);
    }

    @Test
    void test03() {
        System.out.println(empMapper.selectAllMap());
    }

    @Test
    void test04() {
        System.out.println(empMapper.selectLikeByName("卡"));
    }

    @Test
    void test05() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(empMapper.deleteBatchIds(list));
    }
    @Test
    void test06() {
        Emp 辉夜 = new Emp("辉夜", 16);
        empMapper.myInsert(辉夜);
        System.out.println(辉夜);
    }
    @Test
    void test07() {
        List<Books> books = booksMapper.selectList(null);
        System.out.println(books);
    }

    @Test
    void test08() {
        List<Books> books = booksMapper.mySelectedBooks();
        System.out.println(books);
    }
}
