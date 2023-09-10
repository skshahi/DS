package com.app.jpa.hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
	@Autowired
	//or
	//@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	
	public Course findById(long id)
	{
		return entityManager.find(Course.class, id);
	}
	public void deleteCourseById(long id)
	{
		Course course= entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	

}
