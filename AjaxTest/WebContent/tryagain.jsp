<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Try Again</title>
</head>
<body>
<h1> Please Try Again</h1>
<p>Either your username or password is incorrect. Please try again.</p>

  <form action="LoginServlet" method="post">
  	
  	<p>Enter Name: <input type="text" name="username" />
  	<p>Password: <input type="text" name="password" />
	<input type="submit" value="Login"/></p>
</form>

  <a href="createaccount.html">Create New Account</a>
</body>
</html>