package com.kbdiamante.sims.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kbdiamante.sims.Entity.CourseEntity;
import com.kbdiamante.sims.Service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseService cserv; 
	
	
	//Create
	@PostMapping("/postCourse")
	CourseEntity insertCourse(@RequestBody CourseEntity course) {
		return cserv.insertCourse(course); 
	}
	
	//Read
	@GetMapping("/getAllCourse")
	List<CourseEntity> getAllCourse(){
		return cserv.getAllCourse(); 
	}
	
	//Update
	@PutMapping("/putCourse")
	CourseEntity putCourse(@RequestParam int courseid, @RequestBody CourseEntity newCourseEntity) throws Exception {
		return cserv.putCourse(courseid, newCourseEntity); 
	}
	
	
	
	//delete
	@DeleteMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		return cserv.deleteCourse(id); 
	}
}
