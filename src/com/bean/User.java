package com.bean;
/**
 * VO类
 * 这是这个值对象类（VO value Object）
 * VO类仅仅含有私有的成员变量和相应的getter and setter方法，不含有逻辑处理的方法。
 * 可以认为VO类是一种简化的javabean
 * */
public class User {
	private String fd_username;
	private String fd_password;
	private String fd_usertype;
	private String fd_gender;
	private String fd_hobby;
	private String fd_birthdate;
	private String fd_email;
	private String fd_introduction;
	public String getFd_username() {
		return fd_username;
	}
	public void setFd_username(String fd_username) {
		this.fd_username = fd_username;
	}
	public String getFd_password() {
		return fd_password;
	}
	public void setFd_password(String fd_password) {
		this.fd_password = fd_password;
	}
	public String getFd_usertype() {
		return fd_usertype;
	}
	public void setFd_usertype(String fd_usertype) {
		this.fd_usertype = fd_usertype;
	}
	public String getFd_gender() {
		return fd_gender;
	}
	public void setFd_gender(String fd_gender) {
		this.fd_gender = fd_gender;
	}
	public String getFd_hobby() {
		return fd_hobby;
	}
	public void setFd_hobby(String fd_hobby) {
		this.fd_hobby = fd_hobby;
	}
	public String getFd_birthdate() {
		return fd_birthdate;
	}
	public void setFd_birthdate(String fd_birthdate) {
		this.fd_birthdate = fd_birthdate;
	}
	public String getFd_email() {
		return fd_email;
	}
	public void setFd_email(String fd_email) {
		this.fd_email = fd_email;
	}
	public String getFd_introduction() {
		return fd_introduction;
	}
	public void setFd_introduction(String fd_introduction) {
		this.fd_introduction = fd_introduction;
	}

}
