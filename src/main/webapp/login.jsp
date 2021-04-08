<%--
  Created by IntelliJ IDEA.
  User: carlospadilla
  Date: 4/8/21
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("profile.jsp");
        }
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="login.jsp" method="post">
    <label for="username">Enter Username</label>
    <input id="username" type="text" name="username" placeholder="Username">
    <br>
    <label id="password" for="password">Enter Password</label>
    <input type="password" name="password" placeholder="Password">
    <br>
    <button>Submit</button>
</form>


</body>
</html>
