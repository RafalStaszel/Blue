<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie systemu</title>
</head>
<body>
<h2>Dodaj system</h2>
<form:form commandName="product" action="/product/save.html" method="post">
    <p>Nazwa systemu</p>
    <form:input path="system" placeholder="system" required="true"></form:input><form:errors path="system"></form:errors> <br>
    <p>Opis</p>
    <form:input path="sytemDiscription" placeholder="opis systemu"></form:input><form:errors path="sytemDiscription"></form:errors> <br>
    <p>Klient</p>
    <form:input path="systemOwner" placeholder="klient"></form:input><form:errors path="systemOwner"></form:errors> <br>

    <form:button>Zapisz</form:button>
</form:form>
</body>
</html>
