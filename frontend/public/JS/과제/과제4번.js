let 글쓰기페이지=[];
function 글쓰기(){ 
	let writer = document.querySelector('#writer').value; console.log(writer)
	let pwd = document.querySelector('#pwd').value; console.log(pwd)
	let title = document.querySelector('#title').value; console.log(title)
	let detail = document.querySelector('#detail').value; console.log(detail)
	
	let  articles ={작성자:writer,비밀번호:pwd,제목:title, 내용:detail}; console.log(articles)
	글쓰기페이지.push(articles);
	
		if(writer==''|| pwd==""||title==""||detail==""){alert('[공백] 다시 입력해주세요.'); return;}
		document.querySelector('#writer').value = '';
		document.querySelector('#pwd').value = '';
		document.querySelector('#title').value = '';
		document.querySelector('#detail').value = '';
		alert('글쓰기 등록이 완료했습니다.')
		
}
