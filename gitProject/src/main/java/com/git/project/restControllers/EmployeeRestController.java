package com.git.project.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.project.entities.Employee;
import com.git.project.repos.EmployeeRepository;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeRepository employeeRepository ;
	
	@GetMapping(name = "/")
	public List<Employee> getAllEmployees() {
		
		Employee employee = new Employee();
		employee.setEmployee_name("bhaskar");
		employee.setEmployee_slary(10000);
		employeeRepository.save(employee);
		
		return employeeRepository.findAll() ;
	}
	
}
