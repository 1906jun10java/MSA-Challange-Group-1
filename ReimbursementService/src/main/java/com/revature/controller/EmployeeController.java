package com.revature.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Employee;

import com.revature.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired EmployeeService service;
	
	@PostMapping(value="/create")
	public void add(Employee employee) {
		service.add(employee);
	}
}
