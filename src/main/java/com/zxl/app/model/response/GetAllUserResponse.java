package com.zxl.app.model.response;

import java.io.Serializable;
import java.util.List;

import com.zxl.app.common.ServiceResponseBase;
import com.zxl.app.model.User;

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
