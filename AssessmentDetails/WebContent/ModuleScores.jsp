<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(session.getAttribute("id").toString());
String name = session.getAttribute("name").toString();
int total = Integer.parseInt(session.getAttribute("total").toString());
int grade = Integer.parseInt(session.getAttribute("grade").toString());
%>
<form>
<h1 style="text-align:center"><b><u>Module Result:</u></b></h1>
<br>
<table border="1" align="center" margin=1px cellspacing="10" cellpadding="5">
<tr>
	<td>Trainee Id</td>
	<td><%=id %>
</tr>

<tr>
	<td >Module Name</td>
	<td><%=name %> 
</tr>

<tr>
	<td >Total</td>
	<td><%=total %> 
</tr>

<tr>
	<td >Grade</td>
	<td><%=grade %>
</tr>

</table>
</form>
</body>
</html>