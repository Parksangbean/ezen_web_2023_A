/*
// 문제1) 입력받은 수 만큼 * 출력 
// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
// 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*
**			
***		
****	
*****
// 문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
*****
****
***
**
*
// 문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *
   **
  ***
 ****
*****
// 문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*****
 ****
  ***
   **
    *
// 문제7) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *
   ***
  *****
 *******
*********
// 문제8) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*********
 *******
  *****
   ***
    *
// 문제9) 입력받은 줄 수 만큼 * 출력  [ ex) 10 ]
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
// 문제10) 입력받은 줄 수 만큼 * 출력  [ ex) 7 ]
*     *
 *   *
  * *
   *
  * *
 *   *
*     *

*/

let output = ``;	//  출력용 변수 [ 모든 문제 에서 사용 ]
// 문제1) 입력받은 수 만큼 * 출력 
let value1 = prompt( '문제1:')
for( let i = 1 ; i<=value1 ; i++  ){ // i는 1부터 입력받은 수까지 1씩증가반복 
	output += `*`
} // for end 
console.log( output )
// ---------------------------------------------------------- // 
// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
output = ``; // 공백으로 초기화
let value2 = prompt( '문제2:')
for( let i = 1 ; i<=value2 ; i++ ){
	output += `*`
	// 만약에 i의 값이 3배수( 값%3==0 ) 이면 
	if( i % 3 == 0 ){ output += `\n` }	
	// \ : 제어문자(이스케이프문자)	\t : 들여쓰기 \n : 줄바꿈
} // for end 
console.log( output )

// ---------------------------------------------------------- //
// 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``;
let line1 = prompt( '문제3:')
for( let i = 1 ; i<=line1 ; i++ ){
	// [별찍기]
	for( let s = 1 ; s <= i; s++){ output += `*`}
	// [줄바꿈] i는 1부터 입력받은 줄수까지 1씩증가
	output +=`\n`;
}
console.log( output )
// ---------------------------------------------------------- //
// 문제4) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``;
let line2 = prompt( '문제4:')
for( let i = 1 ; i<=line2 ; i++ ){
	// [별찍기]
	for( let s = 1 ; s<=line2-i+1 ; s++ ){ output += `*`}
	// [줄바꿈]
	output += `\n`
} // for end 
console.log( output )
// 문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``;
let line3 = prompt( '문제5:')
for( let i = 1 ; i<=line3 ; i++ ){
	// 2. [공백 출력]
	for( let b = 1 ; b<=line3-i ; b++ ){ output += `` } // 스페이스바 한번 = 공백1개 
	// 3. [별 출력 ]
	for( let s = 1 ; s<=i ; s++ ){ output += `*`}
	// 1. [줄바꿈]
	output += `\n` // i마다 줄바꿈 => 줄마다 줄바꿈
}
console.log( output )
// 문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``;
let line4 = prompt( '문제6:')
for( let i = 1 ; i<=line4 ; i++ ){
	// [공백 출력]
	for( let b = 1 ; b<= i-1 ; b++ ){ output += ` `}
	// [별 출력 ]
	for( let s = 1 ; s<= line4-i+1 ; s++ ){ output += `*` }
	// [줄바꿈 출력]
	output += `\n`
}
console.log( output )

let line5 = prompt('문제7: ')
for(let i=1; i<=line5; i++){
	for(let j=1; j<=line5-i; j++) { output += ` `}
		for(let s=1; s<=i*2-1; s++) { output += `*` }
		output += `\n`
}
console.log( output )

output = ``;
let line6 = prompt('문제8: ')
for(let i=line6; i>0; i--){
	for(let j=1; j<line6-i+1; j++) { output += ` `}
		for(let s=1; s<i*2; s++) { output += `*` }
		output += `\n`
}
console.log( output )













