console.log('실행');

function asave(){
	
	let atextInput = document.querySelector('.atext'); console.log(atextInput);
	let apriceInput = document.querySelector('.aprice');console.log(apriceInput);
	let adateInput = document.querySelector('.adate'); console.log(adateInput);
	
	let info ={
		atext : atextInput.value,
		aprice : apriceInput.value,
		adate : adateInput.value,
	}; console.log(info);
	
	 $.ajax({
      url : "/jspweb/Accountbook",      
      data : info,      
      method : "",   
      success : function f(r){
		  console.log('성공');
		  if(r="true"){alert('등록성공'); atextInput=''; apriceInput=''; adateInput='';}
	  } ,       
      error : function f(r){
		  
	  } ,         
   });
} 
aread();
function aread(){
	$.ajax({
         url : "/jspweb/Accountbook", 
         method : "get",      
         data : "",       
         success : function f(r){console.log(r)
         
         let output = document.querySelector('.acbottom');
         
         let html=``;
         
         for(let i=0; i<r.length; i++){
			 
			 html+=`<div class="acbox"> <!-- 방문록 1개의 표시구역 -->
						<div class="acbox_top">
							<div>${r[i].atext}</div>
							<div class="acdate">${r[i].adate}</div>
						</div>
						<div class="acbox_center">${r[i].acontent}</div>
						<div class="acbox_bottom">
							<button onclick="aupdate( ${ r[i].ano} )" type="button">수정</button>
							<button onclick="adelete( ${ r[i].ano} )" type="button">삭제</button>			
						</div>
					</div>`
		 		}
		 		output.innerHTML=html;      
         } ,       
         error : function f(r){}       
      });
}