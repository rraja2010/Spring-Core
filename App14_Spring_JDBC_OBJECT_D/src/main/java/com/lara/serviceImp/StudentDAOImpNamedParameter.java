package com.lara.serviceImp;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;

public class StudentDAOImpNamedParameter {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.dataSource=dataSource;
	}

	public void updateDescription(Integer id, String description) {
	      MapSqlParameterSource in = new MapSqlParameterSource();
	      in.addValue("id", id);
	      in.addValue("description",  new SqlLobValue(
	         description, new DefaultLobHandler()), Types.CLOB);

	      String SQL = "update StudentA set description = :description where id = :id";
	      NamedParameterJdbcTemplate jdbcTemplateObject = 
	         new NamedParameterJdbcTemplate(dataSource);
	      
	      jdbcTemplateObject.update(SQL, in);
	      System.out.println("Updated Record with ID = " + id );
	   }
}
