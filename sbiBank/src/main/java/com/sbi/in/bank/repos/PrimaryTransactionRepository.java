package com.sbi.in.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.in.bank.entity.PrimaryTransaction;


@Repository
public interface PrimaryTransactionRepository extends JpaRepository<PrimaryTransaction, Long> {

}
