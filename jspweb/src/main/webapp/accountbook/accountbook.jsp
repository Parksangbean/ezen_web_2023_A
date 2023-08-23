<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="accountbook.css" rel = "stylesheet"/>
<title>Insert title here</title>
</head>
<body>
	<div class="accountwrap">
		<div>
			<input class="atext" type="text" placeholder="항목내용">
			<input class="aprice" type="number" placeholder="금액">
			<input class="adate" type="date" placeholder="날짜">
			<button class="asave" type="button" onclick="asave()">저장</button>
		</div>
		<div class="acbottom">
			
		
		</div>
	
	</div>
	
	
	
	<!--  최신 jQUERY impot (AJAX() 사용할 JS파일 위에서 호출  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script >
	<!-- js imprt -->
	<script src="accountbook.js" type="text/javascript"></script>
</body>
</html>