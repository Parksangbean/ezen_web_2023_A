// 1. 광고이미지 변경
	//1. 광고이미지 여러개 = 배열
let bimglist =['himg1.png','himg2.png','himg3.jpg','himg4.png','himg5.png']
	//2. 특성시간마다 이미지의 src 변경 하기
		// -setInterval(함수/기능, 밀리초) : 1/1000초
		// 1. function 함수(){}		2. function(){}		3.()=>{}
			// setInterval(()=>{실행코드},2000)
let viewhimg =0; //현재 출력중인 광고이미지 인덱스 저장하고 있는 변수
setInterval(()=>{
	//1. 해당 이미지 태그 객체 호출
	let himg=document.querySelector('.himg');
	//2. 호출된 객체 에서 src 속성 대입/바꿔치기
	viewhimg++		//인덱스 증가시킴 [다음이미지 변경]
	if(viewhimg>=bimglist.length){viewhimg=0;}
	himg.src=`../img/${bimglist[viewhimg]}`;
},2000);
//2. 카테고리 출력 함수
let categorylist = ['신제품(new)','프리미엄','와퍼&주니어','치킨&슈림프버거','올데이킹&킹모닝']
 categoryPrint(0);
function categoryPrint(selectNo){
	//1. 어디에
	let categorymenu= document.querySelector('.categorymenu')
	
	let html='';
	
	for(let i=0; i<categorylist.length; i++){
		if(i==selectNo){html +=`<li onclick="categoryselect(${i})" class="categoryselect">${categorylist[i]} </li>`}
		else{html +=`<li onclick="categoryselect(${i})" >${categorylist[i]} </li>`}
		
	}
	//3.구성된 html 출력
	categorymenu.innerHTML=html;
}

//3. 카테고리 클릭 함수
function categoryselect(selectNo){
	let categoryli=document.querySelectorAll('.categorymenu li')
	console.log(categoryli)
	
	for(let i=0; i<categorylist.length; i++){
		if(selectNo==i){
			categoryli[i].classList.add('categoryselect');
		}else{
			categoryli[i].classList.remove('categoryselect');
		}
	}
}
