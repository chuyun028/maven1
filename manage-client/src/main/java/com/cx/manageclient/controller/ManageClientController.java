package com.cx.manageclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * git配置客户端调用配置文件
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月11日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@RestController
public class ManageClientController {

	@Value("${neo.hello}")
	private String hello;
	
	@RequestMapping("/hello")
	String getHello() {
		return this.hello;
		
	}
}
