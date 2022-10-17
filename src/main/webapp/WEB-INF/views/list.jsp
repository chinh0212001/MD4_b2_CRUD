<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<table border="1" style="width: 100%">
    <tr>
        <th>STT</th>
        <th>NAME</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <c:forEach var="ctm" items="${listCustomer}">
        <tr>
            <td>${ctm.id}</td>
            <td><a href="/detail/${ctm.id}">${ctm.name}</a></td>
            <td><a href="/show/update/${ctm.id}">Edit</a></td>
            <td><a href="/show/delete/${ctm.id}">Delete</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>