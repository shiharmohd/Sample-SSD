<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Create Rideout</h1>
<form:form method="post" action="/create-rideout">
    <table>
        <tr>
            <td>Route: </td>
            <td><form:input path="route"/></td>
        </tr>
        <tr>
            <td>Start Location: </td>
            <td><form:input path="startLocation"/></td>
        </tr>
        <tr>
            <td>End Location: </td>
            <td><form:input path="endLocation"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
</form:form>
