package 과제.과제2;

import java.util.Scanner;

public class 연산20문제 {
	
	public static void main(String[] args) {
		
		//------ 문제1 여기에 풀이-------//
				/*
				System.out.println("문제1 : 강아지 console 출력");
				System.out.println("|\\_/|");
				System.out.println("|q p|   /}");
				System.out.println("( 0 )\"\"\"\\");
				System.out.println("|\"^\"`    |");
				System.out.println("||_/=\\\\__|");
				*/
		//------ 문제2 여기에 풀이-------//
		/*
		Scanner scanner = new Scanner(System.in);
		String 작성자 =scanner.next(); 
		String 내용 =scanner.next();
		String 날짜 =scanner.next();
		System.out.println("-------------방문록--------");
		System.out.println("| 순번|작성자|내용|날짜|");
		System.out.println("1"+"|"+작성자+"|"+내용+"|"+날짜+"|");
		System.out.println("-----------------------------");		
		*/
		//------ 문제3 여기에 풀이-------//
		/*[입력조건]
				기본급[정수] , 수당[정수]
			[ 조건 ] 
				 실수령액 = 기본급 + 수당 - 세금[기본급10%] 
			[출력조건] 
				실수령액 출력[ 소수점 없이  ] */
		/*
		int 기본급=scanner.nextInt(); 
		int 수당=scanner.nextInt();
		int 실수령액=기본급+수당-(기본급/10);
		System.out.println("실수령액="+실수령액);
		*/
		//------ 문제4 여기에 풀이-------//
		 /*[입력조건 ] 
					금액 
				 [조건 ] 
					 십만원 부터 백원 까지의 개수 세기 
				[ 출력조건 ]
					예) 356789 입력시 
					 십만원 3장 
					 만원 5장
					 천원 6장 
					 백원 7개*/
		//Scanner scanner = new Scanner(System.in);
		/*
		int 금액 = scanner.nextInt(); 
		int 십만원=금액/100000;
		int 만원 = ( (금액-(십만원*100000)) / 10000);
		int 천원 = ((금액-(십만원*100000) -(만원*10000)) /1000);
		int 백원 = ((금액-(십만원*100000) -(만원*10000)-(천원*1000))/100);
		System.out.println("십만원: "+십만원+"장");
		System.out.println("만원: "+만원+"장");
		System.out.println("천원: "+천원+"장");
		System.out.println("백원: "+백원+"장");
		*/
		
		//------ 문제5 여기에 풀이-------//
		//하나의 정수를 입력받아 7의 배수인지 출력[ 'O' 혹은 'X' 로 출력]
		/*
		int a =  scanner.nextInt(); 
		System.err.println(a%7==0 ? 'o':'x');
		*/
		//------ 문제6 여기에 풀이-------//
		// 하나의 정수를 입력받아 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력]
		/*
		int b =  scanner.nextInt(); 
		System.err.println(b%2==1 ? 'o':'x');
		*/
		//------ 문제7 여기에 풀이-------//
		// 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]
		/*
		int c =  scanner.nextInt(); 
		System.out.println(c%7==0&&c%2==0?'0':'x');
		*/
		//------ 문제8 여기에 풀이-------//
		//하나의 정수를 입력받아 7의 배수 이거나 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]
		/*
		int d =  scanner.nextInt(); 
		System.out.println(d%7==0 && d%2==1? '0' : 'x');
		*/
		//------ 문제9 여기에 풀이-------//
		// 두개의 정수를 입력받아 더 큰수 출력
		/*
		int 정수=  scanner.nextInt(); 
		int 정수1 =  scanner.nextInt(); 
		System.out.println(정수>정수1?정수:정수1);
		*/
		//------ 문제10 여기에 풀이-------//
		// 반지름을 입력받아 원 넓이 출력하기 
		//	계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		/*
		System.out.println("문제10 : 반지름을 입력받아 원 넓이 출력하기");
		System.out.print("반지름을 입력하세요: ");
		int 반지름 = scanner.nextInt();
		System.out.println((반지름*반지름*3.14));
		*/
		//------ 문제11 여기에 풀이-------//
		// 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
		/*
		System.out.print("첫번째 실수를 입력하세요: ");
		double a =scanner.nextDouble();
		System.out.print("두번째 실수를 입력하세요: ");
		double b =scanner.nextDouble(); 
		
		System.out.println((a/b)*100.0); */
		//------ 문제12 여기에 풀이-------//
		// 문제12 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 
		//계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
		/*
		System.out.print("윗변을 입력 해주세요: ");
		int 윗변 =scanner.nextInt();
		System.out.print("밑변을 입력 해주세요: ");
		int 밑변 =scanner.nextInt();
		System.out.print("높이를 입력 해주세요: ");
		int 높이 =scanner.nextInt();
		System.out.println("사다리꼴 넓이 : " +(윗변+밑변)*높이/2);
		*/
		//------ 문제13 여기에 풀이-------//
		// 키를 정수를 입력받아 표준체중 출력하기 
		//계산식) 표준체중 계산식 = > (키 - 100) * 0.9
		/*
		System.out.print("키를 입력해주세요: ");
		int key = scanner.nextInt();	
		System.out.println("표준체중: "+(key-100)*0.9);
		*/
		//------ 문제14 여기에 풀이-------//
		//문제14: 키와 몸무게를 입력받아 BMI 출력하기 
		//계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		/*
		System.out.print("키를 입력해주세요: ");
		int key = scanner.nextInt();
		System.out.print("몸무게를 입력해주세요: ");
		int weight = scanner.nextInt();
		System.out.println("BMI:"+weight/((key/100)*(key/100)));
		*/
		//------ 문제15 여기에 풀이-------//
		//문제15: inch 를 입력받아 cm 로 변환하기 
		//계산식) 1 inch -> 2.54cm
		/*
		int inch = scanner.nextInt();
		System.out.println("1 inch: "+(inch*2.54)+"cm");
		*/
		//------ 문제16 여기에 풀이-------//
		//문제16:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오 
		//계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
		/*
		System.out.print("중간고사 점수를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.print("기말고사 점수를 입력하세요: ");
		int b = scanner.nextInt();
		System.out.print("수행평가 점수를 입력하세요: ");
		int c = scanner.nextInt();
		System.out.printf("중간고사 반영비율:%.2f\n",(a*0.3));
		System.out.printf("기말고사 반영비율:%.2f\n",(b*0.3));
		System.out.printf("수행평가 반영비율:%.2f\n",(c*0.4));
		*/
		//------ 문제17 여기에 풀이-------//
		//문제17 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
		// x=8 , y=23
		
		//------ 문제18 여기에 풀이-------//
		//  나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
		/*
		int age = scanner.nextInt();
		System.out.println(age>=40?"중년":age>=20?"성인":"학생");
		*/
		//------ 문제19 여기에 풀이-------//
		// 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
		/*
		System.out.print("국어 점수를 입력해주세요: ");
		int korean =scanner.nextInt();
		System.out.print("영어 점수를 입력해주세요: ");
		int en =scanner.nextInt();
		System.out.print("수학 점수를 입력해주세요: ");
		int math =scanner.nextInt();
		
		double average = (korean + en + math)/3;
		System.out.printf("총점:%d\n", korean+en+math);
		System.out.printf("평균:%.2f", average);
		*/
		//------ 문제20 여기에 풀이-------//5
		// 문제20 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 로그인성공 아니면 로그인실패 출력
		/*
		System.out.print("아이디를 입력해주세요: ");
		String id = scanner.nextLine();
		System.out.print("비밀번호를 입력해주세요: ");
		String pwd = scanner.nextLine();
		
		System.out.println(id.equals("admin") && pwd.equals("1234") ? "로그인성공" : "로그인실패");
		*/
		
		//------ 문제21 여기에 풀이-------//
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력해주세요: ");
		int a = scanner.nextInt();
		System.out.print("정수를 입력해주세요: ");
		int b = scanner.nextInt();
		System.out.print("정수를 입력해주세요: ");
		int c = scanner.nextInt();
		int max= a;
		max = max<b?b:max;
		max = max<c?c:max;
		
		System.out.println("가장큰수는 : " +max);*/
		

	}
	
}


/*

문제1 : 강아지 console 출력
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|

문제2 : 입력받은 3개 데이터를 이용한 표 만들기 
	[입력변수]
		1. 작성자[문자열] , 내용[문자열] , 날짜[문자열] 입력받아 각 변수에 저장 
	[출력 예]
		   --------------방문록--------------------
		   | 순번  | 작성자  | 	내용 	| 날짜       |
		   |  1   | 강호동  |안녕하세요  |  09-28    |
		  ----------------------------------------
	
문제3 : 급여 계산
	[입력조건]
		기본급[정수] , 수당[정수]
	[ 조건 ] 
		 실수령액 = 기본급 + 수당 - 세금[기본급10%] 
	[출력조건] 
		실수령액 출력[ 소수점 없이  ]

문제4 : 지폐 세기 
	 [입력조건 ] 
		금액 
	 [조건 ] 
		 십만원 부터 백원 까지의 개수 세기 
	[ 출력조건 ]
		예) 356789 입력시 
		 십만원 3장 
		 만원 5장
		 천원 6장 
		 백원 7개

문제5 : 하나의 정수를 입력받아 7의 배수인지 출력[ 'O' 혹은 'X' 로 출력]

문제6 : 하나의 정수를 입력받아 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력]

문제7 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제8 : 하나의 정수를 입력받아 7의 배수 이거나 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제9 : 두개의 정수를 입력받아 더 큰수 출력 

문제10 : 반지름을 입력받아 원 넓이 출력하기 
	계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

문제11 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기 
	예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

문제12 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 
	계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

문제13: 키를 정수를 입력받아 표준체중 출력하기 
	계산식) 표준체중 계산식 = > (키 - 100) * 0.9

문제14: 키와 몸무게를 입력받아 BMI 출력하기 
	계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

문제15: inch 를 입력받아 cm 로 변환하기 
	계산식) 1 inch -> 2.54cm

문제16:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오 
	계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

문제17 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
	int x = 10;
	int y = x-- + 5 + --x;
	printf(" x의 값 : %d , y의값 :  %d ", x, y)

문제18 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

문제19 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

문제20 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 로그인성공 아니면 로그인실패 출력

문제21 : 세 정수를 입력받아 가장 큰수 출력 

  
 */
