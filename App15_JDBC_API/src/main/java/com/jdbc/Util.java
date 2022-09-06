package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Util {
	public static Statement getStatementObj() {
		Statement stmt = null;
		Connection con = null;
		// step1 load the driver class
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step2 create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			// step3 create the statement object
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public static Connection getConnection() {
		Statement stmt = null;
		Connection con = null;
		// step1 load the driver class
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step2 create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
