package com.lara.serviceImp;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StdDAO;

public class StudentDAOImpSqlUpdate implements StdDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";

		SqlUpdate sqlUpdate = new SqlUpdate(dataSource, SQL);
		sqlUpdate.declareParameter(new SqlParameter("age", Types.INTEGER));
		sqlUpdate.declareParameter(new SqlParameter("id", Types.INTEGER));
		sqlUpdate.compile();

		sqlUpdate.update(age.intValue(), id.intValue());
		System.out.println("Updated Record with ID = " + id);
		return;
	}

	public Student getStudent(int id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());

		return student;
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}