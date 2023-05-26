package com.dockerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.dockerdemo.entity.Employee;
import com.dockerdemo.repo.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee e) {
		Employee save = repo.save(e);
		return save;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}

}
