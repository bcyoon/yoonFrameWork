<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="${pageContext.request.contextPath}/resources/js/lib/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/lib/jquery-migrate-1.4.1.min.js"></script>


</head>
<body>
	<h1>oracleBizView.jsp</h1><p>
	<h1>pagelayoutId : ${oracleBiz.pagelayoutId}</</h1><p>
	<h1>name : ${oracleBiz.name}</</h1><p>
	<h1>viewName : ${oracleBiz.viewName}</</h1><p>
	
</body>
</html>