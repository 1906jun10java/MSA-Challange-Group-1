package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value="/reimbursements")
public class ReimbursementController {

	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public ResponseEntity<String> getReimbursements() {
		ResponseEntity<String> response = new ResponseEntity<>("It works", HttpStatus.OK);
		return response;
	}
	
}
