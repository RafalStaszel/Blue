<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Tabela umów </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimal-ui">

    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
    <header><img id="imgHeader" src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="Data Blue Intel"/></header>

    <nav><a class="menu active" href="recordTable.html">Tabela umowy</a><a class="menu" href="productTable.html">Produkty i
        klienci</a><a class="menu" href="edit.html">Edycja</a><a class="menu" href="addRecord.html">Dodaj umowę</a><a
            class="menu" href="addProduct.html">Dodaj produkt</a><a class="menu" href="credits.html">O programie</a>
    </nav>
    <br>
    Pole "search" można wykorzystac do wyświetlenia wszystkich aktywnych lub nie umów,<br>
    wpisując np. "true".
    <br>
    <table id="example" class="display" cellspacing="0" width="70%" style="overflow-x:auto">
    <thead>
    <tr>
        <th>Lp</th>
        <th>Nr umowy</th>
        <th>System</th>
        <th>Od</th>
        <th>Do</th>
        <th>Zysk</th>
        <th>Cykl</th>
        <th>Aktywna</th>
    </tr>
    </thead>
</table>
</div>
</body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        var data = eval('${recordList}');
        var table = $('#example').DataTable({
            "aaData": data,
            "aoColumns": [
                {"mData": "id"},
                {"mData": "nrTrade"},
                {"mData": "system"},
                {"mData": "fromTime"},
                {"mData": "toTime"},
                {"mData": "income"},
                {"mData": "scale"},
                {"mData": "active"}
            ],
            "paging": true
        });
    });
</script>

