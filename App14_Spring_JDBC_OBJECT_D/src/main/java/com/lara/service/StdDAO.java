package com.lara.service;

import java.util.List;

import javax.sql.DataSource;

import com.lara.bean.Student;

public interface StdDAO {

	public void setDataSource(DataSource ds);

	public Student getStudent(int id);
	public List<Student> listStudents();
	public void update(Integer id, Integer age);
}
