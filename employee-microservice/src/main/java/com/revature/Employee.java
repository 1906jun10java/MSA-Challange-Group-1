package com.revature;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String role;
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
