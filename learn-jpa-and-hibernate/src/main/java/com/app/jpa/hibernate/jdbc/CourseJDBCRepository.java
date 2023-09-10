package com.app.jpa.hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.jpa.hibernate.course.Course;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY=
			"""
			INSERT INTO COURSE(ID,NAME,AUTHER) VALUES(1,"AWS","SONU");
			
			""";
	
	
	private static String INSERT_QUERY_DYNAMIC=
			"""
			INSERT INTO COURSE(ID,NAME,AUTHER) VALUES(?,?,?);
			
			""";
	

	private static String DELETE_QUERY_DYNAMIC=
			"""
			DELETE FROM COURSE WHERE ID=?;
			
			""";
	
	
	private static String SELECT_QUERY_DYNAMIC=
			"""
			DELETE FROM COURSE WHERE ID=?;
			
			""";
	
	
	public void insert()
	{
		System.out.println("Query:"+INSERT_QUERY);
		//jdbcTemplate.update(INSERT_QUERY);
	}
	
	public void insert(Course course)
	{
		System.out.println("Query:"+INSERT_QUERY_DYNAMIC);
		//jdbcTemplate.update(INSERT_QUERY_DYNAMIC,course.getId(),course.getName(),course.getAuther());
	}
	
	public void deleteById(long id)
	{
		System.out.println("Query:"+DELETE_QUERY_DYNAMIC);
		//jdbcTemplate.update(DELETE_QUERY_DYNAMIC,id);
	}
	
	public Course getCourseById(long id)
	{
		System.out.println("Query:"+SELECT_QUERY_DYNAMIC);
		
		//ResultSet==>Bean==>RowMapper==>
	return jdbcTemplate.queryForObject(SELECT_QUERY_DYNAMIC,new BeanPropertyRowMapper<>(Course.class),id);
	}
	
	

}
