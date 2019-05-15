package com.waylau.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Hello Controller.
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月8日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@RestController
public class HelloController
{
    
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello World! Welcome to visit waylau.com!";
    }
    
}
