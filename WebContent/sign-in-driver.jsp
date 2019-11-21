
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drive-signin</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.2/cerulean/bootstrap.min.css" rel="stylesheet" integrity="sha384-EmRcsPP774S9MOi4ywB+JXUWjYnBdyInMzG2XsC5siZEUpexqxOMJW358dCYEjPu" crossorigin="anonymous">
<!-- <link rel="stylesheet" href="css/cssindex.css">  --> 

<link href="css/firstpage/style.css" rel="stylesheet">
 <style type="text/css">
	body{
		 postion:relative;
		  min-height:100%;
		 }
        #body{
        	
            margin: 0 20px 20px 20px;
             border: 1px solid rgb(198, 194, 194);
            padding: 30px;
        }
        .nav{
           padding: 10px;
            background-color: cadetblue;
        }
	 #footer{
       position:absolute;
       bottom:0;
         left:0;
           right:0;
        } 

</style> 
</head>
<body>
<div >

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark" >
        <a href="index.jsp" class="btn btn-success btn-lg" type="button">&nbsp;&nbsp;Home&nbsp;&nbsp;</a> 
        <a href="about.jsp" class="btn btn-success btn-lg" type="button">&nbsp;&nbsp;About Us&nbsp;&nbsp;</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">

            <ul class="navbar-nav mr-auto">

                <li class="nav-item" style=" padding-left: 4em; padding-right: 2em;">
                    <span style="color:yellow; padding-left: 2em; padding-right: 1em; font-size:1.5em">Driver Sign In Page !</span>
                </li>
            </ul>

            <form class="form-inline my-2 my-lg-0" >

                <a href="sign-up.jsp" class="btn btn-success btn-lg" type="button">SignUp</a>

            </form>

        </div>
    </nav>

</div>

  <h3 style="text-align:center;"></h3>
    <form action="signindriver" method="post" id="body">
    
    
    <c:if test = "${!empty error}">
    	<h3 style = "color:red">Username or Password is Incorrect!</h3>
    	</c:if>
    
    
        <div class="form-row">        
          <div class="form-group col-md-6">
            <label for="username">User Name</label>
            <input type="email" class="form-control" name="username" id="username" placeholder="example@gmail.com" required>
          </div>
          <div class="form-group col-md-6">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" id="password" placeholder="Password" required>
          </div>
        
        </div>
        <button type="submit" class="btn btn-primary">Sign in</button>
      </form>
      <footer id="footer">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 text-lg-left text-center">
          <div class="copyright">
            &copy; Copyright <strong>Public-Ride</strong>. All Rights Reserved
          </div>
        </div>
        <div class="col-lg-6">
          <nav class="footer-links text-lg-right text-center pt-2 pt-lg-0">
            <a href="index.jsp" class="scrollto">Home</a>
            <a href="about.jsp" class="scrollto">About</a>
          </nav>
        </div>
      </div>
    </div>
  </footer><!-- #footer -->
</body>
</html>