package com.kgc.mavenJPA.service;

import java.util.List;

import com.kgc.mavenJPA.Entity.User;

public interface UserService {

	/**
	 * 1.根据用户id查询
	 * @return
	 */
	User findUserByid();
	
	/**
	 * 2.查询所有用户
	 * @return
	 */
	List<User> findUsers();
}
