package com.git.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.project.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
