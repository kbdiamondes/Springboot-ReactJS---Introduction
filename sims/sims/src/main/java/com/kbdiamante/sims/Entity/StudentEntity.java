package com.kbdiamante.sims.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String program; 
	private int yearlevel;
	
	@OneToMany(cascade = CascadeType.MERGE)
	public Set<CourseEntity> course;
	
	
	public StudentEntity() {}


	public StudentEntity(int id, String firstname, String lastname, String program, int yearlevel,
			Set<CourseEntity> course) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.program = program;
		this.yearlevel = yearlevel;
		this.course = course;
	}


	public int getId() {
		return id;
	}

	/*
	public void setId(int id) {
		this.id = id;
	}
	*/

	public String getFirstname() {
		return firstname;
	}

	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	

	public String getLastname() {
		return lastname;
	}

	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getProgram() {
		return program;
	}


	public void setProgram(String program) {
		this.program = program;
	}


	public int getYearlevel() {
		return yearlevel;
	}


	public void setYearlevel(int yearlevel) {
		this.yearlevel = yearlevel;
	}


	public Set<CourseEntity> getCourse() {
		return course;
	}


	public void setCourse(Set<CourseEntity> course) {
		this.course = course;
	}
	
	
	
	
	
	
}
