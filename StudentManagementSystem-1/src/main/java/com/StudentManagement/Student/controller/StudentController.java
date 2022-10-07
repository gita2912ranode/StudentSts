package com.StudentManagement.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagement.Student.entity.Student;
import com.StudentManagement.Student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	//Get all students
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
		
	}
	
	//Get student By Id
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable String studentId) {
		return this.studentService.getStudent(Long.parseLong(studentId));
		
	}
	
	//Add student into table
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	
	//update Student
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
	
	//Delete student by id
	@DeleteMapping("/students/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String id){
		try {
			this.studentService.deleteStudent(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}

}

