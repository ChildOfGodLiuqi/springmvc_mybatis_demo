package com.zxl.app.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.app.model.response.GetAllUserResponse;
import com.zxl.app.serviceInterface.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	IUserService userService;
	
	@RequestMapping("getalluser")
	@ResponseBody
	public GetAllUserResponse getAllUser(){
		GetAllUserResponse response=new GetAllUserResponse();
		response.setUserList(userService.getAllUser());
		return response;
	}
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
}