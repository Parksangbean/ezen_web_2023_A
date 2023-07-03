// 1. select 목록상자에서 변경될때 선택된 value 가져오기
let selectbox = document.querySelector('.selectbox');

	// * 이벤트 등록[addEventListener vs <select onchange="">]
selectbox.addEventListener('change', ()=>{
	console.log('목록상자가 변경 되었네요.')
	console.log(selectbox.value)
	
});
//2. input 체크상자 에서 체크 여부 가져오기
let checkbox= document.querySelector('.checkbox');

	//1. 이베트 등록
checkbox.addEventListener('change', ()=>{
	console.log('체크상자가 변경 되었네요')
	console.log(checkbox.checked)
})

// 3. 타이머 등록
		//1. 해당태그 호출
let timer=document.querySelector('.timer');
let timerbox=document.querySelector('.timerbox');
		//2. 시간 함수에 필요한 함수
let time = 0; // 타이머 시간을 저장하는 변수
let timerId= 0; // 타이머 함수가 저장되는 변수
timer.addEventListener('change',()=>{
	
	if(timer.checked){//체크가 있으면
		timerId =setInterval( (  )=>{
			time++; // 변수 1씩증가
			timerbox.innerHTML = time+'초'
		} ,1000)
	
	}else{ // 체크가없으면
		clearInterval(timerId)
	}
})
/*
	setInterval() : 측정시간 마다 특정함수 재호출 함수
	1. setInterval(함수, 시간)
	함수
		1. 기존함수명
		2. () => {}
		3.function(){}
		
		시간: 밀리초 [1초/1000초]
		1000 =>1초
		100 =>0.1초
		10 =>0.01초
		1 =>0.001초
	2.clearInterval()
*/