<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>read.jsp</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<SCRIPT language=javascript>
function sendUpdate(){
		document.requestForm.command.value ="updateForm";
		document.requestForm.submit();
}	

function sendDelete(){
		var password = prompt("삭제할 게시물의 비밀번호를 입력하세요");	
		if(password){
			document.requestForm.command.value ="delete";
			document.requestForm.password.value = password;
			document.requestForm.submit();			
		}else{
			return false;
		}
}	
</script>
</HEAD>
<!-- request.setAttribute("resultContent", gContent); -->
<table align="center" cellpadding="5" cellspacing="2" width="600" border='1'>
    <tr>
        <td width="1220" height="20" colspan="4" bgcolor="#336699">
            <p align="center"><font color="white" size="3"><b>
            ${requestScope.resultContent.num}  번 게시물 자세히보기</b></font></p>
        </td>
    </tr>
    <tr>
        <td width="100" height="20">
            <p align="right"><b><span style="font-size:9pt;">작성자</span></b></p>
        </td>
        <td width="450" height="20" colspan="3"><span style="font-size:9pt;"><b>
		${requestScope.resultContent.author}</b></span></td>
    </tr>
    <tr>
        <td width="100" height="20" >
            <p align="right"><b><span style="font-size:9pt;">작성일</span></b></p>
        </td>
        <td width="300" height="20" "><span style="font-size:9pt;"><b>
		${requestScope.resultContent.writeday}</b></span></td>
        <td width="100" height="20" >
                <p align="right"><b><span style="font-size:9pt;">조회수</span></b></p>
		</td>
        <td width="100" height="20">
				<p><b><span style="font-size:9pt;"></span>
				${requestScope.resultContent.readnum}</b></p>
		</td>
    </tr>
    <tr>
        <td width="100" height="20">
            <p align="right"><b><span style="font-size:9pt;">제 목</span></b></p>
        </td>
        <td width="450" height="20" colspan="3"><span style="font-size:9pt;"><b>
		${requestScope.resultContent.title}</b></span></td>
    </tr>
    <tr>
		<td width="100" height="200" valign="top">
            <p align="right"><b><span style="font-size:9pt;">내 용</span></b></p>
        </td>
		<!-- 브라우저에 글 내용을 뿌려줄 때는 개행문자(\n)가 <br>태그로 변환된 문자열을 보여줘야 한다. -->
        <td width="450" height="200" valign="top" colspan="3"><span style="font-size:9pt;"><b>
		${requestScope.resultContent.content}</b></span></td>
    </tr>
    <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">&nbsp;</span></b></p>
        </td>
        <td height="20" colspan="3">
	        <table>
				<tr>
					<td>
						<!-- 수정시 필요한 데이터들을 hidden으로 숨겨놓고 폼 데이터로 보내준다. -->
						<form name="requestForm" method=post action="guestbook.do">
							<input type=hidden name=num value="${requestScope.resultContent.num}">
							<input type=hidden name="command" value="">
							<input type=hidden name="password" value="">
							<input type=button value="수정하기" onClick="sendUpdate()">
							<input type=button value="삭제하기" onClick="sendDelete()">
						</form>
					</td>
				</tr>
			</table>
		</td>
    </tr>
</table>
<hr>
<div align=right><span style="font-size:9pt;">&lt;<a href="guestbook.do">리스트로 돌아가기</a>&gt;</span></div>
