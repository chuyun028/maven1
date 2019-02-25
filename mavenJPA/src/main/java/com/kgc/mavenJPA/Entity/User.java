package com.kgc.mavenJPA.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体类
 * 
 * @author 思雨
 *
 */
@Table(name = "user")
public class User implements Serializable{

	/**
	 * 序列號
	 */
	private static final long serialVersionUID = 5894550264201135762L;

	// id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	// 用户名
	@Column(name = "name")
	private String name;
	
	// 邮箱
	@Column(name = "email")
	private String email;

	
	/**
	 * 默認構造函數
	 */
	public User() {
	}
	

	public User(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
