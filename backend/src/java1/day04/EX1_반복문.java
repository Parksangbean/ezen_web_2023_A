package java1.day04;

import java.util.Scanner;

public class EX1_반복문 { //class s
	public static void main(String[] args) { //main s
		// [p.124]
		//int sum = 0;
		//sum=sum+1; sum+=2; sum+=3; sum+=4; sum+=5; sum+=6; sum+=7; sum+=8; sum+=9; sum+=10;
 		int sum2=0;
 		for(int i=1; i<=10; i++) { // i는 1부터 10까지 1씩 증가반복
 			sum2+=i; // 1부터 10까지 누적합계
 			System.out.println(sum2);
 		}
		// [p.125] 1부터 10까지 출력
 		//1. for 없이
 		System.out.println(1); System.out.println(2); System.out.println(3);
 		System.out.println(4); System.out.println(5); System.out.println(6);
 		System.out.println(7); System.out.println(8); System.out.println(9); System.out.println(10);
 		//2.for 이용
 		for(int i=1; i<=10 ; i+=1) {
 			System.out.print(i+" ");
 		}
 		//[p.126] 초기값 변수는 for에서 선언시 지역변수이다.
 		int sum3 =0;
 		for(int 반복변수=1; 반복변수<=10; 반복변수++) {
 			sum3+=반복변수;
 		}// System.out.println(반복변수); // x = for() 안에서 선언된 변수는 for{} 밖에서 사용불가
 		
 		int sum4 =0; int i;
 		for(i = 1 ; i<=100; i++) {
 			sum4+=i;
 		}System.out.println("1~"+(i-1)+"합 : "+ sum4);
 		// [p.127] 실수		// 소수점뒤에  f 사용이유 :(직접 작성한) 리터럴 소수점 =double 이기때문에  f써야함
 		for(float x =0.1f; x<=1.0f; x+=0.1f) {
 			System.out.println(x+" ");
 		}
 		for(double x =0.1f; x<=1.0; x+=0.1) {
 			System.out.println(x+" ");
 		}
 		for(int 단 =2; 단<=9; 단++) { // 행 //단 //8
 			for(int 곱 =1; 곱<=9; 곱++) { //열 //곱 //9
 				System.out.printf("%2d*%2d=%2d\n",단,곱,단*곱); //72회 출력
 				
 			}
 		}
 		/*
 		int c=1;
 		int csum=0;
 		while(c<=10) {
 			System.out.println(c+" ");
 			c++;
 		}*/
 		int d=1;
 		int dsum=0;
 		while(d<=100) {
 			dsum+=d;
 			System.out.println("1~"+(d-1)+"합: "+dsum);
 			d++;
 		}
 		Scanner scanner=new Scanner(System.in);
 		boolean run =true;
 		int speed=0;
 		
 		while(run) { // while s
 			// ---------------무한 출력
 			System.out.println("-------------------------------");
 			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
 			System.out.println("-------------------------------");
 			System.out.println("선택: ");
 			// -----------무한 입력
 			String strNum=scanner.nextLine();
 			
 			if(strNum.equals("1") ) { // 만약에 입력이 1이면
 				speed++; // 스피드 증가
 				System.out.println("현재 속도 ="+speed);
 			}else if(strNum.equals("2") ) { // 만약에 입력이 2이면
 				speed--; //스피드 감소
 				System.out.println("현재 속도 ="+speed);
 			}else if (strNum.equals("3")){ // 만약에 입력이 3이면
 				run=false;
 			}
 			System.out.println("프로그램 종료");
 		}// while e
 		// 위치1
 	//	System.out.println("반복문 종료후 코드 ");\
 		숫자for:for(int j= 1; j<=50 ; j++) {
 			if(j%2 !=0) {	// 홀수찾기 ==1
 				continue 숫자for; // for문으로 이동 // 아래에 있는 코드는 실행x // 홀수 출력 x
 			}
 			System.out.println(j+" ");
 		}
	}//main e
}//class e
/*
 for문
 	 for(1.초기값 ;2.조건식; 4.증감식;{
 	 
 	 		3.실행문;
 	 		
 	 }
 	1.초기값이 실행된다.
 	2. 조건식 판단해서 true 이면 {} 들어감 / false {} 건너뜀, /종료
 	3. true이면 실행문 실행
 	4. 초기값이 들어있는 변수에 증감식
 	5. 조건식 판단해서 ~~ 2,3,4,2,3,4 반복
 
 while 문
 	1.초기값
 	while(2.조건식) {3.실행문 4. 증감식
 	
 	-초기값과 증감식은 필수x
 	1. 조건식 판단해서 true이면 {} 들어감 , false {} 건너뜀/종료
 	2. true 이면 실행
 	
 	-- 일반적으로 패턴이 있는경우 for문 사용
 	-- while 패턴이 없는경우 while문 사용
*/
