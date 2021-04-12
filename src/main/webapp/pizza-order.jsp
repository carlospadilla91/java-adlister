<%--
  Created by IntelliJ IDEA.
  User: carlospadilla
  Date: 4/9/21
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1></h1>
    <form action="/pizza-order" method="post">
        <label for="crust">Choose Crust</label>
        <select name="crust" id="crust">
            <option value="regular">Regular</option>
            <option value="thin">Thin</option>
            <option value="stuffed">Stuffed Crust</option>
        </select>
        <br>
        <label for="sauce">Choose Sauce</label>
        <select name="sauce" id="sauce">
            <option value="tomato">Tomato Sauce</option>
            <option value="white">White Garlic Sauce</option>
            <option value="bbq">BBQ Sauce</option>
        </select>
        <br>
        <label for="size">Choose Size</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <p>Choose Toppings</p>
        <input type="checkbox" id="pepperoni" name="toppings">
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="ham" name="toppings">
        <label for="ham">Ham</label>
        <input type="checkbox" id="sausage" name="toppings">
        <label for="sausage">Sausage</label>
        <br>
        <label for="address">Delivery address:</label>
        <input type="text" name="address" id="address">
        <br>
        <button type="submit" id="submitBtn">Submit</button>
    </form>
</body>
</html>
