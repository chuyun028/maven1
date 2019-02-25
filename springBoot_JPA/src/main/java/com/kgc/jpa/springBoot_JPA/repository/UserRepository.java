package com.kgc.jpa.springBoot_JPA.repository;

import org.springframework.data.repository.CrudRepository;

import com.kgc.jpa.springBoot_JPA.domain.User;

/**
 * 
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年2月20日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface UserRepository extends CrudRepository<User, Long>
{
    
}
