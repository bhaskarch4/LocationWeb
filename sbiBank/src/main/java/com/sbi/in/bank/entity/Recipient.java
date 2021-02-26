package com.sbi.in.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sbi.in.bank.domain.User;

import lombok.Data;

@Data
@Entity
@Table(name = "recipient")
public class Recipient {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true ,updatable = false)
	private long userId ;
	private String userName;
	private String firstName ;
	private String lastName ;
	@Column(nullable = false )
	private String phone ;
	
	@Column(nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "fk_recipient")
	private User user ;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	  public User getUser() {
		  return user;
		  }
	  
	  public void setUser(User user) { this.user = user; }
	 
}
