package com.zxl.sp.entity;

/**
 * 用户实体
 * @author zxl
 *
 */
public class User {
	/*
	 * 唯一标识id
	 */
	private int id;
	private String username;
	private String password;
	/*
	 * 性别 0代表女  1代表男
	 */
	private byte gender;
	private String name;
	private int age;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", gender=" + gender + ", name=" + name + ", age="
				+ age + ", address=" + address + "]";
	}
	
	
}
