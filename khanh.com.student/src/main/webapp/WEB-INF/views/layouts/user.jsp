<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="sitemesh"%>
 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@include file ="/WEB-INF/views/TagLib.jsp" %>
<%@taglib uri = "http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value='/assets/user/css/bootstrap.css'/>" rel="stylesheet" />

<!-- Customize styles -->
<link href="<c:url value='/assets/user/css/style.css'/>" rel="stylesheet" />

<!-- Font awesome styles -->
<link href="<c:url value='/assets/user/font-awesome/css/font-awesome.css'/>" rel="stylesheet" />

<link rel="shortcut icon" href="<c:url value='/assets/user/ico/favicon.ico'/>">
<title>Insert title here</title>
</head>
<body>
<p><spring:message code = "field.required"/></p>
 <sitemesh:body></sitemesh:body>
</body>
<script src="<c:url value='/assets/user/js/jquery.js'/>"></script>
<script src="<c:url value='/assets/user/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/assets/user/js/jquery.easing-1.3.min.js'/>"></script>
<script src="<c:url value='/assets/user/js/jquery.scrollTo-1.4.3.1-min.js'/>"></script>
<script src="<c:url value='/assets/user/js/shop.js'/>"></script>
</html>