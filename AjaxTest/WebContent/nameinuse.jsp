<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 		<meta name="viewport" content="width=device-width">
 		 <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<title>Create New Account</title>
</head>
<body>

 <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                    </button><a class="navbar-brand" href="#">QuizPapa</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Home</a>
                        </li>
                        <li>
                            <a href="#about">About</a>
                        </li>
                        <li>
                            <a href="#contact">Contact</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-right" action="LoginServlet" method="post">
                        <div class="form-group">
                            <input type="text" placeholder="Username" name="username" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="Password" name="password" class="form-control">
                        </div>
                        <div class="form-group">
                        <input type="submit" class="btn btn-success" value="Login" />
                        </div>
                        <div class="form-group">
                        
                   
                        <a href="createaccount.html" class="btn btn-success">Create Account</a>
                        </div>
                    </form>
                </div><!--/.navbar-collapse -->
                
                  
        
            </div>
        </div>


 <h1> Username <%= request.getParameter("username") %> already in use.</h1>
 <p> Please enter another username and password. </p>

  <form action="CreateAccountServlet" method="post">
  	
  	<p>Enter Name: <input type="text" name="username" />
  	<p>Password: <input type="text" name="password" />
	<input type="submit" value="Login"/></p>
</form>
</body>
</html>