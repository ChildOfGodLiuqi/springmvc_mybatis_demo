package com.zxl.web.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zxl.web.model.User;
import com.zxl.web.serviceInterface.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	com.zxl.web.dao.mapper.UserReaderMapper userReaderMapper;
	
	@Override
	public List<User> getAllUser() {
		return userReaderMapper.getAllUser();
	}

}
