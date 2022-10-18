package com.kbdiamante.sims.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tbl_course")
public class CourseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseid; 
	private String code; 
	private String descr; 
	private int unit;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<StudentEntity> student; 
	
	public CourseEntity() {}

	public CourseEntity(int courseid, String code, String descr, int unit, Set<StudentEntity> student) {
		super();
		this.courseid = courseid;
		this.code = code;
		this.descr = descr;
		this.unit = unit;
		this.student = student;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public Set<StudentEntity> getStudent() {
		return student;
	}

	public void setStudent(Set<StudentEntity> student) {
		this.student = student;
	}
	
	
	
	
	
}
