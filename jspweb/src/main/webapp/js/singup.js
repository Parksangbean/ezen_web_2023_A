
/* onchange : 포커스(커서) 변경될때 값이 다르면*/
/* onkeyup : 키보드에서 키를 누르고 때었을때*/
/* onkeydown : 키보드 키를 눌렀을때 */
/*

	정규식표현식 : 문자열에 특정 규칙/패턴 집합 표현할때 사용되는 언어
			문법
				/^							: 정규표현식 시작 알림.
				$/							: 정규표현식 끝 알림.
				[a~z] 					: 소문자 a~z패턴 검색
				[A~Z] 					: 대문자 A~Z 패턴 검색
				[0~9] 					: 숫자 0~9 패턴 검색
				[가-힣] 					: 한글 패턴
				{ 최소길이 , 최대길이 }	: 문자열 길이 패턴
				+ : 앞 에 있는 패턴 1 개 이 상 반 복
				? : 앞 에 있는 패턴 0 개 혹은 1개 이상 반복
				* : 앞 에 있는 패턴 0개 반복
				
				
				예시]
					1. [a-z]							: 소문자A~Z 검색
					2. [a-zA-Z]						:영문(대,소) 검색
					3. [a-zA-Z0-9]					: 영문 + 숫자 조합 검색
					4. [a-zA-Z0-9가-힣]			: 영문 + 숫자 + 한글 조합 검색
					5. [ac]							: a와c 패턴
					6. (?=.*[패턴문자] )			: 해당 패턴문자가 한개 이상 포함 패턴
						(?=.*[a-z] )				: 소문자 한개 이상 필수
						(?=.*[A-Z] )				: 대문자 한개 이상 필수
						(?=.*[0-9] )				: 숫자 한개 이상 필수
						(?=.*[\d] )					: 숫자 한개 이상 필수
						(?=.*[!@#$%^&*] )	: 패턴문자내 특수문자 한개 이상 필수
						
				/^(?=.*[a-z] )(?=.*[A-Z] )(?=.*[0-9] )[a-zA-Z0-9]{5,30}] $/
				
				영대문자1개 + 영소문자1개 + 숫자 1개 이상 필수로 갖는 5~20글자 사이
					
			1. /^[a-z0-9]{5,30} $/ 	: 영문(소) + 숫자 조합 5~30글자 패턴
			
		패턴 검사
			"패턴".test(검사할데이터) : 해당 데이터가 패턴에 일치하면 true/ 아니면 false 

*/
// 1. 아이디 유효성 검사
function idcheck(){

	// 1. 값 호출
	let mid = document.querySelector('.mid').value;
	let idcheckbox = document.querySelector('.idchackbox');
	// 2. 유효성 검사
		// 제어문으로 이용한 검사 if(mid.length < 5 && mid.length >=30 ){}
		// 1. 아이디는 영문(소문자)+숫자 조합의 5~30 글자 사이 이면
			// 1. 정규표현식 작성
		let midj = /^[a-z0-9]{5,30}$/
				// 2. 정규표현식 검사.
				console.log(midj.test(midj) );	
			if(midj.test(mid) ){ // 입력한 값이 패턴과 일치하면
				document.querySelector('.idchackbox').innerHTM='패턴 합격';
				
				 $.ajax({
    				  url : "/jspweb/MemberFindController", 
    				 method : "get",       
     				 data : { type :"mid" , data : mid},       
      				success :  r=>{console.log(mid);
      					if(r){
							  idcheckbox.innerHTML = '사용중인 아이디 입니다.'
						  }
      					else{
							   idcheckbox.innerHTML = '사용가능한 아이디 입니다.'
						  }
      				} ,       
     				 error :  e=>{
						  
						  
					} ,         
   		});

				// -- 입력한 아이디 패턴과 일치하면 아이디 중복검사 
			}else{ // 입력한 값이 패턴과 일치하지않으면
				document.querySelector('.idchackbox').innerHTML ='아이디는 영문(소문자)+숫자 조합의 5~30글자 가능합니다.';
			}
	//3 .결과출력
}

// 2. 비밀번호 유효성검사 [ 1. 정규표현식 검사 2. 비밀번호 와 비밀번호 확인 일치여부]
function pwcheck(){
	console.log('패스워드 입력중');
	// 1. 입력값 호출
	let mpwd = document.querySelector('.mpwd').value; console.log('mpwd :'+mpwd);
	let pwcheckbox = document.querySelector('.pwcheckbox');
	let mpwdconfirm = document.querySelector('.mpwdconfirm').value;
	// 2. 유효셩검사
		// 1. 정규표현식 만들기 [ 영대소문자 + 숫자 조합 5~20글자 사이]
		let mpwdj = /^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z\d]{5,20}$/
		
		if(mpwdj.test(mpwd)){
			pwcheckbox.innerHTML ='통과다';
			
				// 비밀번호 확인 정규표현식 검사
				if(mpwdj.test(mpwdconfirm)){
					
					if(mpwd== mpwdconfirm){
						pwcheckbox.innerHTML='사용가능한 비밀번호';
					}else{
						pwcheckbox.innerHTML='비밀번호가 일치하지 않습니다.';
					}
					
				}else{
					pwcheckbox.innerHTML ='영대소문자1개이상+숫자1개이상 조합 5~20글자 사이로 입력해주세요.';			
				}
				
		}else{
			pwcheckbox.innerHTML ='영대소문자1개이상+숫자1개이상 조합 5~20글자 사이로 입력해주세요.';			
		}		
}

// 3. 이메일 유효성검사 [ 1. 정규표현식 2. 중복검사]
function emailcheck(){
	let emailcheckbox = document.querySelector('.emailcheckbox');'
	// 1. 입력된 값 호출
	let memail = document.querySelector('.memail').value
	
	// 1. 이메일 정규표현식 작성 [ 영대소문자+숫자+_-@ 1개이상 필수 입력]
	// 2. @				: +@ @ 앞에 패턴이 1개이상 필수
	// 3. 도메인
		// 회사명
		// .				: +/. : . 앞에 패턴이 1개이상 필수
		// 도메인			: .뒤에 패턴은 a-zA-Z
	let memailj = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\.[a-zA-Z]+$/
	
	
	if(memailj.test(memail)){
		 $.ajax({
      		url : "/jspweb/MemberinfoController",  
      		// *type 사용하는 이유 : 서로 다른 ajax 가 동일한 서블릿과 동일한 get메소드 사용할때    
     		data : {type :"memail" , data : memail },      
      		method : "get",   
      		success :  r=>{
				  if(r){
					 emailcheckbox.innerHTML='사용중인 이메일입니다'
				  	}else{
						emailcheckbox.innerHTML='사용가능한 이메일입니다'  
					  }
				  },       
      		error :  r =>{console.log(r)} ,         
   });

	}else{
		emailcheckbox.innerHTML='이메일 형식에 맞게 입력해주세요.'
	} 



// 1. 회원가입 메소드
function signup(){
	
	// 1. HTML에 가져올 데이터의 tag객체 호출 [ DOM객체 : html 태그를 객체화 ]
	let midInput = document.querySelector('.mid'); 
	let mpwdInput = document.querySelector('.mpwd'); 
	let mpwdconfirmInput = document.querySelector('.mpwdconfirm'); 
	let memailInput = document.querySelector('.memail'); 
	let mimgInput = document.querySelector('.mimg'); 
	
	// 2. (객체화)
	let info = { // 인증코드(유효성검사 위한) , 패스워드확인(유효성검사 위한) : DB 넣을 필요가 없는 데이터 
		mid : midInput.value , 
		mpwd : mpwdInput.value , 
		memail : memailInput.value , 
		mimg : mimgInput.value 
	}
	// 3. 유효성검사
	
	
	
	
	// 4. AJAX메소드를 이용한 Servlet 와 통신 
	$.ajax({ 
		url : "/jspweb/MemberinfoController" , 
		method:"post", 
		data : info , 
		success : r => { console.log('통신성공'); 
		if(r==true){
			console.log('회원가입 성공');
			
			}else{
				console.log('회원가입 실패');
			}		
		} ,
		error : e => { console.log('통신실패'); }
	})
	}
	// 5. Servlet 의 응답에 따른 제어 	
}