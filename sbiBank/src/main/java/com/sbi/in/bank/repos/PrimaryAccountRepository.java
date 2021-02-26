package com.sbi.in.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.in.bank.domain.PrimaryAccount;


@Repository
public interface PrimaryAccountRepository extends JpaRepository<PrimaryAccount, Long> {

}
