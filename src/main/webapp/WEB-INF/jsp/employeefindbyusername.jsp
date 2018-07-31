<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>
<title>First Web Application</title>
</head>

<body>
<form method="get" action="findbyFullname" modelAttribute="fullname">
   <table style="with: 50%">
       			<tr>
                   					<td>View All Users by name</td>
                   					<h1>${fullname} </h1>
                   					<td><input type="text" name="username" value="username"/></td>
                   					<input type="submit" value="Submit" /></form>
                   				</tr>


                                   </body>
</body>

</html>