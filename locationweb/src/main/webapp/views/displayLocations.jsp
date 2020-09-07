<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display loactions</title>
</head>
<body>

Locations:
<table border="2">
<tr> 
<th>id</th>
<th>name</th>
<th>code</th>
<th>type</th>
</tr>
<c:forEach items="${locations }" var="location">
<tr>
<td>${location.id}</td>
<td>${location.name}</td>
<td>${location.code}</td>
<td>${location.type}</td>
<td><a href="deleteLocation?id=${location.id}">delete</a></td>
<td><a href="updateLocation?id=${location.id}">Update</a></td>
</tr>
</c:forEach>



</table>
<a href="location">Add Record</a>
${msg}
</body>
</html>