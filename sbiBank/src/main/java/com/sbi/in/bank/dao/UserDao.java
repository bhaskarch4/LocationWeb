package com.sbi.in.bank.dao;

import com.sbi.in.bank.domain.User;

public interface UserDao {

	public void save(User user);

	public User findByEmail(String email);

	

	public User findByUserName(String userName);

}
