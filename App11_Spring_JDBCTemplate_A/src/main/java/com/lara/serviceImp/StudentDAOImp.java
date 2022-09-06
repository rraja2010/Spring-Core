package com.lara.serviceImp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StudentDAO;

public class StudentDAOImp implements StudentDAO {

	private JdbcTemplate jdbcTemplateObject;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		System.out.println("-----StudentDAOImp@setDataSource-----");
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(int id ,String name, int age) {
		String SQL = "insert into Student (id,name, age) values (?, ?, ?)";
		jdbcTemplateObject.update(SQL, id,name, age);
		System.out.println("Records inserted : id=" + id + "name=" + name + "age=" + age);
		return;
	}

	public Student getStudent(int id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());

		return student;
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
}