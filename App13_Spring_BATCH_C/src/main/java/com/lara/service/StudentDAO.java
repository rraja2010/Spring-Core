package com.lara.service;

import java.util.List;

import javax.sql.DataSource;

import com.lara.bean.Student;

public interface StudentDAO {
	public void setDataSource(DataSource ds);
	public List<Student> listStudents();
	public void batchUpdate(final List<Student> students);
}
