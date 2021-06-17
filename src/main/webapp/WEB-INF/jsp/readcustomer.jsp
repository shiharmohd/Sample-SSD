<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tour</title>
</head>
<body>
    <h1 align="center">Customers</h1>
    <br/>
    <table border="1" cellpadding="10">
        <tr>
            <th>Customer Name</th>
            <th>Address</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Contact Number</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.address}</td>
            <td>${customer.email}</td>
            <td>${customer.gender}</td>
            <td>${customer.mobNumber}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>