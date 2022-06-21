package com.eee0.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class ServletTest06Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String danString = request.getParameter("gogodan");
		int gogodan = Integer.parseInt(danString);
		
		
		out.println("<html><head><title>구구단</title></head></body>");
		out.println("<ul>");
		for (int i = 1; i <= 9; i++) {
			out.println("<li>" + gogodan + " X " + i + " = " + (gogodan * i) + " </li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		
		
		
		
	}
	
}
