function save(){
	console.log('실행');
	// 2. 입력받은 데이터를 한번에 가져오기 form 태그 이용 
			// <form> 각종 input/button </from>
			// 1. form 객체 호출  document.querySelectorAll( 폼태그식별자 )
			let signupForm = document.querySelectorAll('.signupForm')[0];
				console.log( signupForm );
			// 2. form 데이터 객체화
				// 일반객체로 첨부파일 전송X -> FormData객체 이용시 첨부파일 전송 가능 
			let signupData = new FormData( signupForm ); // 첨부파일 [ 대용량 ] 시 필수..
				console.log( signupData );
				
				 // 직급 선택한 값을 FormData에 추가
  				let selectedPosition = document.querySelector('.position').value;
  				signupData.append('position', selectedPosition);
			// 3. AJAX 에게 첨부파일[대용량] 전송 하기 
				// 2. 첨부파일 있을때. [ 기존 json형식의 전송x form객체 전송 타입으로 변환 ]
				$.ajax({
					url : "/jspweb/HrmController",
					method: "post" ,			// 첨부파일 form 전송은 무조건 post 방식 
					data : signupData ,			// FormData 객체를 전송 
					contentType : false ,		// form 객체 전송타입 		
					processData : false ,
					success : r => { 
						
						if(r){ // 회원가입 성공 [ 1.알린다 2.페이지전환]
							alert('등록 완료'); 
							
						}
						
						else{ // 회원가입 실패
							alert('등록 실패[관리자에게 문의]');
						}
						
					 } ,
					error : e => { console.log(e) } ,
				})
}

function aview() {
	$.ajax({
		url : "/jspweb/HrmController",
		method: "get",
		data: "",
		success: function f(r) {
		

			let output = document.querySelector(".hrm_Bottom")
			let html = ``;
			for (let i = 0; i < r.length; i++) {
				html += `<div class = "hrm_Bottom"><!--아래 출력구역  -->
		<div class="abox">
			<div class="hrm_position">${r[i].position}</div>
			<div class="hrm_name">${r[i].name}</div>
			<div class="hrm_phone">${r[i].phone}</div>
			<div class="hrm_himg">${r[i].himg}</div>
			
		</div>
	</div>`
			}
			output.innerHTML=html;
		},
		error: function f(r) { }
	})
}





function preimg( o ){ console.log('사진 선택 변경');
	console.log( o ); // 이벤트 발생시킨 태그의 DOM객체를 인수로 받음
	// 1. input태그의 속성 [ type,class,onchange,name,value 등등 ] type="file" 이면 추가적인 속성 
		// .files : input type="file" 에 선택한 파일 정보를 리스트로 받음 
	console.log( o.files );		console.log( o.files[0] ); // 리스트중에서 하나의 파일만 가져오기 
	// --- 해당 파일을 바이트코드 변환 
	// 2. JS 파일읽기 클래스 선언 
	let file = new FileReader(); // 파일 읽기 클래스 이용한 파일읽기객체 선언 
	// 3. 파일 읽어오기 함수 제공 
	file.readAsDataURL( o.files[0] ); // input 에 등록된 파일리스트(o.files) 중 1개를 파일객체로 읽어오기 
		console.log( file );
	// document.querySelector('.preimg').src = file.result; // img src속성에 대입 // 오류 
	// 4. 읽어온 파일을 해당 html img태그에 load 
	file.onload = e => { // onload() : 읽어온 파일의 바이트코드를 불러오는 함수 구현 
		console.log( e ); 				// e : 이벤트 정보
		console.log( e.target );	 	// onload() 실행한 FileReader 객체
		console.log( e.target.result ); // 읽어온 파일의 바이트코드 
		document.querySelector('.preimg').src = e.target.result; // img src속성에 대입 
	} 
	
} // f end 