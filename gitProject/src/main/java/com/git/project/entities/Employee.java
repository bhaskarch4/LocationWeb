package com.git.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")

public class Employee {

	
	
	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public double getEmployee_slary() {
		return employee_slary;
	}

	public void setEmployee_slary(double employee_slary) {
		this.employee_slary = employee_slary;
	}
	

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}


	@Id
	@GeneratedValue(strategy  = GenerationType.SEQUENCE)
	@Column(name = "employee_id")
  private long employee_id ;
	
	@Column(name =" employee_name")
	
  private String employee_name ;
	
	@Column(name = "employee_slary" )
	
  private double employee_slary ;
}
