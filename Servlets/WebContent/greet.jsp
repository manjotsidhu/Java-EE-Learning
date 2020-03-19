<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greetings</title>
</head>
<body>
<h2> Welcome! <% out.print(request.getParameter("name")); %></h2>

</body>
</html>