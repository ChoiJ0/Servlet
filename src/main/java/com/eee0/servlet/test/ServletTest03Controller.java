package com.eee0.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class ServletTest03Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		
		SimpleDateFormat fomatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String DateString = fomatter.format(now);
		
		out.println("<html> <head> <title>기사</title> </head>");
		out.println("<body> <h1>[단독] 고양이가 야옹해</h1>");
		out.println("기사 입력시간 : " + DateString + "<hr> 끝 </body> </html>");
		
		
		
	}
	
}
