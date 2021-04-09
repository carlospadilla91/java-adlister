<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="contact.Contact" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: carlospadilla
  Date: 4/9/21
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2>Active Contacts</h2>
    <table border="1" cellpadding="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Active</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="contact" items="${contacts}">
                <c:if test="${contact.isActive}">
                    <tr>
                        <td>${contact.id}</td>
                        <td>${contact.name}</td>
                        <td>${contact.email}</td>
                        <td>${contact.address}</td>
                        <td>${contact.phoneNumber}</td>
                        <td>${contact.isActive}</td>
                    </tr>
                </c:if>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>



