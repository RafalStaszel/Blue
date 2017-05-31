
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie umowy</title>
</head>
<body>
<h2>Dodaj umowę</h2>
<form:form commandName="record" action="/record/save.html" method="post">
    <p>Numer umowy</p>

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
    <%--<form:input path="scale" placeholder="miesiac/rok"></form:input><form:errors path="scale"></form:errors> <br>--%>
    <form:select path="scale">
        <option value="">--</option>
        <form:option value="rok" label="year"/>
        <form:option value="kwartal"   label="kwartal"/>
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
</body>
</html>
