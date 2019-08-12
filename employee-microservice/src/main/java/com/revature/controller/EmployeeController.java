package com.revature.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Employee;
import com.revature.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	EmployeeService es;

	@RequestMapping(value="", method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = es.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employees, new HttpHeaders(), HttpStatus.OK);
	}
}
