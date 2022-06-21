package com.eee0.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class ServletTest08Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			
			PrintWriter out = response.getWriter();
			
			String address = request.getParameter("addr");
			String card = request.getParameter("card");
			String money = request.getParameter("price");
			
			int price = Integer.parseInt(money);
			
			out.println("<html> <head> <title>주문출력</title> </head> <body>");
			
			if (card.equals("신한카드")) {
			 	out.println("<h4>결재 불가 카드입니다.</h4>");
				return;
			} else if (address.contains("서울시")) {
				out.println("<h4>" + address + " 배달 준비중</h4>");
				out.println("<hr> 결제금액 : " + price + "원");
				return;
			} else {
				out.println("<h4>배달 불가 지역입니다.</h4>");
			}
			
			out.println("</body> </html>");
			
			/* 
			 * if (!address.contains("서울시")) {
			 *  out.println("<h2>배달 불가 지역입니다.</h2>")
			 *  } else if (card.equals("신한카드")) {
			 *  	out.println("<h2>결재 불가 카드입니다.</h2>")
			 *  } else {
			 *  	out.println("<h3>" + address + "배달 준비중</h3>");
			 *  	out.println("결재금액 : " + price + "원");
			 *  }
			 * 
			 * */
			
			
			
			
	}
	
}
