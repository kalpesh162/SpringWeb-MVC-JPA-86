<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALL BOOKS</title>
<link href="<c:url value='/css/table.css'/>" rel="stylesheet">
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>MARKS</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>

		<c:forEach var="student" items="${studlist}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.marks}</td>

				<td><a href="delete/${student.id}">DELETE</a></td>


				<td>
					<form action="updateFormBookServlet" method="get"
						style="margin: 0;">
						<input type="hidden" name="id" value="${book.id}">
						<button type="submit" class="btn btn-update">Update</button>
					</form>
				</td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>