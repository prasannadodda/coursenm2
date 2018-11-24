<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form  action="insertdata" modelAttribute="my">
<table>
<%-- <tr>
<td>Employee Id</td>
<td><for:input path="empId"/></td>
</tr> --%>

<tr>
<td>Course Name</td>
<td><for:input path="cname"/></td>
<td><for:errors path="cname"></for:errors></td>
</tr>

<tr>
<td>Course Fee</td>
<td><for:input path="cfee"/></td>
<td><for:errors path="cfee"></for:errors>
</tr>


<tr>
<td><input type="submit" value="Add Course"></input></td>
</tr>
</table>

</for:form>
</body>
</html>