package com.kgc.userControll.service;

import java.util.List;

import com.kgc.userControll.pojo.User;
/**
 * 用户逻辑层接口
 * @author 思雨
 *
 */
public interface UserService {

	/**
	 * 1.查询所有用户接口
	 * @return
	 */
	List<User> getAllUser();
}
