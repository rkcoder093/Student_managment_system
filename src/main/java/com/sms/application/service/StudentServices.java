package com.sms.application.service;

import java.util.List;

import com.sms.application.entity.Student;

public interface StudentServices {
	
	
	String addStudent(Student s);

	String updatestudent(Student s);

	Student getStudent(int id);

	List<Student> getAllStudent();

	Student deleteStudent(int id);



}
