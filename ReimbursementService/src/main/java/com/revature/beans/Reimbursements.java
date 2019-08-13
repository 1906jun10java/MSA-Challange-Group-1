package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REIMBURSEMENTS")
public class Reimbursements {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="reimbursementSequence")
	@SequenceGenerator(allocationSize=1, name="reimbursementSequence", sequenceName="SQ_REIMBURSEMENT_PK")
	@Column(name="REIMBURSEMENT_ID")
	private int id;
	@Column(name="TITLE")
	private String title;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;
	
	public Reimbursements() {
		super();
		
	}

	public Reimbursements(int id, String title, String description, Employee employee) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Reimbursements [id=" + id + ", title=" + title + ", description=" + description + ", employee="
				+ employee + "]";
	}
	
	
	
}
