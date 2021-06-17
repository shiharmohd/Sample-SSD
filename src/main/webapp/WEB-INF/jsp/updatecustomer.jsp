<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Update Contact</h1>
<form:form method="post" action="/update-contact/${id}">
    <table>
        <tr>
            <td>Customer Name: </td>
            <td><form:input path="customerName"/></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Gender: </td>
            <td><form:input path="gender"/></td>
        </tr>
        <tr>
            <td>Contact No: </td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form:form>