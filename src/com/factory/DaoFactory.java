package com.factory;

import com.dao.IUserDao;
import com.dao.impl.UserDaoImpl;

/**
 * 这是一个工厂类
 * 工厂模式最常用的实例化对象模式。他是用工厂方法代替new 操作的一种模式
 * 使用DaoFactory.getUserDaoInstance()就可以获得一个IUserDao实现类的一个实例
 * */
public class DaoFactory {
	public static IUserDao getUserDaoInstance(){
		return new UserDaoImpl();
		
	}
//	可以写很多的方法 例如：
//	public static IPhoneDao getPhoneDaoInstance(){
//		return new PhoneDaoImpl();
//	}
}
