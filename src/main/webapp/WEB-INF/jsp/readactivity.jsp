<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Tour</title>
        </head>

        <body>
            <h1 align="center">Activitys Information</h1>
            <br />
            <table border="1" cellpadding="10">
                <tr>
                    <th>Package</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Type</th>
                    <th>Activity Date</th>
                    <th>Optional</th>
                    <th>Price</th>
                    <th>Notes</th>
                    <th>Location</th>
                </tr>
                <c:forEach var="activity" items="${activitys}">
                    <tr>
                        <td>${activity.package_id}</td>
                        <td>${activity.name}</td>
                        <td>${activity.description}</td>
                        <td>${activity.type}</td>
                        <td>${activity.activity_date}</td>
                        <td>${activity.optional}</td>
                        <td>${activity.price}</td>
                        <td>${activity.notes}</td>
                        <td>${activity.location}</td>
                        <td><a href="/update-activity/${activity.id}">Update</a></td>
                        <td><a href="/delete-activity/${activity.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </body>

        </html>