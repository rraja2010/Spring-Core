package com.lara.serviceImp;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Types;
import java.util.List;

import javax.imageio.ImageIO;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;

import com.lara.bean.Student;
import com.lara.mapper.StudentMapper;
import com.lara.service.StudentDAO;

public class StudentDAOImp implements StudentDAO {

	private JdbcTemplate jdbcTemplateObject;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		System.out.println("-----StudentDAOImp@setDataSource----->>"+dataSource);
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(int id, String name, int age, String des) {
		String SQL = "insert into StudentA (id,name, age,description) values (?, ?, ?,?)";
		jdbcTemplateObject.update(SQL, id, name, age, des);
		System.out.println("Records inserted : id=" + id + "name=" + name + "age=" + age + " description::" + des);
		return;
	}

	public Student getStudent(int id) {
		String SQL = "select * from StudentA where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		return student;
	}

	public List<Student> listStudents() {
		String SQL = "select * from StudentA";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
	
	public void updateImage(Integer id, byte[] imageData) {
		System.out.println("StudentDAOImp@updateImage");
		String SQL = "update StudentA set image = :image where id = :id";
		MapSqlParameterSource in = new MapSqlParameterSource();
		in.addValue("id", id);
		in.addValue("image",
				new SqlLobValue(new ByteArrayInputStream(imageData), imageData.length, new DefaultLobHandler()),
				Types.BLOB);
		System.out.println("datasource::"+dataSource);
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		jdbcTemplate.update(SQL, in);
		System.out.println("Updated Record with ID = " + id);
	}
	
	public static byte[] getImage(String absolutePath) throws IOException {
		BufferedImage bImage = ImageIO.read(new File(absolutePath));
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(bImage, "jpg", bos);
		byte[] data = bos.toByteArray();
		return data;
	}
	
	 public void updateDescription(Integer id, String description) {
	      MapSqlParameterSource in = new MapSqlParameterSource();
	      in.addValue("id", id);
	      in.addValue("description",  new SqlLobValue(description, 
	         new DefaultLobHandler()), Types.CLOB);

	      String SQL = "update StudentA set description = :description where id = :id";
	      NamedParameterJdbcTemplate jdbcTemplateObject = new 
	         NamedParameterJdbcTemplate(dataSource);
	      jdbcTemplateObject.update(SQL, in);
	      System.out.println("Updated Record with ID = " + id );
	   }
	
}