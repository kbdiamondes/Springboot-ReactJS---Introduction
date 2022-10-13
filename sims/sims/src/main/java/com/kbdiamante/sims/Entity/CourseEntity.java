package com.kbdiamante.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_course")
public class CourseEntity {
	
	@Id
	private int courseid; 
	private String code; 
	private String descr; 
	private int unit;
	
	public CourseEntity() {}
	
	public CourseEntity(int courseid, String code, String descr, int unit) {
		super();
		this.courseid = courseid;
		this.code = code;
		this.descr = descr;
		this.unit = unit;
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
	
	
	
	
}
