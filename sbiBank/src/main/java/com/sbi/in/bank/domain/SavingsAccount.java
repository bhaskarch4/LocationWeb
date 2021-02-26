package com.sbi.in.bank.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sbi.in.bank.entity.SavingsTransaction;


@Entity
@Table(name = "savingsAccount")
public class SavingsAccount {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true ,updatable = false)
	private long id ;
	@Column(nullable = false, unique = true ,updatable = false)
	private long accountNumber ;
	@Column(nullable = false, unique = true )
	private BigDecimal accountbalance ;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,  mappedBy = "savingsAccount")
	private List<SavingsTransaction> savingsTransactionList ;

	
	@OneToOne
	@JoinColumn(name = "fk_savings_account")
	private User user;

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public BigDecimal getAccountbalance() {
		return accountbalance;
	}


	public void setAccountbalance(BigDecimal accountbalance) {
		this.accountbalance = accountbalance;
	}


	public List<SavingsTransaction> getSavingsTransactionList() {
		return savingsTransactionList;
	}


	public void setSavingsTransactionList(List<SavingsTransaction> savingsTransactionList) {
		this.savingsTransactionList = savingsTransactionList;
	}


//	public List<SavingsTransaction> getSavingsTransactionList() {
//		return savingsTransactionList;
//	}
//
//
//	public void setSavingsTransactionList(List<SavingsTransaction> savingsTransactionList) {
//		this.savingsTransactionList = savingsTransactionList;
//	}
	
}
