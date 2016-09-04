package com.kdyzm.spring.springstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdyzm.spring.springstudy.model.Student;
import com.kdyzm.spring.springstudy.perform.Performance;

@RestController
public class StudentController {
	
	@Autowired
	private Performance performance;
	
	@RequestMapping("/test")
	public Student getStudentById(){
		
		performance.perform();
		
		Student student=new Student();
		student.setAge(12);
		student.setName("小明");
		return student;
	}
}
