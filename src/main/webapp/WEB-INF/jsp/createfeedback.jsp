<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <h1>Create Feedback</h1>
            <form:form method="post" action="/create-feedback">
                <table>
                    <tr>
                        <td>Booking</td>
                        <td>
                            <form:select path="booking_id">
                                <form:option value="NONE"> --SELECT--</form:option>
                                <form:option value="1">Book-2021-0001</form:option>
                                <form:option value="2">Book-2021-0002</form:option>
                                <form:option value="3">Book-2021-0003</form:option>
                                <form:option value="4">Book-2021-0004</form:option>
                                <form:option value="5">Book-2021-0005</form:option>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td>
                            <form:input path="description" />
                        </td>
                    </tr>
                    <tr>
                        <td>Rating</td>
                        <td>
                            <form:input path="rating" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Create" /></td>
                    </tr>
                </table>
            </form:form>