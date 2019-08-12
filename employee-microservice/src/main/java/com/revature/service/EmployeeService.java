package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.Employee;
import com.revature.repository.EmployeeRepository;

public class EmployeeService {
	@Autowired
	EmployeeRepository er;
	
	    public List<Employee> getAllEmployees()
	    {
	        List<Employee> employeeList = er.findAll();
	         
	        if(employeeList.size() > 0) {
	            return employeeList;
	        } else {
	            return new ArrayList<Employee>();
	        }
	    }

}
