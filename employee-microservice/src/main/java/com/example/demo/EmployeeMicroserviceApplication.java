package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Employee;
import com.revature.service.EmployeeService;

@RestController
@SpringBootApplication
public class EmployeeMicroserviceApplication {
	
	EmployeeService es;

public ResponseEntity<List<Employee>> getAllEmployees(){
	List<Employee> employees = es.getAllEmployees();
	return new ResponseEntity<List<Employee>>(employees, new HttpHeaders(), HttpStatus.OK);
}
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroserviceApplication.class, args);
	}




	

}
