package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="ID_SEQUENCE")
	@SequenceGenerator(allocationSize=1,name="ID_SEQUENCE",sequenceName="ID_SEQUENCE_PK")
	private int id;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ROLE")
	private String role;
	
	@Column(name="REIMBSID")
	private int ReimbsId;
	
	
	
	
	
	
	public Employee(int id, String firstName, String lastName, String password, String role, int reimbsId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
		ReimbsId = reimbsId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getReimbsId() {
		return ReimbsId;
	}
	public void setReimbsId(int reimbsId) {
		ReimbsId = reimbsId;
	}
	
	
	

}
