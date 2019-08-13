package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Employee;

@Repository
public abstract interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	public abstract List<Employee> findAll();

}
