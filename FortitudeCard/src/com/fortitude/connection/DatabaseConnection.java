package com.fortitude.connection;

import java.sql.Connection;

import com.fortitude.util.DatabaseUtil;

public class DatabaseConnection {
	private static Connection connection;
	
	public DatabaseConnection(){
		DatabaseConnection.connection= DatabaseUtil.getConnection();
	}
	
	public static Connection getConnection(){
		return connection;
	}
}
