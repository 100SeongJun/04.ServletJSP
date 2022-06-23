<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp05_JSTL</title>
</head>
<body>
	 <c:out value="jsp05_JSTL"></c:out>
	 <br/>
	 <c:out value="안녕하세요"></c:out>
	 <br/>
	 <c:if test="${1==1}" var="result1">실행조건</c:if>
	 <br/>
	 <c:if test="${result1}">실행됨</c:if>
	 
	 <br/>
	 step02 : JSTL 다중조건 
	 <br/>
	 <% session.setAttribute("busan", "7층"); %>
	 ${sessionScope.busan}
	 <c:choose>
	<c:when test="${sessionScope.busan == '6층'}">
		여기는 공사중
	</c:when>	 
	<c:when test="${sessionScope.busan=='7층'}">
		여기는 수업중??
	</c:when>	
	<c:otherwise>글쎄...?</c:otherwise> 
	 </c:choose>
	 <% request.setAttribute("data","ㅁㅇㄴㅁ"); %>
	 <c:if test="${empty requestScope.data}">null값임</c:if>
	 <c:if test="${not empty requestScope.data}">null값 아님</c:if>
</body>
</html>