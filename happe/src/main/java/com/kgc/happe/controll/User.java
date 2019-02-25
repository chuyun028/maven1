package com.kgc.happe.controll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@RequestMapping("/user")
	public Map getUser() {
		Map map = new HashMap();
		map.put("hao", "ok");
		return map;
	}
	
//	@RequestMapping("/hello")
//	public String index() {
//		return "hello word";
//		
//	}
	
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
