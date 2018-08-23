<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="${pageContext.request.contextPath}/static/js/lib/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/lib/jquery-migrate-1.4.1.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/page/oracleBiz/oracleBiz.js"></script>


</head>
<body>
	<ul>
		<li><h1>oracleBizView.jsp</h1></li>
		<li><h1>현재시간 : ${currTime}</h1></li>
		<li><h1>데이타 A : ${oracleBiz.pagelayoutId}</h1></li>
		<li><h1>데이타 B : ${oracleBiz.name}</h1></li>
		<li><h1>데이타 C : ${oracleBiz.viewName}</h1></li>

		<li><span id="reloadBtn" style="cursor:pointer;">재조회</span></li>
		<li><span id="updateBtn" style="cursor:pointer;">정상업데이트</span></li>
		<li><span id="updateBadBtn" style="cursor:pointer;">실패업데이트</span></li>
	</p>	
	
</body>
</html>