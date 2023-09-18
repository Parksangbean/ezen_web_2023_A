<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/jspweb/css/product/list.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file = "../header.jsp" %>
	
	<div class="mapcontent">
		<!-- 지도를 표시할 div 입니다. -->
		<div id="map" style=""> </div>
		<!-- 사이드바 구역입니다. -->
		<div class="sidebar"></div>
	
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=3fb15e33b93bb6f921e4522dce2dbbf6&libraries=clusterer"></script>
	<script src="/jspweb/js/register/list.js" type="text/javascript"></script>
</body>
</html>
