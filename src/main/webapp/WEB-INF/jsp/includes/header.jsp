<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>

	<spring:url value="/resources/js/jquery-1.12.1.min.js"
	var="jqueryJs" />
		<script src="${jqueryJs}"></script>
	<spring:url value="/resources/js/jquery.dataTables.js"
	var="datatable" />
		<script src="${datatable}"></script>
	<spring:url value="/resources/css/jquery.dataTables.css" var="jquerydataTables" />
		<link href="${jquerydataTables}" rel="stylesheet" />
	<spring:url value="/resources/css/jquery.dataTables.min.css" var="jquerydataTablesMin" />
		<link href="${jquerydataTablesMin}" rel="stylesheet" />
	<spring:url value="/resources/css/common.css" var="common" />
		<link href="${common}" rel="stylesheet" />
<head>

		<meta charset="UTF-8">
		<title>Blue Data </title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimal-ui">

		<link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>