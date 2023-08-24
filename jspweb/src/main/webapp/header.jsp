<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<!-- 헤더 -->
			<div>
				<ul>
						<li><a href="/jspweb/index.jsp">홈으로</a> </li>
						<li><a href="/jspweb/visitlog/visitlog.jsp">방문록[절대경로]</a> </li>
						<li><a href="/jspweb/accountbook/accountbook.jsp">과제1.가계부</a></li>
						<li><a href="/jspweb/Member/signup.jsp">회원가입</a></li>				
				</ul>
			</div>
			
			
			
			<!-- 최신 JQERY  연결  -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		
</body>
</html>

<!-- 
	해더 많은 페이지에서 참조하는 페이지 이므로 공통적인 코드
	1. 라이브러리

 -->

<!-- 404: 경롬누제 [1.그 경로/파일 없거나 2. 없는데 경로에 오타 -->
			<!--
				상대경로 : 현위치 기준으로 경로 작성.
				visitlog/visitlog.jsp
				절대경로 : 모든 경로 작성.
				http://localhost/jspweb/visitlog/visitlog.jsp
				 - 해더파일은 불특정 페이지 경로에서 사용되므로 절대경로 링크 권장
				 
			  -->