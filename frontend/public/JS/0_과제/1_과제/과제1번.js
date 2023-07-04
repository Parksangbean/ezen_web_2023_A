//문제11 정수 3개를 입력받아 오름차순 으로 출력    [ 7 5 9 -> 5 7 9]

let a = Number(prompt('정수1'))
let b = Number(prompt('정수2'))
let c = Number(prompt('정수3'))
let i = ( a<b&&a<c ? a : b<a&&b<c ? b : c)
let j = ( (a<b&&a>c)||(a<c&&a>b) ? a : (b<a&&b>c)||(b<c&&b>a) ? b : c )
let s = ( a>b&&a>c ? a : b>a&&b>c ? b : c )
console.log('오름차순 결과 : '+i+' '+j+' '+s)


 //문제12 가위바위보 게임
 let player1 = prompt('플레이어1 가위(0), 바위(1), 보(2) 중 하나를 입력하세요. :')
 let player2 = prompt('플레이어2 가위(0), 바위(1), 보(2) 중 하나를 입력하세요. :')
let 결과= ( player1==player2 ? '무승부' : player1==(player2+1)%3 ? '플레이어1 승리' : '플레이어2 승리')
console.log('가위바위보  결과 : '+결과)
