package com.sbi.in.bank.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sbi.in.bank.entity.Appointment;
import com.sbi.in.bank.entity.Recipient;



@Entity
@Table(name = "user")
public class User {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true ,updatable = false)
	private long userId ;
	@Column(nullable = false, unique = true ,updatable = false)
	private String userName;
	private String firstName;
	private String lastName ;
	@Column(nullable = false, unique = true )
	private String phone ;
	@Column(nullable = false, unique = true )
	private String password ;
	@Column(nullable = false, unique = true )
	private String email;
	

	private boolean enabled = true ;
	
	
	  @OneToMany 
	  private List< Appointment > appointmentList ;
	 
	  @OneToMany
	  private List<Recipient> recepientList ;
	
	   @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	  private PrimaryAccount primaryAccount ; 
	  
	   @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	  private SavingsAccount savingsAccount;  
	 
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUsername(String userName) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	  public PrimaryAccount getPrimaryAccount() { return primaryAccount; } public
	  void setPrimaryAccount(PrimaryAccount primaryAccount) { this.primaryAccount =
	  primaryAccount; } public SavingsAccount getSavingsAccount() { return
	  savingsAccount; } public void setSavingsAccount(SavingsAccount
	  savingsAccount) { this.savingsAccount = savingsAccount; } 
	 
	
	 public List<Appointment> getAppointmentList() { return appointmentList; } 
	 public void setAppointmentList(List<Appointment> appointmentList) {
	 this.appointmentList = appointmentList; }
	 
	 public List<Recipient> getRecepientList() { 
		 return recepientList; 
		 } 
	 public void setRecepientList(List<Recipient> recepientList) { 
		 this.recepientList = recepientList;
		 }
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phone=" + phone + ", password=" + password + ", email=" + email + ", enabled=" + enabled
				+ ", appointmentList=" + appointmentList + ", recepientList=" + recepientList + ", primaryAccount="
				+ primaryAccount + ", savingsAccount=" + savingsAccount + "]";
	}
	 
}
