package com.sbi.in.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.in.bank.entity.Recipient;


@Repository
public interface RecipientRepository extends JpaRepository<Recipient,  Long> {

}
