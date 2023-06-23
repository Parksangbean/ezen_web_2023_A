let member =[]



function join(){
	let id = document.querySelector(".sid").value
	let pw = document.querySelector(".spassword").value					
		 if(  id.value.length >= 8 &&  pw.value.length >=8 ){
			 아이디.push(sid.value);
			 비밀번호.push(spassword.value);
			 alert('회원가입 완료')				
		} else {
			alert('회원가입 실패')			
		}	
		document.querySelector(".sid").value =""	
		document.querySelector(".spassword").value =""		
}

function login(){
	let id = document.querySelector(".id").value
	let pw = document.querySelector(".password").value	
	if(idary.indexOf(id) != -1 && idary.indexOf(id) == pwdary.indexOf(pw))
	{
		아이디.push(id.value);
			 비밀번호.push(password.value);
		aiert("로그인성공")
	}
		else{
			aiert("로그인실패")
		}
			document.querySelector(".id").value =""	
			document.querySelector(".pw").value =""	
			
}

