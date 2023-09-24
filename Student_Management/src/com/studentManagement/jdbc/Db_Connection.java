package com.studentManagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connection {
 
	static Connection con;
	public static Connection CreateCon()  {
		
		String Driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/my_db";
		String user = "root";
		String pswd = "mohan2001";
		try {
			System.out.println("Start loading driver class");
			Class.forName(Driver);
			con = DriverManager.getConnection(url, user, pswd);
			System.out.println("Driver class load and register successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return con;
	}
}
