package com.waylau.spring.boot.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.waylau.spring.boot.blog.domain.User;
import com.waylau.spring.boot.blog.repository.UserMapper;

@Controller
public class UserController
{
    
    @Autowired
    UserMapper userMapper;
    
    @RequestMapping("/")
    public String index()
    {
        return "redirect:/list";
    }
    
    @RequestMapping("/list")
    public String list(Model model)
    {
        List<User> users = userMapper.listUser();
        System.out.println(users);
        model.addAttribute("users", users);
        return "user/list";
    }
    
    @RequestMapping("/toAdd")
    public String toAdd()
    {
        return "user/userAdd";
    }
    
    @RequestMapping("/add")
    public String add(User user)
    {
        userMapper.saveUser(user);
        return "redirect:/list";
    }
    
    @RequestMapping("/toEdit")
    public String toEdit(Model model, Long id)
    {
        // User user=userService.findUserById(id);
        // model.addAttribute("user", user);
        return "user/userEdit";
    }
    
    @RequestMapping("/edit")
    public String edit(User user)
    {
        // userService.edit(user);
        return "redirect:/list";
    }
    
    @RequestMapping("/delete")
    public String delete(Long id)
    {
        // userService.delete(id);
        return "redirect:/list";
    }
}
