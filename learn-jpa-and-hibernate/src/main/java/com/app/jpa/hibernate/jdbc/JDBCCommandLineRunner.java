package com.app.jpa.hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.jpa.hibernate.course.Course;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepository courseJDBCRepository;
	
	@Override
	public void run(String... args) throws Exception {
		courseJDBCRepository.insert();
		
		courseJDBCRepository.insert(new Course(1, "AI", "Vivaan"));

	}

}
