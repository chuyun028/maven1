package com.kgc.userControll.serviceTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kgc.userControll.dao.UserMapper;
import com.kgc.userControll.service.UserService;
/**
 * dao层测试
 * @author 思雨
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllApplicationServiceTests {

	@Autowired
    private UserService userService;
	@Test
	public void getAllUserService() {
		System.out.println(userService.getAllUser());
	}

}
