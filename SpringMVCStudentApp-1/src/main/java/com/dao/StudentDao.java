package com.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {

	// @Autowired
	private JdbcTemplate jdbcTemplate;

	// @Autowired
	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	// @Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student student) {
		String sql = "insert into student values (?,?,?)";
		return jdbcTemplate.update(sql, student.getId(), student.getName(), student.getMarks());
	}

	public int deleteStudentById(int id) {
		String sql = "delete from student where id=?";
		return jdbcTemplate.update(sql, id);
	}

	public int updateStudent(Student student) {
		String sql = "update student set name=? , marks=?  where id=?";
		return jdbcTemplate.update(sql, student.getName(), student.getMarks(), student.getId());
	}

	public List<Student> findAllStudents() {
		String sql = "SELECT * FROM STUDENT";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));

	}

	public Student findStudentById(int id) {
		String sql="SELECT * FROM STUDENT WHERE id=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class),id);
	}
	
}
