package com_5_6_19_practicals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prac170 {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
	PreparedStatement ps=conn.prepareStatement("delete from Student where no=30");
	int i=ps.executeUpdate();
	System.out.println(i);
	}

}
