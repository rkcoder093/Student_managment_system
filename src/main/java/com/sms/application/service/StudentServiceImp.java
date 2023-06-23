package com.sms.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.application.entity.Student;
import com.sms.application.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentServices{

	@Autowired
	StudentRepo srepo;

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.save(s);
		return null;
	}

	@Override
	public String updatestudent(Student s) {
		// TODO Auto-generated method stub
		srepo.save(s);
		return null;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return srepo.findById(id).get();
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> st =srepo.findAll();
		return st;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		srepo.deleteById(id);
		return null;
	}

//
//	IP:67.219.139.53
//
//	Username: expert
//
//	This is the password valid for today: Jk95ZxwWut^ERCLQ@mrL
//	


}
