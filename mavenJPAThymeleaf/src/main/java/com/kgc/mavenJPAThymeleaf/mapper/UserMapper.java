package com.kgc.mavenJPAThymeleaf.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kgc.mavenJPAThymeleaf.entity.User;

@Repository
public interface UserMapper extends JpaRepository<User, Long> {

//	@Transactional
//	@Modifying
//	@Query("update user as c set c.name = ?1 where c.userid=?2")
//	int updataUser(String name, long id);
	
	/**
	 * 1.绑定2个参数修改用户信息
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @param name
	 * @param id
	 * @return
	 * @see [类、类#方法、类#成员]
	 */
	@Transactional
	@Modifying
	@Query(value = "UPDATE User U SET U.name = :name WHERE U.id = :id")
	int updataUser(@Param("name") String name  , @Param("id") long id);
//	@Transactional
//	@Query(value=“UPDATE xxEntity xe SET xe.data= :date WHERE xe.id= :id”）
//    int  update(@Param（“date”）Date date，@Param（“id”）int id)；
	
	/**
	 * 2.绑定3个参数修改用户信息
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @param user
	 * @return
	 * @see [类、类#方法、类#成员]
	 */
	@Transactional
	@Modifying
	@Query(value = "UPDATE User U SET U.name = :name ,U.email = :email WHERE U.id = :id")
	int updataUserByThree(@Param("name") String name  ,@Param("email") String email  , @Param("id") long id);
	
	/**
	 * 3.绑定对象修改用户信息--sql语句错误
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @param user
	 * @return
	 * @see [类、类#方法、类#成员]
	 */
	@Transactional
	@Modifying
	@Query(value = "UPDATE User U SET U.name = :#{#user.name} ,U.email = :#{#user.email} WHERE U.id = :#{#user.id}")
	int updataUserByUser(User user);
}
