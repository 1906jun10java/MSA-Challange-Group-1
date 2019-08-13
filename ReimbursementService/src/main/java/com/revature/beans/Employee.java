package com.revature.beans;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="employeeSequence")
	@SequenceGenerator(allocationSize=1, name="flashcardSequence", sequenceName="SQ_EMPLOYEE_PK")
	@Column(name="EMPLOYEE_ID")
	private int id;
	@Column(name="EMPLOYEE_NAME")
	private String name;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
	
}
