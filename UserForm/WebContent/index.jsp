<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
</head>
<body>
<h1>User Details</h1>
<form action="MainServlet" method="POST">
Enter your name:<input type="text" name="name"/><br><br>
Enter your age:<input type="number" name="age"/><br><br>
Enter contact no.:<input type="number" name="contact"/><br><br>
<input type="submit" value="click here"/>
</form>
</body>
</html>