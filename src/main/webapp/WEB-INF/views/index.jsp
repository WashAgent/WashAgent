<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>index.jsp ¶¹´Ù!!</h1>
 
 <c:forEach var="member" items="${Member}">
    <p><c:out value="${member.name}" /></p>
    <p><c:out value="${member.id}" /></p>
    <p><c:out value="${member.pw}" /></p>
</c:forEach>

 
</body>
</html>