package com.eee0.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class ServletTest07Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		
		int num1 =  Integer.parseInt(number1);
		int num2 =  Integer.parseInt(number2);
		
		int addtion = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int divison = num1 / num2;
		
		out.println("<html> <head> <title>연산</title> </head> <body>");
		out.println("{\"addtion\" :\"" + addtion + "\", \"subtraction\" :\"" + 
		subtraction + "\", \"multiplication\" :\"" + multiplication + "\", \"divison\" :\"" + divison +"\"}");
		out.println("<button type=\"button\" onclick=\"window.history.back()\">뒤로가기</button>");
		out.println("</body> </html>");
		
		
		
	}
	
}
