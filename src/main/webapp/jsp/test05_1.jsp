<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<%
		int length = Integer.parseInt(request.getParameter("num"));
		String[] check = request.getParameterValues("check");
		
		String result = "";
		for(int i =0; i < check.length; i++) {
			String checked = check[i];
			if(checked.equals("in")) {
				double in = length * 0.39;
				// result = result + in + "in";
				result += in + " in<br>";
			} else if(checked.equals("yd")) {
				double yd = length * 0.010936133;
				result += yd + " yd<br>";
			} else if(checked.equals("ft")) {
				double ft = length * 0.032808399;
				result += ft + " ft<br>";
			} else {
				double m = length / 100.0;
				result += m + " m<br>";
			}
		}
		
	
	%>
	
	<div>
		<h2>변환 결과</h2>
		<div><%= length %> cm</div><hr>
		<div><%= result %></div>
	</div>
</body>
</html>