<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.domain.*" %>
<%@ page import="java.util.ArrayList" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" href="style.css"></link>
</head>
<body>
	<h3>String 데이터 출력</h3>
	<%
		session.setAttribute("sessionData", "hi");
		request.setAttribute("requestData","Hello");	
		request.setAttribute("num",20);
		request.setAttribute("num2",40);
	%>
	${sessionScope.sessionData}
	<br/>
	${requestScope.requestData}
	<br/>
	${requestScope.num + requestScope.num2}
	<br/>
	
	
	<h3>DTO 데이터 출력</h3>
	<% 	Student student1 = new Student("김윤호",26);
		Student student2 = new Student("김도헌",25);
		session.setAttribute("yh", student1);
		session.setAttribute("dh", student2);
	%>
	${sessionScope.dh.age}
	
	<h3>ArrayList 데이터 출력</h3>
	<%
		ArrayList<Student> arr1 = new ArrayList<Student>();
		arr1.add(student1);
		arr1.add(student2);
		session.setAttribute("ar1", arr1);
	%>	
	${sessionScope.ar1[0]}
	<br/>
	${sessionScope.ar1[0].name}
	<br/>
	${sessionScope.ar1[0].age}
	<br/>
	<br/>
	${sessionScope.ar1[1]}
	<br/>
	${sessionScope.ar1[1].name}
	<br/>
	${sessionScope.ar1[1].age}
	
	<h3>ForEach: JSTL 반복문을 사용한 데이터 출력</h3>
	<c:forEach var="student" items="${ar1}">
	<li>${student.name} ${student.age}</li>
	</c:forEach>
	<h2>1~5 출력</h2>
	<h3>ForEach:step </h3>
	<%
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		session.setAttribute("nums", nums);
	%>
	<c:forEach var="num" items="${nums}">
		${num}
	</c:forEach>
	
		반복에 대한 상태 파악을 위해 count, index<br/>
	<table id="arrayList" border="1">
		<tr><th>index</th><th>var</th><th>count</th></tr>
		<c:forEach begin="1" end="5" var="myVar" varStatus="LoopStatus">
				<tr>
					<td>${LoopStatus.index}</td>
					<td>${myVar}</td>
					<td>${LoopStatus.count}</td>
				</tr>
		</c:forEach>
	</table>
	반복에 대한 상태 파악을 위해 count, index2<br/>
	<table id="arrayList" border="1">
		<tr><th>NO</th><th>var</th></tr>
		<c:forEach var="myVar" items="${sessionScope.arr}" varStatus="LoopStatus">
				<tr>
					<td>${LoopStatus.index}</td>
					<td>${myVar}</td>
				</tr>
		</c:forEach>
	</table>


	
</body>
</html>