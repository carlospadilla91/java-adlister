<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Index Page"/>
</jsp:include>
<body>
<%@include file="partials/navbar.html"%>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
<%@include file="partials/footer.html"%>
</body>
</html>
