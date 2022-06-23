<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
td{
	margin: 0;
	padding: 0;
	border: 1px solid #808080;
	
}
th{
	margin: 0;
	padding: 0;
	border: 1px solid #808080;
	
}
table{
border-spacing: 0px;
}
p{
text-align: center;
}
</style>
<meta charset="UTF-8">
<title>getAllPeople</title>
</head>
<body>
	<a href="douzone">홈</a>
	<c:if test="${param.type== 'Student'}">
	<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
	<th>나이</th><th>이름</th><th>지각</th><th>결석</th><th>매니저ID</th>
	<c:forEach items="${requestScope.allStudent}" var="data">
		<tr>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">${data.age}</span></p>
		        </td>
		        <td bgcolor="">
					<p><span style="font-size:9pt;">
					${data.name}</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
						 ${data.attendance}
					</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
		             ${data.absent}</span></p>
		        </td>
		        <!-- managerID값을 찾을 수 없음 이유는 알 수 없음,-->
		        <td><p align="center"><span style="font-size:9pt;">
		             ${data.managerID}</span></p></td>
		    
		    </tr>
	</c:forEach>
</table>
</c:if>

	<c:if test="${param.type=='Instructor'}">
	<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
	<th>아이디</th><th>이름</th><th>연락처</th>
	<c:forEach items="${requestScope.allInstructor}" var="data">
		<tr>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">${data.instructorId}</span></p>
		        </td>
		        <td bgcolor="">
					<p><span style="font-size:9pt;">
					${data.instructorName}</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
						 ${data.instructorPhone}
					</span></p>
		        </td>
		    </tr>
	</c:forEach>
</table>
</c:if>
	<c:if test="${param.type=='Manager'}">
	<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
	<th>아이디</th><th>이름</th><th>연락처</th>
	<c:forEach items="${requestScope.allManager}" var="data">
		<tr>
		       <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">${data.managerID}</span></p>
		        </td>
		        <td bgcolor="">
					<p><span style="font-size:9pt;">
					${data.managerName}</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
						 ${data.managerPhone}
					</span></p>
		        </td>
		    </tr>
	</c:forEach>
</table>
</c:if>
</body>
</html>