package com.dockerdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerdemo.entity.Employee;
import com.dockerdemo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")	
public class EmployeeApi {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAll(){
		List<Employee> allEmployee = empService.getAllEmployee();
		return new ResponseEntity<>(allEmployee, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Employee emp){
		empService.addEmployee(emp);
		return new ResponseEntity<>("Employee created", HttpStatus.CREATED);
		
	}
	
}
