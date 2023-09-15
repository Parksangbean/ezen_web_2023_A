

// 1. N개 제품을 최신순으로 출력
function findByTop (count ) {
	$.ajax({
      
            url : "/jspweb/ProductinfoController",   
            method : "get",   
            data : {type : findByTop},      
           success : r =>{} ,       
            error : jsonArray=>{console.log(jsonArray)} ,        
             
   });
}

// 2. 현재카카오지도내 보고잇는 동서남북 기준내 제품들을 출력 함수
function findByLatLng(east , west , south , north){
	$.ajax({
      
            url : "/jspweb/ProductinfoController",   
            method : "get",   
            data : {type : findByLatLng,east : east , west : west , south: south, north:north},      
           success : r =>{} ,       
            error : jsonArray=>{console.log(jsonArray)} ,        
             
   });
}
// 3.선택된 제품번호에 해당하는 제품 출력 함수
function findByPno(pno){
	$.ajax({
      
            url : "/jspweb/ProductinfoController",   
            method : "get",   
            data : {type : findByPno , pno : pno},      
           success : r =>{} ,       
            error : jsonObject=>{console.log(jsonObject)} ,        
             
   });
}
// 4. 모든 제품들을 출력하는 함수
function findByAll(){
	$.ajax({
      
            url : "/jspweb/ProductinfoController",   
            method : "get",   
            data : {type : findByAll},      
           success : r =>{} ,       
            error : jsonArray=>{console.log(jsonArray)} ,        
             
   });
}