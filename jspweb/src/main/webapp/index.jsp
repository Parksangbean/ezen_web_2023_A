<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP파일안에 다른 JSP 파일 import 하기 -->
	<%@include file = "header.jsp" %>
		<!---------------------------------  캐러셀(bs) : 이미지 슬라이드 ----------------------------------------------->
		<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel" >
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner">
		    <div class="carousel-item active" data-bs-interval="10000" >
		      <img src="/jspweb/img/아이브.jpg" class="d-block w-100" alt="..."  >
		    </div>
		    <div class="carousel-item" data-bs-interval="10000" >
		      <img src="/jspweb/img/뉴진스.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item" data-bs-interval="10000" >
		      <img src="/jspweb/img/오마이걸.jpg" class="d-block w-100" alt="...">
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
		
		<!-- 카드(bs) : 다양한 컨텐츠를 표시하는 컨테이너[구역]  -->
		<div class="container"> <!-- container(bs) : 컨테이너 구역  -->
			<div class="productBox row row-cols-1 row-cols-md-4 g-4">
				<!-- JS가 HTML 넣어주는 위치 -->
			</div>
		</div>
			  
			  
			  
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
	<script src="/jspweb/js/index.js" type="text/javascript"></script>
	
	
	<!-- JSP파일안에 다른 JSP 파일 import 하기 -->
	<%@include file = "footer.jsp" %>
</body>
</html>