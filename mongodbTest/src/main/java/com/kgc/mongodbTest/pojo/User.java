package com.kgc.mongodbTest.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 用户实体类
 * 
 * @author 思雨
 *
 */
@Entity
@Table(name="users")
public class User implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -640360565540699680L;

	//id
	@Id
	@Column(name = "id")
	private Integer id;
	//姓名
	@Column(name = "name")
	private String name;
	//密码
	@Column(name = "pwd")
	private String pwd;
	
	
	public User() {
	}
	
	public User(Integer id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}
