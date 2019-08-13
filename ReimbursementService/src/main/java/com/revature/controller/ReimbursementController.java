package com.revature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Reimbursements;
import com.revature.service.ReimbursementService;

@CrossOrigin
@RestController
@RequestMapping(value="/reimbursements")
public class ReimbursementController {
	
	@Autowired ReimbursementService service;

	@GetMapping(value="/getAll")
	public List<Reimbursements> getAll(){
		return service.getAll();
	}
	
	@GetMapping(value="/getById")
	public Optional<Reimbursements> getReimbursementsById(int id){
		return service.getReimbursementsById(id);
	}
}
