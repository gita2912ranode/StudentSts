package com.StudentManagement.Student.service;

import java.util.List;

import com.StudentManagement.Student.entity.Student;

public interface StudentService {
	public List<Student> getStudents();
	public Student getStudent(long id);
	public Student addStudent(Student s);
	public Student updateStudent(Student st);
	public void deleteStudent(long id);

}

