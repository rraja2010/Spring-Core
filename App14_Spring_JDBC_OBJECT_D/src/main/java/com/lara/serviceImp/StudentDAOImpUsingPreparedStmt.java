package com.lara.serviceImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StudentDAO;

public class StudentDAOImpUsingPreparedStmt implements StudentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void create(final int id, final String name, final int age) {
		String SQL = "insert into Student (id,name, age) values (?, ?, ?)";
		jdbcTemplate.execute(SQL, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				return ps.execute();
			}
		});
		
	}

	public Student getStudent(final int id) {
		final String SQL = "select * from Student where id = ? ";
		List<Student> studentList = jdbcTemplate.query(SQL, new PreparedStatementSetter() {
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setInt(1, id);
			}
		}, new StudentMapper());
		return studentList.get(0);
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		PreparedStatementSetter setter = new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
			}
		};
		List<Student> listStd = jdbcTemplate.query(SQL, setter, new StudentMapper());
		return listStd;
	}

	public void delete(final int id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplate.execute(SQL, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, id);
				return ps.execute();
			}
		});
		System.out.println("Delete the entry from db for id:" + id);
	}

	public void update(final int id, final int age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplate.execute(SQL, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, age);
				ps.setInt(2, id);
				return ps.execute();
			}
		});
		System.out.println("Updated the entry from db for id:" + id);
	}

}
