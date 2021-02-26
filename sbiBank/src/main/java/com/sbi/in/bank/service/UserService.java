package com.sbi.in.bank.service;

import com.sbi.in.bank.domain.User;

public interface UserService {

	public boolean userExists(String email, String userName);
	
	public boolean emailExists(String email);
	

	public void saveUser(User user);


	boolean userNameExists(String userName);
	
}
