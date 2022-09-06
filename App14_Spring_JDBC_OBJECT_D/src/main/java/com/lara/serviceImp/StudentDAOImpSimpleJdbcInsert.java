package com.lara.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;

public class StudentDAOImpSimpleJdbcInsert {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	SimpleJdbcInsert jdbcInsert;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		this.jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("Student");
	}

	public void create(int id,String name, Integer age) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("id", id);
		parameters.put("name", name);
		parameters.put("age", age);

		jdbcInsert.execute(parameters);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}
	
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
}