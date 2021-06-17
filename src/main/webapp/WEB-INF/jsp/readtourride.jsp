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
    <h1 align="center">Tour Information</h1>
    <br/>
    <table border="1" cellpadding="10">
        <tr>
            <th>Tour Start Date</th>
            <th>Tour End Date</th>
            <th>Tour Leader</th>
        </tr>
        <c:forEach var="tours" items="${tourrides}">
        <tr>
            <td>${tours.startDate}</td>
            <td>${tours.endDate}</td>
            <td>${tours.tourLeader}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>