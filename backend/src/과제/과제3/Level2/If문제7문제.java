package 과제.과제3.Level2;

import java.util.Scanner;

public class If문제7문제 {

	public static void main(String[] args) {
		
		/* -------문제1----- */
		// 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 [ 경우의수 : 3개(크다,작다,같다=그외) ]
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a<b) {
			System.out.println(b);
	}else if(a>b) {
		System.out.println(a);
	}else {
		System.out.println("같다");
	}
*/
		/* -------문제2----- */
		//  문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max=num1;
        if(num2>max) {
        	max=num2;
        }
        if(num3>max) {
        	max=num3;
        }
        System.out.println("가장큰수는 : "+max);
		/* -------문제3----- */
		
		/* -------문제4----- */
		
		/* -------문제5----- */
		
		/* -------문제6----- */
		
		/* -------문제7----- */
		
		
	}
	
}

/*
 	 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 [ 경우의수 : 3개(크다,작다,같다=그외) ]
 	 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
 	 문제3 : 3개의 정수를 입력받아서 오름차순[>] / 내림차순[<] [ 경우의수 :  3 7 5 : 3>7 , 3>5 , 7>5     총 : 3개  ] 
 	 문제4 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 [ 경우의수 : 2개 ]
 	
 	 문제5 : 
			// 점수를 입력받아 점수가 90점 이상이면 A등급
			//				점수가 80점 이상이면 B등급
			//				점수가 70점 이상이면 C등급
			//				그외 재시험
	
	
 	 문제6	[ 경우의수 3개 , 첫번째 경우의수 : 3개 , 두번째 경우의수 : 3개 ] 총 9개  
			[ 입력 ] : 국어,영어,수학 입력받기
			[ 조건 ]
				평균이 90점 이상이면서 
					국어점수 100점 이면 '국어우수' 출력
					영어점수 100점 이면 '영어우수' 출력
					수학점수 100점 이면 '수학우수' 출력
				평균이 80점 이상이면서 
					국어점수 90점이상 이면 '국어장려' 출력
					영어점수 90점이상 이면 '영어정려' 출력
					수학점수 90점이상 이면 '수학장려' 출력
				그외 재시험 
		 
	문제7 로그인페이지
	 		[ 입력 ] : 아이디와 비밀번호를 입력받기
	 		[ 조건 ] : 회원아이디가 admin 이고 
	           			비밀번호가 1234 일 경우에는 
	          			로그인 성공 아니면 로그인 실패 출력
 */
