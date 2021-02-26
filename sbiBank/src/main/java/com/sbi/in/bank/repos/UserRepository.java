package com.sbi.in.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.in.bank.domain.User;


@Repository
public interface UserRepository extends JpaRepository<com.sbi.in.bank.domain.User, Long> {

	abstract User findByEmail(String email);

	

	abstract User findByUserName(String userName);

}
