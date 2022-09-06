package com.lara.serviceImp;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.object.SqlQuery;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StdDAO;

public class StudentDAOImpSqlQuery implements StdDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	SimpleJdbcInsert jdbcInsert;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		this.jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("Student");
	}

	public Student getStudent(int id) {
		return null;
	}

	public List<Student> listStudents() {
		String sql = "select * from Student";
		SqlQuery<Student> sqlQuery = new SqlQuery<Student>() {
			@Override
			protected RowMapper<Student> newRowMapper(Object[] parameters, Map<?, ?> context) {
				return new StudentMapper();
			}
		};
		sqlQuery.setDataSource(dataSource);
		sqlQuery.setSql(sql);
		List<Student> students = sqlQuery.execute();
		return students;
	}

	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub

	}
}