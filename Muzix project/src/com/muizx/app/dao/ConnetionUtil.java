package com.muizx.app.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnetionUtil {
	public static Connection getDbConnection() throws SQLException {

		String dbUrl="jdbc:mysql://localhost:3306/music_db";
		String username="root";
		String password="Password@123";
      Connection conn = DriverManager.getConnection(dbUrl,username,password);

		return conn;
	}
	


}
