<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function validate()
{
	var practical= document.getElementById("prac").value;
	
	if(practical>=0 || practical<=100)
		return true;
	else {
		alert('Invalid characters')
		return false;
	}
	
}
	
</script>
</head>
<body>
<form action="retrieve.obj" onsubmit="return validate()">
 


<h1 align="center"><b>Add Assessment Details</b></h1><hr>
<table border="0" align="center" cellspacing="10" cellpadding="5">
<tr>
		<td>Trainee Id:&nbsp;&nbsp;</td>
		<td>
			<select name="ddlId" style="width:70px">
			<c:forEach items="${sessionScope.list}" var="list">
        <option><c:out value="${list}" /></option>
    </c:forEach>
		</select>
		</td>
		</tr>
		<br>
<tr>

		<td>Module Name:&nbsp;&nbsp;</td>
		<td>
			<select name="ddlname" style="width:80px">
				
				<option value="Module1">
				Module 1</option>
				<option value="Module2">
				Module 2</option>
				<option value="Module3">
				Module 3</option>
				<option value="Module4">
				Module 4</option>
				<option value="Module5">
				Module 5</option>
			</select>
		</td>
	</tr>
	<br>
	
	
	<tr>
			<td>MPT:&nbsp;&nbsp;</td>
			<td><input style="width:150px" type="number" id="prac"name="practical" min="0" max="100"/>
	</tr>
	<br>
	<tr>
			<td>MTT:&nbsp;&nbsp;</td>
			<td><input style="width:150px" type="number"  name="theory" min="0" max="100"/>
	</tr>
	<br>
	<tr>
			<td>Assignment:&nbsp;&nbsp;</td>
			<td><input style="width:150px" type="number"  name="ass" min="0" max="100"/>
	</tr>
	<br>
	<tr>
	<td>
	<p id="submission"><input align="right" type="submit" class="btn" value="Submit"/></p>
	</td>
	
	</form>
</body>
</html>