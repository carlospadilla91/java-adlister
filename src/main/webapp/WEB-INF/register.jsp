<%--
  Created by IntelliJ IDEA.
  User: carlospadilla
  Date: 4/19/21
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>

    <h1>Register here</h1>
    <form action="/register" method="POST">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">
        <br>
        <label for="email">Email</label>
        <input type="text" id="email" name="email">
        <br>
        <label for="password">Password</label>
        <input type="password" id="password" name="password">
        <br>
        <button>Submit</button>
    </form>

</body>
</html>
