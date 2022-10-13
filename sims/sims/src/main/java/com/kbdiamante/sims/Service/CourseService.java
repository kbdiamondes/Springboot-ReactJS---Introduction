package com.kbdiamante.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbdiamante.sims.Entity.CourseEntity;
import com.kbdiamante.sims.Repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository crepo; 
	
	
	//Create
	public CourseEntity insertCourse(CourseEntity course) {
		return crepo.save(course); 
	}
	
	//Read
	public List<CourseEntity> getAllCourse(){
		return crepo.findAll(); 
	}
	
	//Update
	public CourseEntity putCourse(int courseid, CourseEntity newCourseDetails) throws Exception {
		
		CourseEntity course = new CourseEntity(); 
		
		try {
			course = crepo.findById(courseid).get(); 
			
			course.setCode(newCourseDetails.getCode());
			course.setDescr(newCourseDetails.getDescr()); 
			
			return crepo.save(course); 
		}catch(NoSuchElementException nex) {
			throw new Exception(courseid + "does not exist!"); 
		}
		
	}
	
	//Delete
	
	public String deleteCourse(int courseid) {
		String msg; 
		if(crepo.findById(courseid)!=null) {
			crepo.deleteById(courseid);
			
			msg = courseid + " is successfully deleted!"; 
		}else
			msg = courseid + " is NOT found!"; 
		
		return msg; 
	}
}
