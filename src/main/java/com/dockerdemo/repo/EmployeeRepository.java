package com.dockerdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dockerdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
