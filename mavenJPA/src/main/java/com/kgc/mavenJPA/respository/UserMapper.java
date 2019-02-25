package com.kgc.mavenJPA.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgc.mavenJPA.Entity.User;

/**
 * 用户持久层
 * @author 思雨
 *
 */
@Repository
public interface UserMapper extends JpaRepository<User, Integer>{

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
