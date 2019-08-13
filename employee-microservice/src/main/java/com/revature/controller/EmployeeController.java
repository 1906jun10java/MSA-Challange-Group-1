package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Employee;
import com.revature.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	private EmployeeService es;
	
	@Autowired
	public EmployeeController(EmployeeService es) {
		this.es = es;
	}

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = es.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employees, new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public ResponseEntity<String> getReimbursements() {
		ResponseEntity<String> response = new ResponseEntity<>("It works", HttpStatus.OK);
		return response;
	}
}
