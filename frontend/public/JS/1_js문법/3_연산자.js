
// 1.산술 연산자
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

let 실수 = prompt('실수입력:')
let 실수1 = prompt('실수입력:')

// 문자 연산 예시
console.log(10*3)
console.log('10'*3)