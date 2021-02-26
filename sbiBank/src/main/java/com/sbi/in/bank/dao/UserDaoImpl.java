package com.sbi.in.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sbi.in.bank.domain.User;
import com.sbi.in.bank.repos.UserRepository;

@Component
public class UserDaoImpl implements UserDao {
   @Autowired
   private UserRepository userRepository;
	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}
	@Override
	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}
	
	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}
	

	
	
}
