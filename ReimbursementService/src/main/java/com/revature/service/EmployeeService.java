package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;

@Component
public class EmployeeService {
	
	@Autowired EmployeeDAO repository;

	public void add(Employee employee) {
		repository.save(employee);
	}
}
