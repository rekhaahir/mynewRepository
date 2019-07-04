package com.him.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import com.him.bean.AnswerBean;
import com.him.dao.EmpDao;

@WebServlet("/Answer")
public class Answer extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
		String answer = request.getParameter("answer");
		String Que_ID = request.getParameter("id");
		int a = Integer.parseInt(Que_ID);

		AnswerBean ans = new AnswerBean();
		ans.setAnswer(answer);
		ans.setQus_ID(a);

		try {
			HttpSession session = request.getSession(false);
			int i = (int) session.getAttribute("lid");
			EmpDao.Answer(ans, i);

			/* out.print("Hello, "+n+" Welcome to Profile"); */
			response.sendRedirect("Fetch.jsp");

			System.out.println("error");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
