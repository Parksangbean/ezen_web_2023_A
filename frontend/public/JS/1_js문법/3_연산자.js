/*문자 연산 예시
console.log(10*3)
console.log('10'*3)
*/
// 1.산술 연산자
/*
console.log('더하기 : ' + 10+3 )		 // 103
console.log('더하기 : ' + (10+3) )	 // 13
console.log('빼기 : ' + (10-3) )		// 
console.log ('곱하기 : ' + (10*3))	// 30
console.log ('나누기 : ' + (10/3))	// 3.3333333~
console.log ('나머지 : ' + (10%3))	// 1

let 국어 = Number(prompt('국어 점수를 입력하세요.') )
let 수학 = Number(prompt('수학 점수를 입력하세요.') )		// Number('300')
let 영어 = Number(prompt('영어 점수를 입력하세요.') )		// Number('숫자') => 숫자
	// 2. 세 과목 총점 연산
let 총점 = 국어 + 영어 + 수학
let 평균 = 총점 / 3

	//3. 출력 하기
console.log('총점: ' + (+ 총점) )
console.log('평균: ' + (+ 평균) )

let 반지름 = prompt('반지름')
console.log('원넓이: ' + (반지름*반지름*3.14) )
//문제 3번
let 실수1 =prompt('실수1 :')
let 실수2 =prompt('실수2 :')
let 백분율 = (실수1/실수2)*100
console.log('두  실수간의 비율'+백분율 +"%")
*/

/*

//2.비교연산자
console.log('초과'+(10>3) ) //true
console.log('미만'+(10<3) ) //false
console.log('이상'+(10>=3) ) //true
console.log('이하'+(10<=3) ) //false
console.log('같다'+(10==3) ) //false
console.log('같지않다'+(10!=3) ) //true

//3.관계연산자
console.log('이면서'+(10>3 && 20>15) ) // 10은 3보다 크면서 20은 15보다 크다. // true and true
console.log('이면서'+(10>3 && 20>30) ) //true and false=>false
console.log('이거나'+(10>3)|| 20>15 ) // true or true=> true
console.log('이거나'+(10>3) || 20>30 ) //true or false =>true
console.log('부정'+ !(10>3) ) //false
*/

/*
 -문제4 : prompt 함수 로 정수를 입력받아 홀수[true] / 짝수[false] 여부 출력
 	홀수: 수/값 ==1
 		어떤 수의 나누기 값을 했을때 나머지가 1이면 그 수는 홀수 이다.
 	짝수: 수%2 ==0
 		어떤 수의 나누기 2을 했을때 나머지가 0이면 그 수는 짝수 이다.
 -문제5 : prompt 함수 로 정수를 입력받아 7배수이면 true / 아니면 false 출력
 -문제6 : prompt 함수 로 십만원 단위의 금액을 입력받아 지폐 개수 세기 
         356789      결과 : 십만원3장 만원5장 천원6장 
 -문제7 : prompt 함수 로 아이디와 비밀번호를 입력받아 아이디가 admin 이고 비밀번호가 1234 와 일치하면 
         결과 : true 출력 아니면 false 출력 
 -문제8 : prompt 함수로 정수를 입력받아 홀수 이면서 7배수이면 true 아니면 false 출력
*/

/*
// 문제 4번
let 정수1=prompt('정수1'); console.log('입력받은 정수1' +(정수1%2==1));
// 문제 5번
let 정수2=prompt('정수2'); console.log('입력받은 정수2' +(정수2%7==0));
*/

// 문제 6번
/*
let 금액=prompt('금액: ');	console.log('입력받은 금액 :' + 금액);
 	//1. 십만원권 검사
let 십만원 = parseInt(금액/100000);  console.log('십만원권 :' + 십만원+"장");
let 만원 =  parseInt( (금액-(십만원*100000)) / 10000);	console.log('만원권 :' + 만원+"장")
let 천원 = parseInt((금액-(십만원*100000) -(만원*10000)) /1000);			console.log('천원권 :' + 천원+"장")
*/

// 문제 7번
/*
let 아이디 =prompt('아이디: '); let 비밀번호 =prompt('비밀번호: ');
console.log('로그인 상태 :' + (아이디 =='admin' && 비밀번호 == '1234'));
*/
// 문제 8번
/*
let  정수3= prompt('정수입력: ')
console.log('결과: ' + (정수3%2 ==1 && 정수3%7==0) );
*/
//3. 대입연산자
/*
let 데이터1 =10 // let 키워드[변수]로 '데이터1'이라는 변수명으로 10 을 저장한다.
데이터1 +=10 // 1. 10+10 =>20	, 20 대입
console.log(데이터1) 
데이터1-=5		//20-5=>15			,15 대입
console.log(데이터1) 
데이터1*=2		//15*2=>30			,30 대입
*/
//예제1
/*
let html = '<h3> JS 에서 작성된 HTML 입니다 </h3>'
html +='<p> 문단 추가 했습니다. </p>'
// html [<h3> js에서 작성된  HTML 입니다.</h3><p> 문단 추가 했습니다.</p>]
document.write(html);
*/

//5. 증감연산자 [date+1 , date+=1 date++]
let 데이터2 = 10;
console.log('data: '+ 데이터2)		// 10
console.log('data: ' + (데이터2++)) // 10에서 1증가 => 11????10
console.log('data: ' + 데이터2)	// 11
console.log('data' + (++데이터2)) //12[출력전에 증가]


console.log('data' +(데이터2--)); //12에서 1감소 => 11????? 12 [출력후에 감소]

//6.삼항연산자







