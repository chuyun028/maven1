package com.kgc.testmemberserver.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MermberController {

	private Log logger = LogFactory.getLog(MermberController.class);
	
	@RequestMapping("/getAllMap")
	public String getAllMap() {
		
		logger.info("测试会员服务是否运行成功！");
		return "1sdfdsfg";
		
	}
}
