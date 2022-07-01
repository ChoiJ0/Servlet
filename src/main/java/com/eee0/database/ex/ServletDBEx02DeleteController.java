package com.eee0.database.ex;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eee0.common.MysqlService;

@WebServlet("/db/ex02/delete")
public class ServletDBEx02DeleteController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		
		MysqlService mysqlservice = MysqlService.getInstance();
		mysqlservice.connect();
		
		String query ="DELETE FROM `new_user` WHERE `id` = "+ id +";";
		
		mysqlservice.update(query);
		
		try {
			response.sendRedirect("/db/ex02.jsp");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
