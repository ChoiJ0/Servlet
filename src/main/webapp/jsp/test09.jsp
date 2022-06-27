<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>
	<%
		Calendar day = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일");
		String DateString = formatter.format(day.getTime());
	%>
	
	<div class="container">
		<h4>오늘부터 1일</h4>
		<%
		for(int i = 1; i <= 10; i++) {
			day.add(Calendar.DATE, i);
			SimpleDateFormat matter = new SimpleDateFormat("d일");
			String date = matter.format(day.getTime());
		%>
		<div><%= date + "00일 : " + DateString %></div>
		<%
		}
		%>
	</div>
	
</body>
</html>