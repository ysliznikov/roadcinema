<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
    <spring:url value="/resources/css/main.css" var="mainCss"/>
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/resources/img/logo.jpg" var="logoImg"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${mainCss}" rel="stylesheet"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
<div class="center-block header-logo">
    <h1>Welcome to our cinema next to road!</h1>
    <img src="${logoImg}" alt="RoadCinema">
</div>

<br>
<div class="center-block">
    <h2>To be continued ...</h2>
</div>

<spring:url value="/resources/js/main.js" var="mainJs"/>
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs"/>
<script src="${mainJs}"></script>
<script src="${bootstrapJs}"></script>
</body>
</html>
