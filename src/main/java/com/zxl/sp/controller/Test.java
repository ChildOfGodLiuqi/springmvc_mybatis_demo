package com.zxl.sp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.sp.entity.User;
import com.zxl.sp.serviceInterface.IUserService;

@Controller
@RequestMapping("/test")
public class Test {
	
	@Resource
	IUserService userService;
	
	@RequestMapping("test")
	@ResponseBody
	public User test() {
		User user=new User();
		user.setName("zxl");
		return user;
	}
}
