<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/17/2022
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form:form action="/delete" modelAttribute="customerDelete" method="post">
  <h1>Delete</h1>
  <p>${customerDelete.name}</p>
  <h4>YES to Delete or NO to back home</h4>
  <form:input path="id" type="hidden"/>
  <button type="submit">Delete</button>
</form:form>
<a href="/">No</a>
</body>
</html>