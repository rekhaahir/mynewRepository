package com_5_6_19_practicals;

import java.sql.*;

public class Prac168 {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "p@123");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from LOGIN");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}
	}

}
