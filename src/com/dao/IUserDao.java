package com.dao;

import java.util.List;

import com.bean.User;
/**
 * DAO接口
 * */
public interface IUserDao {
	/**
	 * 功能：用户登录
	 * 		用户名 username
	 * 		密    码  password
	 * @return type is boolean  true or false
	 * */
	public boolean login(String username,String password);
	/**
	 * */
	public int save(User user);
	/**
	 * */
	public int delete(String  username);
	/**
	 * */
	public int update(String username,User user);
	/**
	 * */
	public List<User> findAll();
	
}
