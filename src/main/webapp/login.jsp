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
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }

%>
<html>
<jsp:include page="partials/head.jsp">
<jsp:param name="title" value="Login Page"/>
</jsp:include>

<body>
<%@include file="partials/navbar.html"%>
<h1>Login Page</h1>

<form action="/login.jsp" method="POST">
    <label for="username">Enter Username</label>
    <input id="username" type="text" name="username" placeholder="Username">
    <br>
    <label id="password" for="password">Enter Password</label>
    <input type="password" name="password" placeholder="Password">
    <br>
    <button>Submit</button>
</form>

<%@include file="partials/footer.html"%>
</body>
</html>
