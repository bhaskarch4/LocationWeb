package com.sbi.in.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.in.bank.domain.SavingsAccount;


@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {

}
