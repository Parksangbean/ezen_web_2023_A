// 모든 함수에 접근 할수있는 배열 (member 객체 여러개를 저장하는) 선언
let 회원리스트 =[]
// 1. 등록 함수 [실행조건 : 회원가입 버튼을 출력했을때]
function 등록(){ console.log('등록(함수실행')
	// 1. 입력값 가져오기
		//1.document.querySelotor('.class').value
		//2.1.document.querySelotor('.#id').value
		let mid= document.querySelector('#mid').value; 			console.log(mid)
		let mpwd= document.querySelector('#mpwd').value	;	console.log(mpwd)
		
		// *유효성섬사1
		if(mid==''|| mpwd==""){alert('[회원가입실패]: 8글자 입력해주세요.'); return;}
		if(mid.length<8 || mpwd.length<8){alert('[회원가입실패]: 8글자 이상 일벽해주세요'); return;}
	
		
		// 2. 객체 담기 // 입력된 데이터(mid,mpwd) 를 {} 안에서 속성명(아이디.비밀번호)붙여서 저장
		let member ={ 아이디 : mid, 비밀번호 : mpwd};	console.log(member)
		// 3. 등록할때(함수 실행될때) 마다 객체 생성되고 {} 끝나면 다 사라짐
		// 밖에 전역변수 만들어서 거기에  저장하자!! 객체 여러개(배열) = 전역변수
		// * {}안엣거 선언된 객체를 전역 배열에 저장하자
		
		회원리스트.push(member);		
		 alert('회원가입성공');
		/*
		회원리스트.push(아이디);		
		*/	
		document.querySelector('#mid').value = ``
		document.querySelector('#mpwd').value = ``	
}
function 로그인() {
		// 1. 입력된 값 가져오기
		let mid2= document.querySelector('#mid2').value; 			console.log(mid2)
		let mpwd2= document.querySelector('#mpwd2').value	;	console.log(mpwd2)
		// 2. 입력된 값이 존재하는지 검사
			// - 회원리스트 중에서 회원1개씩 꺼내서 검사하는데 아이디와 비밀번호 일치
		let login = false; //로그인 상태 저장 변수
		for ( let i=0; i<회원리스트.length ; i++){
			// i는 0부터 마지막인덱스까지 1씩 증가반복 -> 회원리스트(전체) 중에서 회원1명 (1개씩) 꺼내서
			let member = 회원리스트[i]
			if(member.아이디==mid2){ // 꺼낸 객체의 아이디 입력한 아이디와 같으면
				if(member.비밀번호==mpwd2) { // i번째 객체의 비밀번호가 입력한 비밀번호 와 같으면
						login= true; 
						i=회원리스트.length
						break;
								
				}				
			}		
		}	
		if (login == true){alert('로그인성공');}
		else {alert('로그인 실패');}
		
		document.querySelector('#mid').value = ``
		document.querySelector('#mpwd').value = ``
}























