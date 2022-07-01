package com.eee0.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eee0.common.MysqlService;

@WebServlet("/db/test01/delete")
public class ServletDBtest02deleteController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		
		MysqlService mysqlservice = MysqlService.getInstance();
		mysqlservice.connect();
		
		String query = "DELETE FROM `url_favorites` WHERE `id`= " + id + ";";
		
		mysqlservice.update(query);
		
		try {
			response.sendRedirect("/db/test01.jsp");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
