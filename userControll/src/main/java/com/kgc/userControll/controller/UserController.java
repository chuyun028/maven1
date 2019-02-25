package com.kgc.userControll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgc.userControll.service.UserService;

/**
 * 用户的试图层
 * 
 * @author 思雨
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/hellor")
	public String index() {
		return "/index";

	}
}
