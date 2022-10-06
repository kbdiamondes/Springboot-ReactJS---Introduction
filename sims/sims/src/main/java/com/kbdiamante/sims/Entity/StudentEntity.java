package com.kbdiamante.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class StudentEntity {
	
	//Keith Brylle Diamante BSIT-3
	
	//define the data members - corresponds to table variables
	@Id   //specifies that ID is a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //signifies that this field ID is auto incremented
	private int id; 
	
	private String firstname; 
	private String lastname; 
	private String course; 
	private int yearlevel;
	
	public StudentEntity() {}
	//define the constructor -> right click -> source -> generate from source
	public StudentEntity(int id, String firstname, String lastname, String course, int yearlevel) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.yearlevel = yearlevel;
	}
	
	//define the setter and getter methods -> righht click -> source -> generate setter and getter

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	/*
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}*/

	public String getLastname() {
		return lastname;
	}

	/*
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}*/

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearlevel() {
		return yearlevel;
	}

	public void setYearlevel(int yearlevel) {
		this.yearlevel = yearlevel;
	} 
	
	
	
	
	
	
}
