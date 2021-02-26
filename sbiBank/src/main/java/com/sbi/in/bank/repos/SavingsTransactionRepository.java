package com.sbi.in.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.in.bank.entity.SavingsTransaction;


@Repository
public interface SavingsTransactionRepository extends JpaRepository<SavingsTransaction, Long> {

}
