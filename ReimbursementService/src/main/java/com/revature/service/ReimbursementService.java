package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Reimbursements;
import com.revature.dao.ReimbursementDAO;

@Component
public class ReimbursementService {

	@Autowired ReimbursementDAO repository;
	
	public List<Reimbursements> getAll(){
		return (List<Reimbursements>) repository.findAll();
	}
	
	public Optional<Reimbursements> getReimbursementsById(int id){
		return (Optional<Reimbursements>) repository.findById(id);
	}

	public void add(Reimbursements reimbursement) {
		repository.save(reimbursement);
	}
	
	
}
