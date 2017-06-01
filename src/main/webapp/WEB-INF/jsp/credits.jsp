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

    <nav><a class="menu" href="recordTable.html">Tabela umowy</a><a class="menu" href="productTable.html">Produkty i
        klienci</a><a class="menu" href="edit.html">Edycja</a><a class="menu" href="addRecord.html">Dodaj umowę</a><a
            class="menu" href="addProduct.html">Dodaj produkt</a><a class="menu active" href="credits.html">O programie</a>
    </nav>
<h2>O programie</h2>
<p>Z tego miejsca pozdrawiam serdecznie tych, którzy pochylają się nad tym kodem.<br>
Data stworzenia 26.05-01.06.17 - Rafał<br>
    Do wdrożenia:<br>
    JQuery Table - w pełni funkcyjnalna;<br>
    Walidacja wprowadzanych danych;<br>
    Konkretne typy danych w encjach, zamiast łańcuchów znaków;<br>
    Export do pliku;<br>
    Apache Tiles;<br>
    Spring Security;<br>

</p>
<footer>Prosty serwis do prezentowania aktualnych umów</footer>
</div>
</body>
</html>
