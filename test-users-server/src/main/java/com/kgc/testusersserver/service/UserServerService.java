package com.kgc.testusersserver.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@RestController
public class UserServerService {

	private  Log logger = LogFactory.getLog(UserServerService.class);
	
	@Autowired
    RestOperations restTemplate;
	
	@RequestMapping("/getAllUser")
	public String getAllUser() {
		logger.debug("测试用户--user--接口程序");
		logger.info("测试用户--user--接口程序");
		return restTemplate.getForObject("http://test-member-server/getAllMap", String.class);
		
	}
}
