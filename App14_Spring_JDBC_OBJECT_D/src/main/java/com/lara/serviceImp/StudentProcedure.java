package com.lara.serviceImp;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.lara.bean.Student;

public class StudentProcedure extends StoredProcedure {
	public StudentProcedure(DataSource dataSource, String procedureName) {
		super(dataSource, procedureName);
		declareParameter(new SqlParameter("in_id", Types.INTEGER));
		declareParameter(new SqlOutParameter("out_name", Types.VARCHAR));
		declareParameter(new SqlOutParameter("out_age", Types.INTEGER));
		compile();
	}

	public Student execute(Integer id) {
		Map<String, Object> out = super.execute(id);
		Student student = new Student();
		System.out.println("out:"+out);
		student.setId(id);
		student.setName((String) out.get("out_name"));
		Number age = (Number) out.get("out_age");
		student.setAge(age.intValue());
		return student;
	}
}
