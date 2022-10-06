package com.kbdiamante.sims.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbdiamante.sims.Entity.StudentEntity;
import com.kbdiamante.sims.Repository.StudentRepository;

@Service
public class StudentService {
	/*this class contains all the business logic of your system
	 * CREATE a student record
	 * READ student records by id or firstname
	 * UPDATE student record
	 * DELETE a student*/
	
	@Autowired
	StudentRepository srepo;
	
	//C - Create or insert a student record
	public StudentEntity insertStudent(StudentEntity student) {
		return srepo.save(student); 
	}
	
	
	
	//Read all record from tbl_studen
	public List<StudentEntity> getAllStudent(){
		return srepo.findAll();
	}
	
	//R - Read or search student record by Firstname
	public StudentEntity findByFirstname(String firstname){
		if(srepo.findByFirstname(firstname)!=null)
			return srepo.findByFirstname(firstname);
		else
			return null;
	}
}
