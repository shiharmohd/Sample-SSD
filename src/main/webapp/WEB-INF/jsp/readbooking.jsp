<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Tour</title>
        </head>

        <body>
            <h1 align="center">Bookings</h1>
            <br />
            <table border="1" cellpadding="10">
                <tr>
                    <th>Package</th>
                    <th>Customer</th>
                    <th>Booking Date</th>
                    <th>Payment Referance</th>
                </tr>
                <c:forEach var="booking" items="${bookings}">
                    <tr>
                        <td>${booking.package_id}</td>
                        <td>${booking.customer_id}</td>
                        <td>${booking.booking_date}</td>
                        <td>${booking.payment_referance}</td>
                        <td><a href="/update-booking/${booking.id}">Update</a></td>
                        <td><a href="/delete-booking/${booking.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </body>

        </html>