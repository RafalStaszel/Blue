<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimal-ui">

    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
    <header><img id="imgHeader" src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="Data Blue Intel"/></header>

    <nav><a class="menu" href="recordTable.html">Tabela umowy</a><a class="menu" href="productTable.html">Produkty i
        klienci</a><a class="menu active" href="edit.html">Edycja</a><a class="menu" href="addRecord.html">Dodaj umowę</a><a
            class="menu" href="addProduct.html">Dodaj produkt</a><a class="menu" href="credits.html">O programie</a>
    </nav>
<br>
<h2>Edycja</h2>
    <br>
<p>Edycja umów</p>
    <br>
<p>Wybierz identyfikator umowy</p>
    <form:form commandName="newRecord" method="POST" action="editRecord.html">
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
            <td><a href="<c:url value="delateRecord.html"/>?id=${record.id}">${record.id}</a></td>
            <td>${record.nrTrade}</td>
            <td>${record.system}</td>
        </tr>
    </c:forEach>
</table>
<br>

<p>Edycja systemów</p>

<br>
<form:form commandName="newProduct" method="POST" action="editProduct.html">
    <form:select items="${products}" path="nr" itemValue="nr" itemLabel="nr"></form:select>
    <form:button>Edytuj</form:button>
</form:form>
<br>

<p>Wybierz system do usuniecia</p></p>
<table border="1">
    <th>id</th>
    <th>System</th>
    <th>Klient</th>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><a href="<c:url value="delateProduct.html"/>?nr=${product.nr}">${product.nr}</a></td>
            <td>${product.nr}</td>
            <td>${product.system}</td>
        </tr>
    </c:forEach>
</table>
<footer>Prosty serwis do prezentowania aktualnych umów</footer>
</div>
</body>
</html>
