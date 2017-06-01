<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="UTF-8">
    <title>Dodaj produkt </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimal-ui">

    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
    <header><img id="imgHeader" src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="Data Blue Intel"/></header>

    <nav><a class="menu" href="/recordTable.html">Tabela umowy</a><a class="menu" href="/productTable.html">Produkty i
        klienci</a><a class="menu" href="/edit.html">Edycja</a><a class="menu" href="/addRecord.html">Dodaj umowę</a><a
            class="menu active" href="/addProduct.html">Dodaj produkt</a><a class="menu" href="/credits.html">O programie</a>
    </nav>
<br>
<form:form commandName="product" action="/saveProduct.html" method="post">
    <form:hidden path="nr"/>
    <p>Nazwa systemu</p>
    <form:input path="system" placeholder="system" required="true"></form:input><form:errors path="system"></form:errors> <br>
    <p>Opis</p>
    <form:input path="sytemDiscription" placeholder="opis systemu"></form:input><form:errors path="sytemDiscription"></form:errors> <br>
    <p>Klient</p>
    <form:input path="systemOwner" placeholder="klient"></form:input><form:errors path="systemOwner"></form:errors> <br>

    <form:button>Zapisz</form:button>
</form:form>
    <footer>Prosty serwis do prezentowania aktualnych umów</footer>
</div>
</body>
</html>
