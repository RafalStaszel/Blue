<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja i usuwanie </title>
</head>
<body>

<h2>Edycja</h2>

<p>Edycja umów</p>

<p>Wybierz identyfikator umowy</p>
<form:form commandName="newRecord" method="POST" action="/record/edit.html">
    <form:select items="${records}" path="id" itemValue="id" itemLabel="id"></form:select>
    <form:button>Edytuj</form:button>
</form:form>
<br>

<p>Wybierz umowę do usunięcia</p>

<table border="1">
    <th>id</th>
    <th>Nr umowy</th>
    <th>system</th>
    <c:forEach items="${records}" var="record">
        <tr>
            <td><a href="<c:url value="/record/delate.html"/>?id=${record.id}">${record.id}</a></td>
            <td>${record.nrTrade}</td>
            <td>${record.system}</td>
        </tr>
    </c:forEach>
</table>
<br>

<p>Edycja systemów</p>

<br>
<form:form commandName="newProduct" method="POST" action="/record/edit.html">
    <form:select items="${products}" path="nr" itemValue="nr" itemLabel="nr"></form:select>
    <form:button>Edytuj</form:button>
</form:form>
<br>

<p>p>Wybierz system do usuniecia</p></p>

<br>
<table border="1">
    <th>id</th>
    <th>System</th>
    <th>Klient</th>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><a href="<c:url value="/product/delate.html"/>?nr=${product.nr}">${product.nr}</a></td>
            <td>${product.nr}</td>
            <td>${product.system}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
