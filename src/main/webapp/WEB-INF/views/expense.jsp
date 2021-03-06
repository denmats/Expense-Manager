<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Expense Manager</title>
</head>
<body>
<h1>Add expense</h1>

<form:form action="${contextRoot}/expense" method="post" modelAttribute="expense">
    <form:input path="expensename" placeholder="Enter expense name"/>
    <form:input path="amount" placeholder="Enter expense amount"/>
    <form:textarea path="note" placeholder="Enter note (optional)"/>

    <button type="submit">Add Expense</button>

</form:form>

</body>
</html>