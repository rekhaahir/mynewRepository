package com.him.dao;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.omg.CORBA.Request;

import com.him.bean.AnswerBean;
import com.him.bean.Question;
import com.him.bean.RegistrationBean;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.him.servlet.Registration;;

public class EmpDao {

	public static Connection getConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Table1", "root", "root");

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e);

		}
		return con;

	}

	public static int registration(RegistrationBean r) {
		int status = 0;
		InputStream inputStream = null;
		try {

			Connection con = EmpDao.getConnection();
			String sql = "insert into Registration(UserName,FirstName,LastName,Password,ConfirmPassword,EmailId,photo,Company) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

			ps.setString(1, r.getUserName());
			ps.setString(2, r.getFirstName());
			ps.setString(3, r.getLastName());
			ps.setString(4, r.getPassword());
			ps.setString(5, r.getConfirmPassword());
			ps.setString(6, r.getEmailId());
			/*
			 * if(r.getInputStream()!=null) { ps.setBlob(6, r.getInputStream()); }
			 */
			/* ps.setBlob(6, r.getPhoto()); */
			//ps.setBlob(7, r.getInputStream());
			

			ps.setString(7, r.getCompany());
			status = ps.executeUpdate();
			
			
			String sql2 = "insert into Login(U_NAME,PASS) values(?,?)";
			PreparedStatement ps2 = (PreparedStatement) con.prepareStatement(sql2);

			ps2.setString(1, r.getUserName());
			ps2.setString(2, r.getPassword());

		
			ps2.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public static boolean validate(String name, String password, Question q) throws SQLException {
		Connection con = null;
		try {

			con = EmpDao.getConnection();
		} catch (Exception e) {
			System.out.println("Connect fail");
		}

		String sql = "SELECT * FROM Login WHERE U_NAME=? and PASS=?";
		PreparedStatement ps1 = (PreparedStatement) con.prepareStatement(sql);

		/*
		 * Question q = new Question();
		 * 
		 * q.setNew_LID(1);
		 */

		ps1.setString(1, name);
		ps1.setString(2, password);

		ResultSet rs = ps1.executeQuery();
		boolean status = rs.next();

		int a = rs.getInt(1);
		System.out.println("display in dao");
		System.out.println(a);

		
		q.setNew_LID(a);
		

		return status;

	}

	public static int AskQuestion(Question q,int i) throws SQLException {
		int status = 0;
		Connection con = null;
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

		try {

			con = EmpDao.getConnection();

		} catch (Exception e) {
			System.out.println("Connect fail");
		}

		String sql = "insert into Question1(L_ID,QUE,TIME) values(?,?,?)";

		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

		System.out.println("dao");
		System.out.println(i+" "+q.getQuestion()+" "+date);
		ps.setInt(1, i);
		ps.setString(2, q.getQuestion());
		ps.setTimestamp(3, date);

		status = ps.executeUpdate();

		return status;
	}
	
	public static int Answer(AnswerBean q, int i) throws SQLException
	{
		int status =0;
		Connection con = null;
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

		try {

			con = EmpDao.getConnection();

		} catch (Exception e) {
			System.out.println("Connect fail");
		}
		
		String sql="insert into Answer(Q_ID,L_ID,ANS,TIME) values(?,?,?,?)";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		ps.setInt(1, q.getQus_ID());
		ps.setInt(2, i);
		ps.setString(3, q.getAnswer());
		ps.setTimestamp(4, date);
		
		status = ps.executeUpdate();
		
		return status;
	}
	
	public static List<Question> FetchData(Question q)  throws SQLException
	{
		List<Question> list = new ArrayList<>();
		Connection con = EmpDao.getConnection();
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM Question1,Login where Question1.L_ID=Login.L_ID;");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			String QUE = rs.getString("QUE");
			String U_NAME = rs.getString("U_NAME");
			Timestamp TIME = rs.getTimestamp("TIME");
			int Q_ID	= rs.getInt("Q_ID");
			
			q = new Question(QUE,U_NAME,TIME,Q_ID);
			System.out.println("fetch data in dao");
			System.out.println(QUE);
			System.out.println(U_NAME);
			System.out.println(TIME);
			System.out.println(Q_ID);
			list.add(q);
		}
		return list;
		
	}

	
}
