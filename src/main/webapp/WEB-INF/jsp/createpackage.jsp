<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <script>
        $(function () {
            $("#datepicker").datepicker();
        });
    </script>
        <h1>Create Package</h1>
            <form:form method="post" autocomplete="off" action="/create-package">
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
                            <form:input path="description" />
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
                            <form:input path="start_date" id="datepicker" />
                        </td>
                    </tr>
                    <tr>
                        <td>End Date: </td>
                        <td>
                            <form:input path="end_date" id="datepicker" />
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
                        <td><input type="submit" value="Create" /></td>
                    </tr>
                </table>
            </form:form>