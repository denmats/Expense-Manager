<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Expense Manager</title>
</head>
<body>
<h1>Expense Tracker</h1>
<p>${message}</p>

<a href="${contextRoot}/expense">Add Expense</a>

<c:forEach var="expense" items="${expenses}">
    <div>
        <h3>${expense.expensename}</h3>
        <p>&#122;&#322;${expense.amount}</p>
    </div>
</c:forEach>

</body>
</html>