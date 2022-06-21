package com.eee0.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10Controller extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String intro = request.getParameter("intro");
		
		out.println("<html> <head> <title>자기소개서</title> </head> <body>");
		out.println("<h1>" + name + "님 지원이 완료 되었습니다</h1> <hr>");
		out.println("지원내용 <br>" + intro + "</body> </html>");
		
		
		
		
	}
	
}
