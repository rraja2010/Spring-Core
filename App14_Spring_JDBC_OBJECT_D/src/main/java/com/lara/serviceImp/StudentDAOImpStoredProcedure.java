package com.lara.serviceImp;

import java.util.List;

import javax.sql.DataSource;

import com.lara.bean.Student;
import com.lara.service.StdDAO;

public class StudentDAOImpStoredProcedure implements StdDAO {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void update(Integer id, Integer age) {

	}

	public Student getStudent(int id) {
		StudentProcedure studentProcedure = new StudentProcedure(dataSource, "getRecord");
		return studentProcedure.execute(id);
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}