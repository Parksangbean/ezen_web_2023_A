/*

	반복문 : 어디서부터 어디까지
		1. for(1.초기값 ; 2.조건문 ; 4. 증감식){
				3. 실행코드;
			
		}
			1. 초기값 : 반복의 처음값
					; : 구역부분
			2. 조건문 : 조건이  true{}실행 아니면 {} 실행 안됨
				;
			3. 실행코드 : 반복시 실행될 코드
			
			4. 증감식 : 반복변수 증가/감소 단위
			
			
			
		ex) 1부터 10까지 1씩증가 반복
			for( let i =1; i<=10; i++){}
		ex 1부터 100까지 홀수만 반복
			for(let i =1; i<=100; i+=2){}				 




*/
// 1.

for( let i = 0; i<=9; i++){ //f start
	// i는 0부터 10미만까지 1씩증가 반복
	// i<10		;		// 2. 조건문 ({} 실행되는 조건)
	console.log('반복횟수:' +i)
	/*
	순서도 = 알고리즘 != 자료구조
	
	*/
} // for end

// 2. 배열( 인덱스)과 반복문 사용할때 [i 반복변수를 인덱스 대신 사용]
let 상자 = ['사과','포도','딸기']

console.log(상자[0] );
console.log(상자[1] );
console.log(상자[2] );

for(let i=0; i<상자.length ; i++){
	console.log(상자[i])
}

//예제 1번 i는 1부터 10이하까지 1씩 증가 반복
for(let i=1; i<=10; i++){
	console.log(i)
}
let output=``
for(let i=1; i<=10; i++){
	output +=`${i} `
}
console.log(output)

//예제 3) i는 1부터 10이하까지 1씩 증가 반복 [html 표시]
console.log('----------------------ex3------------------------');
output=` ` //위에서 선언된 output변수를 재선언하지 않고 공백으로 대입(초기화)
for(let i=1; i<=10; i++){
	output+=`<p> ${i}</p>`
}
document.write(output)





