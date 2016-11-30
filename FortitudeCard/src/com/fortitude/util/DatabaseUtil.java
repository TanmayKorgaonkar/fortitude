//package com.fortitude.util;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//
//public class DatabaseUtil {
//	
//	private static Connection connection = null;
//	
//	public static Connection getConnection(){
//		if(connection!=null){
//			return connection;
//		}else{
//			try{
////				File file = new File("database.properties");
//	//			System.out.println(file.getAbsolutePath());
//				Properties properties = new Properties();
//				//need to optimize this process
//				InputStream inputStream = DatabaseUtil.class.getClassLoader().getResourceAsStream("database.properties");
//				properties.load(inputStream);
//				String driver = properties.getProperty("driver");
//				String url = properties.getProperty("url");
//				String user = properties.getProperty("user");
//				String password = properties.getProperty("password");
//				Class.forName(driver);
//				connection = DriverManager.getConnection(url, user, password);
//			}catch(ClassNotFoundException e){
//				e.printStackTrace();
//			}catch(SQLException s){
//				s.printStackTrace();
//			} catch (IOException i) {
//				i.printStackTrace();
//			}
//		}
//		return connection;
//	}
//	
//	
//
//}
