package com.zxl.sp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.sp.entity.response.GetAllUserResponse;
import com.zxl.sp.serviceInterface.IUserService;

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
}
