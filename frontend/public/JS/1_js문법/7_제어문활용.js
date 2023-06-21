//문제 1 : 2개의 정수 를 입력받아서 가장 큰수를 출력 
/*
let 정수1 =prompt('정수입력: ');
let 정수2 =prompt('정수입력: ');
if(정수1>정수2) {console.log('더큰수 출력: ' +정수1)}
else if(정수2>정수1) {console.log('더큰수 출력: ' +정수2)}
*/

//문제 2 : 3개의 정수 를 입력받아서 가장 큰수를 출력  
/*
let a =prompt('정수입력1: ');
let b =prompt('정수입력2: ');
let c =prompt('정수입력3: ');
let max1=a;
if(max1 <b) {max1=a}
if(max1 <c) {max1=c}
console.log(max1)
*/
//문제 3 : 4개의 정수 를 입력받아서 가장 큰수를 출력
/*
let d =prompt('정수입력1: ');
let e =prompt('정수입력2: ');
let f =prompt('정수입력3: ');
let g =prompt('정수입력4: ');
let max2 =d;
if(max2 <e) {max2=e};
if(max2 <f) {max2=f};
if(max2 <g) {max2=g};
console.log(max2)
*/

//  문제 4 : 3개의 정수 를 입력받아서 오름차순 / 내림차순 출력 
/*
let int1 =prompt('정수입력1: ');
let int2 =prompt('정수입력2: ');
let int3 =prompt('정수입력3: ');
// 정렬= 하나씩 비교 해서 자리 교체
if(int1>int2){
let temp= int1; //1. 빈번수 =3
int1=int2;		// 2. 3=5;
int2=temp;		//3.. 5=3;
}
if(int1>int3){
let temp= int1; //1. 빈번수 =3
int1=int3;		// 2. 3=5;
int3=temp;		//3.. 5=3;
}
if(int2>int3){
	let temp= int2;
	int2 =int3;
	int3 =temp;
}
console.log(int1 +' '+int2+' ' +int3)
*/
 //문제 6 : 점수를 입력받아 점수 90점이상 합격 출력 아니면 탈락 출력 
 /*
let 점수 =prompt('점수 입력: ')
if(점수>=90) {console.log('합격')}
else {console.log('탈락')}
*/
/*
문제 7 : 점수를 입력받아 점수 90점이상 A등급 출력 
                            80점이상 B등급 출력 
                            70점이상 C등급 출력  
                            그외 재시험

let 점수1 =prompt('점수 입력: ')
if(점수1>=90) {console.log('A등급')}
else if(점수1>=80) {console.log('B등급')}
else if(점수1>=70) {console.log('C등급')}
else  {console.log('재시험')}
*/


// 문제 8 : 아이디와 비밀번호 입력받기  회원아이디가 admin 이고 비밀번호가 1234 이면 로그인 성공 출력  아니면 로그인실패 출력

let id = prompt('아이디 입력: ')
let password = prompt('비밀번호 입력: ')
if (id == 'admin' && password == '1234') { console.log('로그인 성공') }
else { console.log('로그인 실패') }


