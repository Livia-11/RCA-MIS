<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>
<form action="StudentController" method="POST">
    <label> ID</label><input type="text" name="id"><br>
    <label> Name</label><input type="text" name="name"><br>
    <label> Email</label><input type="text" name="email"><br>
    <input type="submit" value="Register">
</form>
<h2> List of students</h2>
<table>
    <tr>
        <th> Id</th>
        <th> Name</th>
    </tr>

    <c:forEach var="student" items="${students}">
        <tr><td><c:out value="${student.id}"/></td>
            <td><c:out value="${student.name}"/></td>
        </tr>

    </c:forEach>
</table>
<h2>${me.name}</h2>
</body>
</html>dd