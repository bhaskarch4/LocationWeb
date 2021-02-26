package com.sbi.in.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.in.bank.dao.UserDao;
import com.sbi.in.bank.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean userExists(String email, String userName) {
		if(emailExists(email) || userNameExists(userName)) {
		return true; }else return false ;
	}

	@Override
	public boolean emailExists(String email) {
		if(userDao.findByEmail(email)== null) {
		return false; }else return true;
	}

	

	@Override
	public void saveUser(User user) {
		userDao.save(user);
		
	}

	@Override
	public boolean userNameExists(String userName) {
		if(userDao.findByUserName(userName)== null) {
			return false; }else return true;
	}

}
