package com.kgc.userControll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.userControll.dao.UserMapper;
import com.kgc.userControll.pojo.User;

@Service("userService")
public class UserServiceImple implements UserService {

	@Autowired
	UserMapper userMapper;
	/**
	 * 1.查询所有用户逻辑层方法
	 */
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		PageHelper.startPage(1,2);
		
		List<User> list = userMapper.getAllUser();
		
		//得到分页的结果对象
        PageInfo<User> personPageInfo = new PageInfo<>(list);
        //得到分页中的person条目对象
        List<User> pageList = personPageInfo.getList();

		
		
		return pageList;
	}

}
