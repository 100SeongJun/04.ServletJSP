<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	margin: 0;
	padding: 0;
	border: 1px solid #808080;
}

table {align:center;border:0;cellpadding:5;cellspacing:2;width
	:100%;bordercolordark :white;bordercolorlight: black
	
}

p {
	text-align: center;
}

th {
	margin: 0;
	padding: 0;
	border: 1px solid #808080;
	background-color: #909000;
}

table {
	border-spacing: 0px;
}
</style>
</head>
<body>
	<div>
		<form action="student" method="post" onsubmit=true>
			<input type="hidden" name="cmd" value="allData">
			<p>
				학생 모든 정보 출력
				<button>정보출력</button>
			</p>
		</form>
		<form action="student" method="post" onsubmit=true>
		<input type="hidden" name="cmd" value=null>
		<button>
		홈
		</button>
		</form>
	</div>
	<c:if test="${requestScope.allStudent != null}">
		<table>
			<tr>
				<th>나이</th>
				<th>이름</th>
				<th>지각</th>
				<th>결석</th>
				<th>매니저ID</th>
				<th>정보삭제</th>
			</tr>
			<c:forEach items="${requestScope.allStudent}" var="data">
				<tr>
					<td bgcolor="">
						<p align="center">
							<span style="font-size: 9pt;">${data.age}</span>
						</p>
					</td>
					<td bgcolor="">
						<p>
							<span style="font-size: 9pt;"> ${data.name}</span>
						</p>
					</td>
					<td bgcolor="">
						<p align="center">
							<span style="font-size: 9pt;"> ${data.attendance} </span>
						</p>
					</td>
					<td bgcolor="">
						<p align="center">
							<span style="font-size: 9pt;"> ${data.absent}</span>
						</p>
					</td>
					<!-- managerID값을 찾을 수 없음 이유는 알 수 없음,-->
					<td><p align="center">
							<span style="font-size: 9pt;"> ${data.managerID}</span>
						</p></td>
					<td><p align="center">
							<span style="font-size: 9pt">
								<button onclick="">삭제</button>
							</span>
						</p></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>