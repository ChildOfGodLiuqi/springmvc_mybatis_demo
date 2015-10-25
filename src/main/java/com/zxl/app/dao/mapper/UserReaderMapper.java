package com.zxl.app.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zxl.app.model.User;

@Repository
public interface UserReaderMapper {
	List<User> getAllUser();
}
