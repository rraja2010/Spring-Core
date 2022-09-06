package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class CollableStatement {
	public static void main(String[] args) {
		try {
			Connection connection = Util.getConnection();
			CallableStatement stmt = connection.prepareCall("{call getRecord(?)}");
			stmt.setInt(1, 3);
			ResultSet rs = stmt.executeQuery();
			
			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
