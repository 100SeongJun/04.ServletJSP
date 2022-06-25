<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!-- 배열 또는 List, null 등에 데이터가 저장 되었는지 확인하기 위한 length() 사용을 위한 선언 -->


<table align="center" border="0" cellpadding="5" cellspacing="2"
	width="100%" bordercolordark="white" bordercolorlight="black">
	<tr>
		<td bgcolor="#336699">
			<p align="center">
				<font color="white"><b><span style="font-size: 9pt;">번
							호</span></b></font>
			</p>
		</td>
		<td bgcolor="#336699">
			<p align="center">
				<font color="white"><b><span style="font-size: 9pt;">제
							목</span></b></font>
			</p>
		</td>
		<td bgcolor="#336699">
			<p align="center">
				<font color="white"><b><span style="font-size: 9pt;">작
							성 자</span></b></font>
			</p>
		</td>
		<td bgcolor="#336699">
			<p align="center">
				<font color="white"><b><span style="font-size: 9pt;">작
							성 일</span></b></font>
			</p>
		</td>
		<td bgcolor="#336699">
			<p align="center">
				<font color="white"><b><span style="font-size: 9pt;">조
							회 수</span></b></font>
			</p>
		</td>
	</tr>

	<%-- fn:length = 컬렉션 항목수 or 문자열의 문자 수  --%>
	<c:if test="${empty list || fn:length(list) == 0}">
		<tr>
			<td colspan="5">
				<p align="center">
					<b><span style="font-size: 9pt;">등록된 방명록이 없습니다.</span></b>
				</p>
			</td>
		</tr>
	</c:if>

	<%-- ArrayList에  GuestBookBean 객체를 하나하나 data라는 반복 대입해서 사용 --%>
	<c:forEach items="${requestScope.list}" var="data">
		<tr>
			<td bgcolor="">
				<p align="center">
					<span style="font-size: 9pt;">${data.num}</span>
				</p>
			</td>
			<td bgcolor="">
				<p>
					<span style="font-size: 9pt;"> <!--  클릭은 제목 -> 해당 게시글의 상세보기
						상세보기를 위한 게시글 구분은 고유한 게시글 번호(num)
					 --> <a href="guestbook.do?command=read&num=${data.num}">${data.title}</a></span>
				</p>
			</td>
			<td bgcolor="">
				<p align="center">
					<span style="font-size: 9pt;"> <a
						href="mailto: ${data.email}"> ${data.author}</a>
					</span>
				</p>
			</td>
			<td bgcolor="">
				<p align="center">
					<span style="font-size: 9pt;"> ${data.writeday}</span>
				</p>
			</td>
			<td bgcolor="">
				<p align="center">
					<span style="font-size: 9pt;"> ${data.readnum}</span>
				</p>
			</td>
		</tr>
	</c:forEach>

	<tr>
		<td bgcolor="">
			<p align="center">
				<span style="font-size: 9pt;"></span>
			</p>
		</td>
		<td bgcolor="">
			<p>
				<span style="font-size: 9pt;"><a
					href="ReadAContent.jsp?num= "></a></span>
			</p>
		</td>
		<td bgcolor="">
			<p align="center">
				<span style="font-size: 9pt;"> <a href="mailto:"></a>
				</span>
			</p>
		</td>
		<td bgcolor="">
			<p align="center">
				<span style="font-size: 9pt;"></span>
			</p>
		</td>
		<td bgcolor="">
			<p align="center">
				<span style="font-size: 9pt;"></span>
			</p>
		</td>
	</tr>

</table>
<hr>
<div align=right>
	<span style="font-size: 9pt;">&lt;<a href="write.html">글쓰기</a>&gt;
	</span>
</div>

