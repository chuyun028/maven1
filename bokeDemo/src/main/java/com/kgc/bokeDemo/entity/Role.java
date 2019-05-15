package com.kgc.bokeDemo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


/**
 * 
 * <用户角色表> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2019年3月1日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Entity
public class Role implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8546131236543773442L;

	// 角色id、
	@Id
	@GeneratedValue
	private Integer roleId;

	// 角色名字
	private String roleName;
	// 角色创建时间
	private Date creatTime;
	// 角色更新时间
	private Date updataTime;
	// 角色描述,UI界面显示使用
	private String description;
	// 是否可用,如果不可用将不会添加给用户
	private Boolean available = Boolean.FALSE;
	// 角色 -- 权限关系：多对多关系;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "RolePermission", joinColumns = { @JoinColumn(name = "roleId") }, inverseJoinColumns = {
			@JoinColumn(name = "permissionId") })
	private List<Permission> permissions;

	// 用户 - 角色关系定义;
	@ManyToMany
	@JoinTable(name = "UserRole", joinColumns = { @JoinColumn(name = "roleId") }, inverseJoinColumns = {
			@JoinColumn(name = "userId") })
	private List<User> users;// 一个角色对应多个用户

	/**
	 * 
	 * <默认构造函数>
	 */
	public Role() {
	}

	public Role(Integer roleId, String roleName, Date creatTime, Date updataTime, String description, Boolean available,
			List<Permission> permissions, List<User> users) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.creatTime = creatTime;
		this.updataTime = updataTime;
		this.description = description;
		this.available = available;
		this.permissions = permissions;
		this.users = users;
	}



	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getUpdataTime() {
		return updataTime;
	}

	public void setUpdataTime(Date updataTime) {
		this.updataTime = updataTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", creatTime=" + creatTime + ", updataTime="
				+ updataTime + ", description=" + description + ", available=" + available + ", permissions="
				+ permissions + ", users=" + users + "]";
	}


}
