package com.dockerdemo.service;

import java.util.List;

import com.dockerdemo.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee e);
	
	public List<Employee> getAllEmployee();
}
