<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="${pageContext.request.contextPath}/update" method="post" modelAttribute="stud">
 
 	ID :  <form:input path="id" readonly="true" />
		<br>
 	Name :  <form:input path="name" />
		<br>
 	Marks :  <form:input path="marks" />
		<br>

		<input type="submit" value="UPDATE">

	</form:form>


</body>
</html>