package com.lara.service;

import java.util.List;

import javax.sql.DataSource;

import com.lara.bean.Student;

public interface StudentDAO {
	public void create(int id, String name, int age);
	public Student getStudent(int id);
	public List<Student> listStudents();
}
