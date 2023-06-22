let 아이디 = [ ]
let 비밀번호 = [ ]

function join(){
	let id = document.querySelector(".id")
	let password = document.querySelector(".password")					
		 if(  id.value.length >= 8 &&  password.value.length >=8 ){
			 아이디.push(id.value);
			 비밀번호.push(password.value);
			 alert('회원가입 완료')				
		} else {
			alert('회원가입 실패')			
		}	
		id.value = ""
		password.value = ""		
}
function login(){
	let id = document.querySelector(".id")
	let password = document.querySelector(".password")
				
		if(login.value.length>=8 && password.value.length>=8 && id.indexOf(login.value)!=-1 && password.indexOf(password.value)!=-1){
		 아이디.push(id.value);
		 비밀번호.push(password.value);
		alert('로그인이 완료되었습니다')
	}else if(login.value.length<8){
		아이디.push(id.value);
		비밀번호.push(password.value);
		alert('아이디를 8글자 이상 입력하세요')
	}
	else if(password.value.length<8){
		아이디.push(id.value);
		비밀번호.push(password.value);
		alert('비밀번호를 8글자 이상 입력하세요')
	}else{
		
		alert('아이디 또는 비밀번호를 확인해주세요')
	}
		id.value = "" 
		password.value = ""		
}