package com.app.spring.boot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.boot.model.Course;

@RestController
public class CourseController {
	
	
	@RequestMapping("/course")
	public List<Course> returnAllCourses()
	{
		
	
		return Arrays.asList(new Course(1, "AWS", "sonu"),new Course(2, "DevOps", "Ravi"),new Course(3, "spring", "Sabir"),new Course(4, "docker", "ashish"));
	}

}
