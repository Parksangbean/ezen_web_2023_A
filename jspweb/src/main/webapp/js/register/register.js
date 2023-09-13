
//1 . 제품등록
function onRegister(){
	
	// 1. form dom객체 호출
	let registerForm = document.querySelectorAll('.registerForm')[0];
	console.log(registerForm);
	
	// 2. formData 객체 생성
	let formData = new FormData(registerForm);
	console.log(formData);
	
	// 3.
	$.ajax({
		
            url : "/jspweb/ProductinfoController",   
            method : "post",   
            data : formData ,
            contentType : false ,			
			processData : false ,
           success : r =>{console.log(r)} ,       
           error : e=>{} ,        
             
   });
}