package com.kgc.bokeDemo.repositoryTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.kgc.bokeDemo.entity.User;
import com.kgc.bokeDemo.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BokeDemoApplicationRepositoryTests {

	private static final Log logger = LogFactory.getLog(SpringJUnit4ClassRunner.class);
	//自动装载持久层bean
	@Autowired
	UserRepository userRepository;
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void saveRepositoryTest() {
		logger.info("这是一个用户持久层的增加测试！");
		User user = new User();
		user.setName("user");
		user.setPassword("user123");
		user.setUserName(user.getName()+user.getPassword());
		user.setSalt("1");
		user.setState((byte)0);
//		user.setUserHeadAddress("e:\\image");
	
		userRepository.save(user);
	}

}
