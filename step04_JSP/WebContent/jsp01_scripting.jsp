<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- HTML 주석 -->
<%--JSP 주석 --%>
	<h2> step01 - scripting</h2>
	<%! String name = "busan"; %>
	<%= name %>
	<br/>
	<% out.println(name); %>
	<% int age = 29; %>
	<br/>
	<%= age %>
	
	<h2> step02 - EL(Expression Language)</h2>
	<table>
	<tr><td>2+3</td><td>${2+3}</td></tr>		
	<tr><td>2>3</td><td>${2>3}</td></tr>
	<tr><td>'a'=='a'</td><td>${'a'=='a'}</td></tr>
	<tr><td>'a'!='a'</td><td>${'a'!='a'}</td></tr>
	</table>

	<% // jsp에서 사용가능한 데이터 저장
	request.setAttribute("reqData", "요청 객체 데이터");
	%>
	${requestScope.reqData}	
</body>
</html>
