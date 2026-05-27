<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		${stud.firstName } <br> ${stud.lastName }<br> ${stud.gender }<br>
		
		<c:forEach var="course" items="${stud.courses}">
		     <c:out value="${course}"></c:out>
		</c:forEach>
		<br>
		${stud.yearOfPass }

	</h1>
</body>
</html>