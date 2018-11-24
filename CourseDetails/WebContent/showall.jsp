<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="enrollsucess">
<table>
<tr>
<th>Id</th>
<th>CourseName</th>
<th>Fee</th>

</tr>
<a:forEach var="course" items="${temp}">
<tr>
<td>${course.cid}</td>
<td>${course.cname}</td>
<td>${course.cfee}</td>
<td><input type="button" value="Enroll"></td>
</tr>
</a:forEach>

</table>
</form>
</body>
</html>