package com.zxl.app.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zxl.app.model.User;
import com.zxl.app.serviceInterface.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	com.zxl.app.dao.mapper.UserReaderMapper userReaderMapper;
	
	@Override
	public List<User> getAllUser() {
		return userReaderMapper.getAllUser();
	}

}
