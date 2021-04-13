<%--
  Created by IntelliJ IDEA.
  User: carlospadilla
  Date: 4/13/21
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/ads/create" method="POST">
        <label for="userId">User ID</label>
        <input type="text" name="userId" id="userId">
        <br />
        <label for="title">Title</label>
        <input name="title" id="title" type="text">
        <br />
        <label for="description">Description</label>
        <input name="description" id="description" type="text">
        <br />
        <input type="submit">
    </form>

</body>
</html>
