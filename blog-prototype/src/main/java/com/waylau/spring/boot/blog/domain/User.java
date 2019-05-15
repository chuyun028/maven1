package com.waylau.spring.boot.blog.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User 实体.
 * 
 * @since 1.0.0 2017年7月9日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Entity // 实体
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5904915455666072856L;
	
	@Id // 主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长策略
	private Long id; // 实体一个唯一标识
	private String name;
	private String email;
	private String pwd;
	

	

	public User() { // 无参构造函数；设为 protected 防止直接使用
	}
	
	
	public User(Long id, String name, String email, String pwd) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
}
