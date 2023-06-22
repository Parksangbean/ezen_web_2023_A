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
function login() { //로그인 함수
		let id = document.querySelector('.id').value // 아이디 값
		let password = document.querySelector('.password').value // 비번 값

		if (아이디.indexOf(id) == -1) {
			alert('없는 아이디입니다');
		} else if (비밀번호.indexOf(password) == -1) {
			alert('비밀번호가 틀렸습니다');
		} else {
			alert('로그인 성공');

			document.querySelector('.id').value = '';
			document.querySelector('.password').value = '';

		}
	} //로그인 함수 end