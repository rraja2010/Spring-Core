package com.lara.serviceImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StudentDAO;

public class StudentDAOImpRowMapper implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void create(int id, String name, int age) {
		// TODO Auto-generated method stub

	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public void update(int id, int age) {
		// TODO Auto-generated method stub

	}

}
