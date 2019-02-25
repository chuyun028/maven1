package com.waylau.spring.boot.blog.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.waylau.spring.boot.blog.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest
{
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void testQuery()
        throws Exception
    {
        User user = userMapper.getUserById(1L);
        System.out.println(user);
    }
    
    @Test
    public void testQueryAll()
    {
        Page<User> pageInfo = PageHelper.startPage(1, 2);
        List<User> users = userMapper.listUser();
        System.out.println(users);
    }
    
    @Test
    public void testSaveUser()
    {
       User user = new User("lisi","123455",19);
       
       userMapper.saveUser(user);
    }
    
}