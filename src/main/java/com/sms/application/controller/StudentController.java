package com.sms.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.application.entity.Student;
import com.sms.application.service.StudentServices;

@Controller
//@RestController
public class StudentController {
	
	
	@Autowired
	StudentServices sService;
	
	@PostMapping("/addstudent")
	public String addStudent(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("branch") String branch,
			@RequestParam("age") int age) {
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setBranch(branch);
		s.setAge(age);
		sService.addStudent(s);		
		System.out.println(id+name+branch+age);
		return "redirect:/add";
		
	}
	
	@PutMapping("/updatestudent")
	public String updatestudent(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("branch") String branch,
			@RequestParam("age") int age) {
		Student st = sService.getStudent(id);
		st.setName(name);
		st.setBranch(branch);
		st.setAge(age);
		sService.updatestudent(st);		
		System.out.println(id+name+branch+age);
		return "redirect:/update";
		
	}
	
	@PostMapping("/view")
	public String viewStudent(@RequestParam("id") int id, Model model) {
		Student studentList = sService.getStudent(id);
		System.out.println(studentList);
		model.addAttribute("studentList", studentList);
		return "viewInfo";
	}

	
	@GetMapping("/viewall")
	public String viewall( Model model) {
		List<Student> studentList = sService.getAllStudent();
		System.out.println(sService.getAllStudent());
		model.addAttribute("studentList", studentList);
		return "viewInfo";
		
	}

	@PostMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id) {
		Student st = sService.deleteStudent(id);
		return "redirect:/del";
	}
}
