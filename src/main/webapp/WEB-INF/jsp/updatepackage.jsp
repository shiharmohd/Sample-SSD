<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Update Package Information</h1>
<form:form method="post" action="/update-package/${id}">
    <table>
        <tr>
            <td>Name: </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>
                <form:input path="email" />
            </td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>
                <form:input path="price" />
            </td>
        </tr>
        <tr>
            <td>Start Date: </td>
            <td>
                <form:input path="start_date" />
            </td>
        </tr>
        <tr>
            <td>End Date: </td>
            <td>
                <form:input path="end_date" />
            </td>
        </tr>
        <tr>
            <td>Start Location: </td>
            <td>
                <form:input path="start_location" />
            </td>
        </tr>
        <tr>
            <td>End Location: </td>
            <td>
                <form:input path="end_location" />
            </td>
        </tr>
        <tr>
            <td>No of Nights: </td>
            <td>
                <form:input path="number_of_nights" />
            </td>
        </tr>
        <tr>
            <td>No of Days: </td>
            <td>
                <form:input path="number_of_days" />
            </td>
        </tr>
        <tr>
            <td>Notes: </td>
            <td>
                <form:input path="notes" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form:form>