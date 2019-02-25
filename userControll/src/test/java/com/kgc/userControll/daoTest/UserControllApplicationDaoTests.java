package com.kgc.userControll.daoTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kgc.userControll.dao.UserMapper;
/**
 * dao层测试
 * @author 思雨
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllApplicationDaoTests {

	@Autowired
    private UserMapper userMapper;
	@Test
	public void getAllUserDao() {
		System.out.println(userMapper.getAllUser());
	}

}
