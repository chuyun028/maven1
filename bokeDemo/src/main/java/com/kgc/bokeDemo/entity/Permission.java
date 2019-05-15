package com.kgc.bokeDemo.entity;
/**
 * 
 * <用户权限表>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月1日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


public class Permission implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6921239159321551921L;
	// 权限id
	@Id
	@GeneratedValue
	private Integer permissionId;
	// 名称.
	private String name;
	// 资源类型，[menu|button]
	@Column(columnDefinition = "enum('menu','button')")
	private String resourceType;
	// 资源路径.
	private String url;
	// 权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
	private String permission; 
	// 父编号
	private Long parentId; 
	// 父编号列表
	private String parentIds; 
	private Boolean available = Boolean.FALSE;
	
	//角色-权限
	@ManyToMany
    @JoinTable(name="RolePermission",joinColumns={@JoinColumn(name="permissionId")},inverseJoinColumns={@JoinColumn(name="roleId")})
    private List<Role> roles;

	/**
	 * 
	 * <默认构造函数>
	 */
	public Permission() {
	}
	

	public Permission(Integer permissionId, String name, String resourceType, String url, String permission,
			Long parentId, String parentIds, Boolean available, List<Role> roles) {
		this.permissionId = permissionId;
		this.name = name;
		this.resourceType = resourceType;
		this.url = url;
		this.permission = permission;
		this.parentId = parentId;
		this.parentIds = parentIds;
		this.available = available;
		this.roles = roles;
	}


	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Permission [permissionId=" + permissionId + ", name=" + name + ", resourceType=" + resourceType
				+ ", url=" + url + ", permission=" + permission + ", parentId=" + parentId + ", parentIds=" + parentIds
				+ ", available=" + available + ", roles=" + roles + "]";
	}
	
}
