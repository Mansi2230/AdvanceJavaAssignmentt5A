package com.nagarro.employeemanagementapi.service;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.employeemanagementapi.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(@PathVariable Long id);
	 
	public Employee createEmployee(@RequestBody Employee employee);
	
	public void delete(@PathVariable Long id);
}