package com.eee0.database.test;


import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eee0.common.MysqlService;

@WebServlet("/db/test01/insert")
public class ServletDBtest02InsertController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		MysqlService mysqlservice = MysqlService.getInstance();
		mysqlservice.connect();
		
		String name = request.getParameter("site");
		String url = request.getParameter("url");
		
		String query = "INSERT INTO `url_favorites`\r\n"
				+ "(`name`, `url`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUE\r\n"
				+ "('" + name + "', '" + url + "', now(), now());";
		
		mysqlservice.update(query);
		
		try {
			response.sendRedirect("/db/test01.jsp");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
