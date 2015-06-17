package com.zxl.sp.dao.reader;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zxl.sp.entity.User;

@Repository
public interface UserReaderMapper {
	List<User> getAllUser();
}
