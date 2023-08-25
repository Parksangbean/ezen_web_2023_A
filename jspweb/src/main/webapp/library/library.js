console.log('js실행');


let lno="";


function getValue(button) {
    lno = button.textContent;
    alert("눌린 버튼의 값: " + lno);
}



function admission(){
	let Lno = lno;
	let nameInput = document.querySelector('.name'); console.log('nameInput: '+nameInput);
	let phoneInput = document.querySelector('.phone'); console.log('phoneInput: '+phoneInput);
	
	let info ={
		Lno : lno,
		name : nameInput.value,
		phone : phoneInput.value,
	};console.log(info);
	
	 $.ajax({
	      url : "/jspweb/library", 
	      method : "post",      
	      data : info ,
	      success : function f(r){console.log( r );
	      	if( r === true){alert('입실 성공'); lno=""; nameInput=""; phoneInput ="";}
	      	else{console.log('안내] 입실 실패 이미 있는 방번호입니다.')}
	      
	      } ,       
	      error : function f( r ){}       
	   });
}