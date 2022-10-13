package com.kbdiamante.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

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
	
	//U - Update a student record
	
	public StudentEntity putStudent(int id, StudentEntity newStudentDetails) throws Exception{
		
		StudentEntity student = new StudentEntity();

		try {
			//steps in updating
			//Step 1
			student = srepo.findById(id).get(); //findById() is a pre-defined method
			
			//Step 2 - update the record
			student.setCourse(newStudentDetails.getCourse());
			student.setYearlevel(newStudentDetails.getYearlevel());
			
			//Step 3 -  save the information and return the value
			return srepo.save(student); 
			
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + id + " does not exist!"); 
		}
	}
	
	//D - Delete student record
	public String deleteStudent(int id) {
		String msg;
		if(srepo.findById(id) !=null) {
			srepo.deleteById(id);
			
			msg = "Student ID Number " + id + " is successfully deleted!";
		}else
			msg = "Student ID Number " + id + " is NOT found!";
		
		return msg;
	}
}
