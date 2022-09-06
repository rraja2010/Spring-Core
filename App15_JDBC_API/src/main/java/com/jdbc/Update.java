package com.jdbc;

import java.sql.Statement;

public class Update {
	static String sql = "delete from employee where id=?";
	public static void main(String[] args) {
		try {
			Statement statement = Util.getStatementObj();
			int result=statement.executeUpdate(sql);
			System.out.println("result::"+result);
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
