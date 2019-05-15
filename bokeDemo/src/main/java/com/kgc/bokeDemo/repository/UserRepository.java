package com.kgc.bokeDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgc.bokeDemo.entity.User;
/**
 * 
 * <用户信息持久层操作>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月1日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
