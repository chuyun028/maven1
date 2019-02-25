package com.kgc.jpa.springBoot_JPA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User 实体
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年2月20日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Entity // 实体
public class User
{
    
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    private Long id; // 实体一个唯一标识
    
    private String name;
    
    private String email;
    
    protected User()
    { // 无参构造函数；设为 protected 防止直接使用
    }
    
    public User(Long id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    @Override
    public String toString()
    {
        return String.format("User [id=%d, name='%s', email='%s']", id, name, email);
    }
}