package com.kgc.mavenJPAThymeleaf.serviceTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kgc.mavenJPAThymeleaf.entity.User;
import com.kgc.mavenJPAThymeleaf.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MavenJpaThymeleafApplicationTests {

	@Autowired
	UserMapper userMapper;

	/**
	 * 1.增加用户信息 <一句话功能简述> <功能详细描述>
	 * 
	 * @see [类、类#方法、类#成员]
	 */
	@Test
	public void saveTest() {
		User user = new User();
		user.setName("user1110");
		user.setEmail("152@qq.com");
		System.out.println(userMapper.save(user));
	}

	/**
	 * 2.删除用户 <一句话功能简述> <功能详细描述>
	 * 
	 * @see [类、类#方法、类#成员]
	 */
	@Test
	public void deleteTest() {
		Long num = new Long(1);
		userMapper.deleteById(num);
	}

	/**
	 * 3.修改部分数据信息 <一句话功能简述> <功能详细描述>
	 * 
	 * @see [类、类#方法、类#成员]
	 */
	@Test
	public void updataTest() {
		Long num = new Long(2);
//		User user = new User();
//		user.setId(2);
//		user.setName("user22");
//		user.setEmail("1523@qq.com");
		userMapper.updataUser("user2221", num);
	}

	/**
	 * 4.查找所有用户信息
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @see [类、类#方法、类#成员]
	 */
	@Test
	public void findAllUser() {
		System.out.println(userMapper.findAll());
	}
	
	/**
	 * 5.修改部分数据信息--绑定三个参数 <一句话功能简述> <功能详细描述>
	 * 
	 * @see [类、类#方法、类#成员]
	 */
	@Test
	public void updataThreeTest() {
		Long num = new Long(2);
//		User user = new User();
//		user.setId(2);
//		user.setName("user22");
//		user.setEmail("1523@qq.com");
		userMapper.updataUserByThree("user22", "125@qq.com",num);
	}

	/**
	 * 6.修改部分数据信息--对象 <一句话功能简述> <功能详细描述>
	 * 
	 * @see [类、类#方法、类#成员]
	 */
	@Test
	public void updataUserTest() {
		Long num = new Long(2);
		User user = new User();
		user.setId(num);
		user.setName("user22");
		user.setEmail("1523@qq.com");
		userMapper.updataUserByUser(user);
	}
}
