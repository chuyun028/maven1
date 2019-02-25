package com.kgc.mavenJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgc.mavenJPA.Entity.User;
import com.kgc.mavenJPA.respository.UserMapper;
/**
 * 用户逻辑实现层
 * @author 思雨
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Override
	public User findUserByid() {
		// TODO Auto-generated method stub
		return userMapper.findUserByid();
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userMapper.findUsers();
	}

}
