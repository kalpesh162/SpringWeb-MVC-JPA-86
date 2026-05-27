<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="show" modelAttribute="stud" method="post">

First Name : <form:input path="firstName"/>
<br>
Last Name: <form:input path="lastName"/>
<br>

Gender : <br>
Male : <form:radiobutton path="gender" value="Male"/>
<br>
Female : <form:radiobutton path="gender" value="Female"/>

<br>

Courses :

C :  <form:checkbox path="courses" value="C"/> <br>
CPP :  <form:checkbox path="courses" value="CPP"/> <br>
JAVA :  <form:checkbox path="courses" value="JAVA"/> <br>
C# :  <form:checkbox path="courses" value="C#"/> <br>



Year Of Passing :

<form:select path="yearOfPass">
<form:option value="1999" label="1999"></form:option>
<form:option value="2000" label="2000"></form:option>
<form:option value="2004" label="2004"></form:option>
<form:option value="2008" label="2008"></form:option>
<form:option value="2012" label="2012"></form:option>
<form:option value="2013" label="2013"></form:option>
<form:option value="2014" label="2014"></form:option>
</form:select>
<br>

<input type="submit" value="Register">


</form:form>

</body>
</html>
