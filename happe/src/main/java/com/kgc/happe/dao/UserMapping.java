package com.kgc.happe.dao;

import org.apache.ibatis.annotations.Select;

public interface UserMapping {

	@Select("select * from ")
	public int selectAllUser();
}
