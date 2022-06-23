<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>error.jsp</title>
</head>
<body>
	
	죄송합니다. 문제가 발생하였습니다.<br>
	
	<br><hr><br>
	${requestScope.error}  
	<br>
	
	<a href="guestbook.do"> 리스트로 돌아가기</a>
	
</body>
</html>