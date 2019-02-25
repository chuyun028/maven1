package com.kgc.userControll.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kgc.userControll.pojo.User;

/**
 * 用户持久层
 * @author 思雨
 *
 */
//@Repository("userMapper")
public interface UserMapper {

	/**
	 * 1.查询所有用户信息
	 * @return
	 */
	@Select("SELECT * FROM t_user")
	List<User> getAllUser();
}
