package com.accp.service;

import java.util.List;

import com.accp.dao.user.IUserDao;
import com.accp.entitys.UsersEntity;

public class UserService {
	private IUserDao userDao;
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	//登录
	public UsersEntity LoginSelect(String userName, String passWord) {
		return userDao.LoginSelect(userName, passWord);
	}
	
	//添加一条用户
	public UsersEntity saveUser(UsersEntity user) {
		return userDao.queryUserByUserId(userDao.saveUser(user));
	}
	//查询所有用户信息
	public List<UsersEntity> queryAll() {
		return userDao.queryAll();
	}
	//删除用户信息
	public boolean delUser(Integer userId) {
		return userDao.delUser(userId);
	}
	//根据编号查询一条用户信息
	public UsersEntity queryUserByUserId(Integer userId){
		return userDao.queryUserByUserId(userId);
	}
	//待条件查询用户信息
	public List<UsersEntity> queryConditionsUser(Integer genderId,Integer deptId,
			Integer positionId,Integer gradeId,String byName) {
		return userDao.queryConditionsUser(genderId, deptId, positionId, gradeId, byName);
	}
	//验证用户名是否存在
	public UsersEntity chaekUser(String userName) {
		return userDao.chaekUser(userName);
	}
	//带信息模糊查询
	public List<UsersEntity> queryUserInformation(String information){
		return userDao.queryUserInformation(information);
	}
	//根据用户Id修改登录密码
	public boolean updatePassWord(Integer userId,String passWord) {
		return userDao.updatePassWord(userId, passWord);
	}
	//查询用户是否存在
	public boolean queryUserIfSuccess(Integer userId) {
		return userDao.queryUserIfSuccess(userId);
	}
}
