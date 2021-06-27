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
    <h1 align="center">Package Information</h1>
    <br/>
    <table border="1" cellpadding="10">
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Start Location</th>
            <th>End Location</th>
            <th>No of Nights</th>
            <th>No of Days</th>
            <th>Notes</th>
        </tr>
        <c:forEach var="package" items="${packages}">
        <tr>
            <td>${package.name}</td>
            <td>${package.description}</td>
            <td>${package.price}</td>
            <td>${package.start_date}</td>
            <td>${package.end_date}</td>
            <td>${package.start_location}</td>
            <td>${package.end_location}</td>
            <td>${package.number_of_nights}</td>
            <td>${package.number_of_days}</td>
            <td>${package.notes}</td>
            <td><a href="/update-package/${package.id}">Update</a></td>
            <td><a href="/delete-package/${package.id}">Delete</a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>