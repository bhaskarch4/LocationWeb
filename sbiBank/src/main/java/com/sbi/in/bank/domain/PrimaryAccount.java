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

import com.sbi.in.bank.entity.PrimaryTransaction;




@Entity
@Table(name = "primaryAccount")
public class PrimaryAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true ,updatable = false)
	private long id ;
	@Column(nullable = false, unique = true ,updatable = false)
	private long accountNumber ;
	@Column(nullable = false, unique = true )
	private BigDecimal accountBalance ;
	
	@OneToMany(mappedBy = "primaryAccount" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<PrimaryTransaction> primaryTransactionList ;
	
	@OneToOne
	@JoinColumn(name = "fk_primary_account")
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
		return accountBalance;
	}
	public void setAccountbalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}
	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
