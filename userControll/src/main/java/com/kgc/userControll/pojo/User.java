package com.kgc.userControll.pojo;

import java.io.Serializable;

/**
 * 用户类
 * 
 * @author 思雨
 *
 */
public class User implements Serializable {

	/**
	 * 序列化编号
	 */
	private static final long serialVersionUID = -1743068271057814755L;

	// ID
	private int id;

	// 姓名
	private String name;

	// 邮件
	private String email;

	/**
	 * 构造函数
	 */
	public User() {
		super();
	}

	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
}
