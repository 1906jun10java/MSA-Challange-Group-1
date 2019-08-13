package com.revature.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{}