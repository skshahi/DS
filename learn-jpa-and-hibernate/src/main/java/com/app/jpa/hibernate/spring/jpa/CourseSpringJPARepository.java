package com.app.jpa.hibernate.spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.jpa.hibernate.course.Course;

public interface CourseSpringJPARepository extends JpaRepository<Course, Long> {

}
