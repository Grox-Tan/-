package com.accp.service;

import java.util.List;

import com.accp.dao.user.IUserDao;
import com.accp.entitys.UsersEntity;

public class UserService {
	private IUserDao userDao;
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	//��¼
	public UsersEntity LoginSelect(String userName, String passWord) {
		return userDao.LoginSelect(userName, passWord);
	}
	
	//���һ���û�
	public UsersEntity saveUser(UsersEntity user) {
		return userDao.queryUserByUserId(userDao.saveUser(user));
	}
	//��ѯ�����û���Ϣ
	public List<UsersEntity> queryAll() {
		return userDao.queryAll();
	}
	//ɾ���û���Ϣ
	public boolean delUser(Integer userId) {
		return userDao.delUser(userId);
	}
	//���ݱ�Ų�ѯһ���û���Ϣ
	public UsersEntity queryUserByUserId(Integer userId){
		return userDao.queryUserByUserId(userId);
	}
	//��������ѯ�û���Ϣ
	public List<UsersEntity> queryConditionsUser(Integer genderId,Integer deptId,
			Integer positionId,Integer gradeId,String byName) {
		return userDao.queryConditionsUser(genderId, deptId, positionId, gradeId, byName);
	}
	//��֤�û����Ƿ����
	public UsersEntity chaekUser(String userName) {
		return userDao.chaekUser(userName);
	}
	//����Ϣģ����ѯ
	public List<UsersEntity> queryUserInformation(String information){
		return userDao.queryUserInformation(information);
	}
	//�����û�Id�޸ĵ�¼����
	public boolean updatePassWord(Integer userId,String passWord) {
		return userDao.updatePassWord(userId, passWord);
	}
	//��ѯ�û��Ƿ����
	public boolean queryUserIfSuccess(Integer userId) {
		return userDao.queryUserIfSuccess(userId);
	}
}
