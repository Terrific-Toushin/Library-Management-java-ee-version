package com.library.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	public static Connection getConnection()// connection with database using singleton design pattern.
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");// mysql
			System.out.println("driver loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bnlivein_lict", "root", "");
			System.out.println("Database Connected");

			return con;

		} catch (Exception e) {
			System.out.println("Connection Error.");
			return null;

		}
	}
}
