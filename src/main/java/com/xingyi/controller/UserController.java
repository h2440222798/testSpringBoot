package com.xingyi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xingyi.entity.User;
import com.xingyi.service.UserService;

@Controller

public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/user/register")
	public String register(){
		System.out.println("进入");
		return "register";
	}
	@RequestMapping("/user/login")
	public String login(){
		return "html/login";
	}
	@RequestMapping("searchAll")
	public List<User> searchAll(){/*http://localhost:8080/searchAll*/
		return userService.searchAll();
	}
	
	
}
