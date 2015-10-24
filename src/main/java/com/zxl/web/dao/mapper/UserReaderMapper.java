package com.zxl.web.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zxl.web.model.User;

@Repository
public interface UserReaderMapper {
	List<User> getAllUser();
}
