// 1. 글쓰기 버튼을 클릭하면
function onWrite(){
	
	if(loginState){ // - 만약에 비 로그인이면 로그인 페이지로 이동
		location.href="/jspweb/board/write.jsp"; // - 로그인이면 쓰기 페이지로 이동
	}else{
		alert('로그인후 글쓰기 가능합니다.');
		location.href="/jspweb/Member/login.jsp"; // - 로그인이면 쓰기 페이지로 이동
	}
	
}