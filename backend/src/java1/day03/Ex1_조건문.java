package java1.day03;

import java.util.Random;

public class Ex1_조건문 {
	public static void main(String[] args) {
		// [ p.111]
				int score = 93;
				// 1. 
				if( score >= 90 ) 
					System.out.println("1합격");
				
				// 2. 
				if( score >= 90 ) 
					System.out.println("2점수가 90보다큽니다.");
					System.out.println("2등급은 A등급입니다.");
				// 2. 
				if( score < 90 ) 
					System.out.println("2점수가 90보다 작습니다.");
					System.out.println("2등급은 B등급입니다.");
					
				// 3. [ p.113]
				if( score >= 90 ) {
					System.out.println("3점수가 90보다큽니다.");
					System.out.println("3등급은 A등급입니다.");
				}else {
					System.out.println("3점수가 90보다 작습니다.");
					System.out.println("3등급은 B등급입니다.");
				}
				
				// 4. [ p.114 ]
				if( score >= 90 ) {
					System.out.println("4점수가 100~90입니다.");
					System.out.println("4등급은 A등급 입니다. ");
				}else if( score >= 80 ) {
					System.out.println("4점수가 80~89입니다.");
					System.out.println("4등급은 B등급 입니다. ");
				}else if( score >= 70 ) {
					System.out.println("4점수가 70~79입니다.");
					System.out.println("4등급은 C등급 입니다. ");
				}else {
					System.out.println("4점수가 70 미만입니다.");
					System.out.println("4등급은 D등급 입니다. ");
				}
				// ------------------------------ 
				if( score >= 90 ) {
					System.out.println("5점수가 100~90입니다.");
					System.out.println("5등급은 A등급 입니다. ");
				}if( score >= 80 ) {
					System.out.println("5점수가 80~89입니다.");
					System.out.println("5등급은 B등급 입니다. ");
				}if( score >= 70 ) {
					System.out.println("5점수가 70~79입니다.");
					System.out.println("5등급은 C등급 입니다. ");
				}if( score < 70){
					System.out.println("5점수가 70 미만입니다.");
					System.out.println("5등급은 D등급 입니다. ");
				}
			// [P.115] 난수생성 : Math.random()
			System.out.println(Math.random() ); // 0.0 ~ <1.0
			System.out.println(Math.random()*6 ); // 0.0 <= ~6.0
			System.out.println((int)(Math.random()*6)); // 0 <= <6
			System.out.println((int)(Math.random()*6)+1 ); // 1 <= ~ <7
			// 정수 난수공식 : (int) (Math.random() * n) +s
				// s : 난수 시작번호			n: 난수 개수
			// 예시( 1~45
			System.out.println((int)(Math.random()*45)+1 ); // 1~45
			// --------------------- vs ---------------------------
			// 난수 생성 클래스 : Random 클래스
				//1. Random 객체 생성한다. // 2/ 랜덤 값 호출
			Random random = new Random();
			random.nextInt();
			System.out.println(random.nextInt(6)+1); // 1~6
			System.out.println(random.nextInt(45)+1); // 1~45
			// (random.nextInt(개수))
			// 예시) a-z
			System.out.println((char)(random.nextInt(26)+97 ) ); 	// 97~122;
			// [p.116] 주사위 예제
			int num = (int)(Math.random()*6)+1; // 1~6
			if(num==1) {
				System.out.println("1번이 나왔습니다.");
			}else if(num==2) {
				System.out.println("2번이 나왔습니다.");
			}else if(num==3) {
				System.out.println("3번이 나왔습니다.");
			}else if(num==4) {
				System.out.println("4번이 나왔습니다.");
			}else if (num==5) {
				System.out.println("5번이 나왔습니다.");
			}else {
				System.out.println("6번이 나왔습니다.");
			}
			
			int num2= (int)(Math.random()*6)+1; // 1~6
			switch(num2) {
			case 1:
			System.out.println("1번이요");
			break;
			case 2:
			System.out.println("2번이요");
			break;
			case 3:
				System.out.println("3번이요");
				break;
			case 4:
				System.out.println("4번이요");
				break;
			case 5:
				System.out.println("5번이요");
				break;
			default :
				System.out.println("6번이요");
				break; 
			}
		char grade2='c';
		switch(grade2) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':	
				System.out.println("일반 회원입니다.");
				break;
			default :
				System.out.println("손님입니다.");
		}
		int score3 = (int)(Math.random()*20)+81;
		System.out.println("점수: "+score3);
		
		String grade;
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {
			if(score>=85) {
				grade ="B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("학점: "+grade+"학점입니다.");
	}
}
			
			
			

/*



	if : 조건에 따른 흐름 제어
		형태
			1. if(조건식) 실행문;
			2. if(조건식){실행문; 실행문; }
				*만약에 참/거짓의 실행문이면 2
*/