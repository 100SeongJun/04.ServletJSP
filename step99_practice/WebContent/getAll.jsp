<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>subMain</title>
</head>
<body>

<form action="douzone?cmd=allData&type=Student" method="post" onSubmit=true >
	<input type="hidden" name ="cmd" value ="allStudent">
	<div>학생 모든 정보 출력<button>출력</button></div>
</form>

<form action="douzone?cmd=allData&type=Instructor" method="post" onSubmit=true>
<input type = "hidden" name="cmd" value="allInstructor">
<div>강사 모든 정보 출력<button>출력</button></div>
</form>

<form action="douzone?cmd=allData&type=Manager" method="post" onSubmit=true>
<input type = "hidden" name="cmd" value="allManager">
	<div>담당자 모든 정보 출력<button>출력</button></div>
</form>
</body>
</html>