package com.kgc.mongodbTest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kgc.mongodbTest.pojo.User;
@Repository
@Component
public interface UserMapper extends JpaRepository<User, Long>{

	@Query("db.users.find()")
	List<User> findAllUser();
}
