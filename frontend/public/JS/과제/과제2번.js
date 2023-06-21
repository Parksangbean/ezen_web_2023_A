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
			alert('로그인 실패')			
		}	
		id.value = ""
			password.value = ""		
}