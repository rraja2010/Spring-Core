package com.lara.serviceImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.lara.bean.Student;
import com.lara.service.StudentDAO;

public class StudentDAOImpResultSetExtractor implements StudentDAO {

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
		List<Student> students = jdbcTemplate.query(SQL, new ResultSetExtractor<List<Student>>() {
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Student> list = new ArrayList<Student>();
				while (rs.next()) {
					Student student = new Student();
					student.setId(rs.getInt("id"));
					student.setName(rs.getString("name"));
					student.setAge(rs.getInt("age"));
					list.add(student);
				}
				return list;
			}
		});
		return students;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public void update(int id, int age) {
		// TODO Auto-generated method stub

	}

}
