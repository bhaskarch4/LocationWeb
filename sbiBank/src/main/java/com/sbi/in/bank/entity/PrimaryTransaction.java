package com.sbi.in.bank.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sbi.in.bank.domain.PrimaryAccount;



@Entity
@Table(name = "primaryTransaction")
public class PrimaryTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true ,updatable = false)
	private long transactionId ;
	@Column(nullable = false ,updatable = false)
	private Date transactionDoneDate ;
	@Column(updatable = false)
	private String description ;
	@Column(nullable = false ,updatable = false)
	private String type ;
	@Column(nullable = false ,updatable = false)
	private String status ;
	@Column(nullable = false )
	private double amount ;
	@Column(nullable = false )
	private BigDecimal availableAmount ;
	
	@ManyToOne
	@JoinColumn(name  = "fk_primary_transaction")
	private PrimaryAccount primaryAccount;
	
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDoneDate() {
		return transactionDoneDate;
	}
	public void setTransactionDoneDate(Date transactionDoneDate) {
		this.transactionDoneDate = transactionDoneDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BigDecimal getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(BigDecimal availableAmount) {
		this.availableAmount = availableAmount;
	}
	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}
	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}
}
