package com.zxl.sp.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zxl.sp.entity.User;
import com.zxl.sp.serviceInterface.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	com.zxl.sp.dao.reader.UserReaderMapper userReaderMapper;
	
	@Override
	public List<User> getAllUser() {
		return userReaderMapper.getAllUser();
	}

}
