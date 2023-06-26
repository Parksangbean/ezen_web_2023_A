/*
		함수형태
			1. 인수 x 반환x 함수
			<선언>
			function 함수1() {console.log('함수1 실행');}
			<호출>
			<button onclick="함수1()" type= "button">함수1 실행</button>


*/
// 1. 인수x 반환x 함수 정의
function 함수1() {console.log('함수1 실행');}
함수1()// *js에서의 함수 호출		[JS 실행시 최초 1번 실행]

//2. 인수o = 2개 반환x 함수 정의
function 함수2(x, y){
	console.log(x +y);
	}
함수2(3, 5);
함수2('코카콜라:', 5)

//3. 인수o=2개 , 반환o 함수 저으이
function 함수3(x,y){console.log(x + y); return x+y}
let 결과 = 함수3 = (3,5);  console.log('함수3 결과/리턴 : '+ 결과)

function 함수4(){ return 3 + 8 ; } //함수 강제 종료할 경우 return [아래 코드 있더라도]
let 결과2 = 함수4(); cosole.log('함수 4 결과/리턴:' +결과2);
// 5. 함수 정의시 기존 함수 호출 가능
function 함수5(){ console.log('함수5실행시 함수1 실행'); 함수1(); }
함수5()