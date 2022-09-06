package com.lara.serviceImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StudentDAO;

public class StudentDAOImp implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		System.out.println("StudentDAOImp@setDataSource");
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	public void batchUpdate(final List<Student> students) {
		String SQL = "update Student set age = ? where id = ?";
		int[] updateCounts = jdbcTemplateObject.batchUpdate(SQL, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, students.get(i).getAge());
				ps.setInt(2, students.get(i).getId());
			}
			public int getBatchSize() {
				return students.size();
			}
		});
		System.out.println("Records updated counts::"+Arrays.toString(updateCounts));
	}
	
	public void batchUpdateUsingNamedParameter(final List<Student> students) {
		String SQL = "update Student set age = :age where id = :id";
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(students.toArray());
		NamedParameterJdbcTemplate jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);

		int[] updateCounts = jdbcTemplateObject.batchUpdate(SQL, batch);
		System.out.println("Records updated counts::"+Arrays.toString(updateCounts));
	}
	
	public void batchUpdateMultipleBatch(final List<Student> students){
	      String SQL = "update Student set age = ? where id = ?";
	      int[][] updateCounts = jdbcTemplateObject.batchUpdate(SQL,students,5,
	         new ParameterizedPreparedStatementSetter<Student>() {
	         
	         public void setValues(PreparedStatement ps, Student student)
	            throws SQLException {
	            ps.setInt(1, student.getAge());						
	            ps.setInt(2, student.getId());	
	         }
	      });
	      
	      for (int[] is : updateCounts) {
			System.out.println(Arrays.toString(is));
		}
	      
	      System.out.println("Records updated counts::"+Arrays.toString(updateCounts));
	   }
}