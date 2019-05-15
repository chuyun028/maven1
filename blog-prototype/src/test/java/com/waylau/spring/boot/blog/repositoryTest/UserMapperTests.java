package com.waylau.spring.boot.blog.repositoryTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.waylau.spring.boot.blog.domain.User;
import com.waylau.spring.boot.blog.repository.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

	@Autowired
	UserRepository userRepository;
	
	@Test
	public void findAllUserTest() {
		User user = new User();
		System.out.println(userRepository.findAll());
	}
	
}
