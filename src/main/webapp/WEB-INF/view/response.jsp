<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
	<center style="border : 2px solid green;padding:20px">
		<h2>Hello SPring MVC !</h2>
		Data : <%=request.getAttribute("data") %>  <br><br>
		Message: <%=request.getAttribute("message") %>
	</center>
</body>
</html>