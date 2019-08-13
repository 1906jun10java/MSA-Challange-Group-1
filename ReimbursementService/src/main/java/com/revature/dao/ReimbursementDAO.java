package com.revature.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Reimbursements;

@Repository
public interface ReimbursementDAO extends CrudRepository<Reimbursements, Integer>{}