<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Tour</title>
        </head>

        <body>
            <h1 align="center">Feedbacks</h1>
            <br />
            <table border="1" cellpadding="10">
                <tr>
                    <th>Booking ID</th>
                    <th>Description</th>
                    <th>Rating</th>
                </tr>
                <c:forEach var="feedback" items="${feedbacks}">
                    <tr>
                        <td>${feedback.booking_id}</td>
                        <td>${feedback.description}</td>
                        <td>${feedback.rating}</td>
                    </tr>
                </c:forEach>
            </table>
        </body>

        </html>