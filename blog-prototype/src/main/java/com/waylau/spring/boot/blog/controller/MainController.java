package com.waylau.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主页控制器. <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2019年2月25日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
public class MainController
{
    /**
     * 1.默认转发到主页面
     * @return
     */
    @GetMapping("/")
    public String root()
    {
        return "redirect:/index";
    }
    
    /**
     * 2.主页面
     * @return
     */
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }
    
    /**
     * 3.登陆界面
     * @return
     */
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    
    /**
     * 4.登陆失败界面
     * @param model
     * @return
     */
    @GetMapping("/login-error")
    public String loginError(Model model)
    {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登录失败，用户名或者密码错误！");
        return "login";
    }
    
    /**
     * 5.注册界面
     * @return
     */
    @GetMapping("/register")
    public String register()
    {
        return "register";
    }
    
}
