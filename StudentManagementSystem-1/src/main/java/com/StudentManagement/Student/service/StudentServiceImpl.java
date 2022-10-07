package com.StudentManagement.Student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagement.Student.entity.Student;
import com.StudentManagement.Student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public StudentServiceImpl() {
	     
	}


	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
		
	}


	@Override
	public Student getStudent(long id) {
		return studentRepository.getById(id);
		
	}


	@Override
	public Student addStudent(Student s) {
		studentRepository.save(s);
		return s;
			}


	@Override
	public Student updateStudent(Student st) {
		studentRepository.save(st);
		return st;
		
	}


	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		Student stud=studentRepository.getOne(id);
		
		studentRepository.delete(stud);
		
		
		
	}

}
