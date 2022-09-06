package com.lara.service;

import java.util.List;

import javax.sql.DataSource;

import com.lara.bean.Student;

public interface StudentDAO {
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds);

	/**
	 * This is the method to be used to create a record in the Student table.
	 */
	public void create(int id, String name, int age);

	/**
	 * This is the method to be used to list down a record from the Student table
	 * corresponding to a passed student id.
	 */
	public Student getStudent(int id);

	/**
	 * This is the method to be used to list down all the records from the Student
	 * table.
	 */
	public List<Student> listStudents();

	/**
	 * This is the method to be used to delete a record from the Student table
	 * corresponding to a passed student id.
	 */
	public void delete(int id);

	/**
	 * This is the method to be used to update a record into the Student table.
	 */
	public void update(int id, int age);
}
