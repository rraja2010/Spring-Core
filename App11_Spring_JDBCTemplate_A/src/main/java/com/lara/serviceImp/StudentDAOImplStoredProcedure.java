package com.lara.serviceImp;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.lara.bean.Student;
import com.lara.service.StudentDAO;

public class StudentDAOImplStoredProcedure implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		System.out.println("********StudentDAOImplStoredProcedure@setDataSource***********");
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(int id, String name, int age) {
		// TODO Auto-generated method stub

	}

	public Student getStudent(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
		Number Age = (Number) out.get("OUT_AGE");
		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("OUT_NAME"));
		student.setAge(Age.intValue());
		return student;
	}
	
	public Student getStudent(int id,int dummy) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withFunctionName("get_student_name");
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		System.out.println("<<<<<<<<<<<<<<");
	    String name = jdbcCall.executeFunction(String.class, in);
	    System.out.println(">>>>>>>>>>>>>");
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}
