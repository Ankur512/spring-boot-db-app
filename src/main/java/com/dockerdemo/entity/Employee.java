package com.dockerdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private Integer empno;
	private String ename;
	private Double sal;
	private Integer deptno;
	
}
