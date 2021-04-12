<%--
  Created by IntelliJ IDEA.
  User: carlospadilla
  Date: 4/12/21
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/guess" method="POST">
    <label for="guess">Guess a number</label>
    <input type="number" name="guess" id="guess" min="1" max="3">
    <button>Guess number</button>
</form>
</body>
</html>
