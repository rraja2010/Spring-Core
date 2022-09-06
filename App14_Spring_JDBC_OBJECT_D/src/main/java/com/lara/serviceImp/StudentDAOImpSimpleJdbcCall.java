package com.lara.serviceImp;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.lara.bean.Student;
import com.lara.service.StdDAO;

public class StudentDAOImpSimpleJdbcCall implements StdDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	SimpleJdbcInsert jdbcInsert;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		this.jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("Student");
	}

	public Student getStudent(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");

		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
		System.out.println("out::" + out);
		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("OUT_NAME"));
		Number age = (Number) out.get("OUT_AGE");
		student.setAge(age.intValue());
		return student;
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub

	}
}