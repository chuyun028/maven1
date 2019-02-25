package com.kgc.mavenJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgc.mavenJPA.Entity.User;
import com.kgc.mavenJPA.service.UserService;
/**
 * 视图层
 * @author 思雨
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	/**
	 * 1.根据用户id查询
	 * @return
	 */
	@RequestMapping("/findUserByid")
	public User findUserByid() {
		return userService.findUserByid();
	}
	/**
	 * 2.查询所有用户
	 * @return
	 */
	@RequestMapping("/findUsers")
	public List<User> findUsers() {
		return userService.findUsers();
	}
}
