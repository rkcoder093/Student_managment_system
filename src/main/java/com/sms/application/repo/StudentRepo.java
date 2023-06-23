package com.sms.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.application.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
