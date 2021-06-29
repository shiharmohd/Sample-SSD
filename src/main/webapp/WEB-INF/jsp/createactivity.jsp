<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <h1>Create Activity</h1>
        <form:form method="post" autocomplete="off" action="/create-activity">
            <table>
                <tr>
                    <td>Package: </td>
                    <td>
                        <form:select path="package_id">
                            <form:option value="NONE"> --SELECT--</form:option>
                            <form:option value="1">Malaysia Tour Packages</form:option>
                            <form:option value="2">Mesmerizing Maldives Tour Package</form:option>
                            <form:option value="3">Kuala Lumpur Getaway</form:option>
                            <form:option value="4">Idyllic Maldives Honeymoon Tour Package</form:option>
                            <form:option value="5">Ecstatic Maldives Family Package</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Name: </td>
                    <td>
                        <form:input path="name" />
                    </td>
                </tr>
                <tr>
                    <td>Description: </td>
                    <td>
                        <form:input path="description" />
                    </td>
                </tr>
                <tr>
                    <td>Type: </td>
                    <td>
                        <form:input path="type" />
                    </td>
                </tr>
                <tr>
                    <td>Activity Date: </td>
                    <td>
                        <form:input path="activity_date" />
                    </td>
                </tr>
                <tr>
                    <td>Optional: </td>
                    <td>
                        <form:input path="optional" />
                    </td>
                </tr>
                <tr>
                    <td>Price: </td>
                    <td>
                        <form:input path="price" />
                    </td>
                </tr>
                <tr>
                    <td>Notes: </td>
                    <td>
                        <form:input path="notes" />
                    </td>
                </tr>
                <tr>
                    <td>Location: </td>
                    <td>
                        <form:input path="location" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Create" /></td>
                </tr>
            </table>
        </form:form>