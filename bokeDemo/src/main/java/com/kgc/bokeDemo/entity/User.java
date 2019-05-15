package com.kgc.bokeDemo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * 
 * <用户实体类> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2019年3月1日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Entity(name = "User")
public class User implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2847099946674932976L;
	// id
	@Id
	@GeneratedValue
	private Integer userId;
	// 唯一标识-不重复
	@Column(unique = true)
	private String userName;
	// 用户姓名，账号
	private String name;
	// 用户登录密码
	private String password;
	// 密码加密盐
	private String salt;
	// 用户状态
	private byte state;
	// 用户头像地址
	private String userHeadAddress;
	// 立即从数据库中进行加载数据;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "UserRole", joinColumns = { @JoinColumn(name = "userId") }, inverseJoinColumns = {
			@JoinColumn(name = "roleId") })
	// 一个用户具有多个角色
	private List<Role> roleList;

	/**
	 * 
	 * <默认构造函数>
	 */
	public User() {
	}

	public User(Integer userId, String userName, String name, String password, String salt, byte state,
			String userHeadAddress, List<Role> roleList) {
		this.userId = userId;
		this.userName = userName;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.state = state;
		this.userHeadAddress = userHeadAddress;
		this.roleList = roleList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public String getUserHeadAddress() {
		return userHeadAddress;
	}

	public void setUserHeadAddress(String userHeadAddress) {
		this.userHeadAddress = userHeadAddress;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", name=" + name + ", password=" + password
				+ ", salt=" + salt + ", state=" + state + ", userHeadAddress=" + userHeadAddress + ", roleList="
				+ roleList + "]";
	}

}
