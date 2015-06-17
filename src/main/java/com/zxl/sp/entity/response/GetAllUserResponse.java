package com.zxl.sp.entity.response;

import java.io.Serializable;
import java.util.List;

import com.zxl.sp.common.ServiceResponseBase;
import com.zxl.sp.entity.User;

public class GetAllUserResponse extends ServiceResponseBase implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2997702916271371498L;

	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
