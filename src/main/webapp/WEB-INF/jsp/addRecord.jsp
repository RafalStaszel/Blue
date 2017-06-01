<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="UTF-8">
    <title>Dodaj umowę </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimal-ui">

    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
    <header><img id="imgHeader" src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="Data Blue Intel"/></header>

    <nav><a class="menu" href="/recordTable.html">Tabela umowy</a><a class="menu" href="/productTable.html">Produkty i
        klienci</a><a class="menu" href="/edit.html">Edycja</a><a class="menu active" href="/addRecord.html">Dodaj umowę</a><a
            class="menu" href="/addProduct.html">Dodaj produkt</a><a class="menu" href="/credits.html">O programie</a>
    </nav>
<br>
<form:form commandName="record" action="/saveRecord.html" method="post">
    <p>Numer umowy</p>
    <form:hidden path="id"/>
    <form:input path="nrTrade" placeholder="00/000"></form:input><form:errors path="nrTrade"></form:errors> <br>
    <p>Zastosowany sytem</p>
    <form:input path="system" placeholder="system" required="true"></form:input><form:errors path="system"></form:errors> <br>
    <p>Od</p>
    <form:input path="fromTime" placeholder="mm/rok"></form:input><form:errors path="fromTime"></form:errors> <br>
    <p>Do</p>
    <form:input path="toTime" placeholder="mm/rok"></form:input><form:errors path="toTime"></form:errors> <br>
    <p>Zysk</p>
    <form:input path="income" placeholder="0"></form:input><form:errors path="income"></form:errors> <br>
    <p>Cykl rozliczenia</p>
    <form:select path="scale">
        <option value="">--</option>
        <form:option value="rok" label="rok"/>
        <form:option value="kwartal"   label="kwartał"/>
        <form:option value="miesiac"   label="miesiac"/>

    </form:select>
    <br>
    <p>Aktywna </p>
    <form:select path="active">
        <option value="">--</option>
        <form:option value="true" label="true"/>
        <form:option value="false"   label="false"/>
    </form:select>
    <form:button>Zapisz</form:button>
</form:form>
    <footer>Prosty serwis do prezentowania aktualnych umów</footer>
</div>
</body>
</html>
