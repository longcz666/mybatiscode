package com.blb.demo01;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blb.demo01.dao.UserDao;
import com.blb.demo01.entity.User;
import com.blb.demo01.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class Demo01ApplicationTests {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    User user1 = new User();

    @Test
    void contextLoads() {

        for (int i = 0; i < 10; i++) {
            user1.setName("李煜" + i);
            user1.setAge(18 + i);
            user1.setSex("男");
            userDao.insert(user1);
        }
    }

    @Test
    void test01() {
        user1.setName("male");
        user1.setAge(18);
        user1.setSex("男");
        userDao.myInsert(user1);
    }

    @Test
    void test02() {
        /*user1.setName("male");
        user1.setAge(18);
        user1.setSex("男");
        userService.save(user1);*/
        int count = userService.count();
        System.out.println(count);

    }

    @Test
    void test03() {
        String name = "李";
        Integer ageB = null;
        Integer ageE = 18;
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(StringUtils.isNotColumnName(name), User::getName, name)
                .ge(false, User::getAge, ageB)
                .le(true, User::getAge, ageE);
        List<User> users = userDao.selectList(lqw);
        users.forEach(System.out::println);
    }

    @Test
    void test04() {
        Integer ageE = 16;
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.ge(User::getAge, ageE);
        IPage<User> iPage = new Page<>(2, 3);
        userDao.selectPage(iPage, lqw);
        System.out.println(iPage.getPages());
    }

    @Test
    void test05() {
        Page<User> page = new Page<>(1, 3);
        userDao.selectAllByAge(page, 20, 30);
    }

    @Test
    void test06() {

        User user = userDao.selectByName("李煜");
        User user2 = userDao.selectByName("李煜");

        user.setAge(user.getAge() + 1);
        userDao.updateById(user);

        user2.setAge(user2.getAge() + 1);
        int i = userDao.updateById(user2);
        if (i == 0) {
            User user3 = userDao.selectByName("李煜");
            user3.setAge(user3.getAge() + 1);
            userDao.updateById(user3);
        }
    }

}
