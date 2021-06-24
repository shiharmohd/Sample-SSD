<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <h1>Create Booking</h1>
        <form:form method="post" action="/create-booking">
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
                    <td>Customer: </td>
                    <td>
                        <form:select path="customer_id">
                            <form:option value="NONE"> --SELECT--</form:option>
                            <form:option value="1">John</form:option>
                            <form:option value="2">Alen</form:option>
                            <form:option value="3">Jessica</form:option>
                            <form:option value="4">Sophia</form:option>
                            <form:option value="5">Milla</form:option>
                            <form:option value="6">Ronny</form:option>
                            <form:option value="7">Barrett</form:option>
                            <form:option value="8">Gabriel</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Booking Date: </td>
                    <td>
                        <form:input path="booking_date" cssClass="date-picker" />
                    </td>
                </tr>
                <tr>
                    <td>Payment Referance: </td>
                    <td>
                        <form:input path="payment_referance" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update" /></td>
                </tr>
            </table>
        </form:form>