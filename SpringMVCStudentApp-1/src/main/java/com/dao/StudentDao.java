package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {

	//@Autowired
	private JdbcTemplate jdbcTemplate;

	//@Autowired
	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	//@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public int saveStudent(Student student) {
		String sql="insert into student values (?,?,?)";		
		return jdbcTemplate.update(sql,student.getId(),student.getName(),student.getMarks());
	}
	
	
}
