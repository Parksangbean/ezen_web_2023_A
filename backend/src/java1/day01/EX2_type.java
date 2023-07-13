package java1.day01;	// 현재  클래스 위치한 폴더 경로

public class EX2_type {	//class s
	public static void main(String[] args) { //main s
		
		// 1. [p.41 ] 진수를 표현하는 방법
			//진수 : 데이터를 표현하는 수의 형식 // 기계어 [2진수/이진코드] 표현하는데 한계 극복 
			// 0, 1 : 2진수 , 0~7 진수 , 0 ~9 : 10진수 , 16진수 0~9ABCDEF : 16진수 
		int ver1 = 0b1011; // 데이터 앞에 0b
		System.out.println("ver1 : " + ver1);
		int ver2 = 0206;		//8진수
		System.out.println("ver2 : "+ver2);
		int ver3 = 365;		//10진수
		System.out.println("ver3: "+ver3);
		int ver4= 0xB3;		//16진수
		System.out.println("ver4 : "+ver4);
		
		// 2. byte 타입 [+-128]
		byte b1 = -128; System.out.println("b1 : " + b1);
		byte b2 = 127;  System.out.println("b2 : " + b2);
		//byte b3 = 200;  System.out.println("b3 : " + b3);
		
		// short 타입  [-32,768 ~ 32,767 ] 대락 -30000 정도
		short s1 = 3200;		System.out.println("s1 : " + s1);
		
		//int 타입 [대략 +- 21억정도] * 정수 기본타입 : 1. 우리 코드로 작성한 정수
		int i1 = 2000000000; System.out.println("i1 :" + i1);
		// long 타입 [대략 +- 21억이상 자동 ]
		long i2= 3000000000l; System.out.println("i2 : " + i2);
		
		
		// [p.43 ] char 타입[ 문자1개 저장]
		char c1 = 'A';
		System.out.println("c1: " +c1);
		char c2 = 97;
		System.out.println("c2 : " +c2);
		char c3 = '가';
		System.out.println("c3 :" +c3);
		char c4 = 44032;
		System.out.println("c4 : " +c4);
		
		//[p.49] String 클래스 [문자열 저장 ] " "
		String str1="안녕하세요.";
		System.out.println("str1: " + str1);
		
		//[p.45] float	[ 소수 8자리 표현]
		float f1 = 0.12312122123123f;
		System.out.println("f1: " +f1);
		// double		[ 소수점 17자리표현]	*실수 기본타입
		double d1 = 0.1234567897897895646456;
		System.out.println("d1: " +d1);
		
		// [p.48] boolean 타입 [true or false]
		boolean bool1 = true; System.out.println("bool1 : " + bool1);
		// [p.50] 제어/이스케이프(기능) 문자
			// \" : "출력	
		System.out.println("\"");
		System.out.println("\\");
		System.out.println("\t");
		System.out.println("\n줄바꿈"); 
		System.out.println("\r캐리지 리턴"); 
					// " : 문자열 ,
	} //main e 
}//class e



/*

	타입/자료형 : 데이터 저장할때 사용되는 메모리 크기
		1.메모리 효율성 높일수 있다.
		2. 가독성 높음
							메모리크기			허용범위
		정수형타입
			byte				1바이트				[-127 ~127 ]	대략+-100정도
			short				2바이트				[-32,768 ~ 32,767 ] 대락 -30000 정도
			*int				4바이트				[대략 +- 21억정도]
			long 				8바이트				[대략 +-21억이상 정도]
		실수타입
			float 				4바이트				[소수점 7자리표현]
		 	*double 		8바이트				[소수점 17자리까지 표현]
		문자타입
		char				2바이트				[0 ~65535] 유니코드
		String 			4바이트					제한없음
		논리타입
		boolean 			1비트					[0 = flase[0] / true [1]
		문자열타입

	//표현 단위 : 진수 : 데이터를 표현하는 수의 형식 // 기계어 [2진수/이진코드] 표현하는데 한계 극복 
			// 0, 1 : 2진수 , 0~7 진수 , 0 ~9 : 10진수 , 16진수 0~9ABCDEF : 16진수 
	// 용량 단위 : 
	 		(처리최소단위)0, 1 => 1bit			-> 01010101 - > 8자리 -> 8bit => 1byte
	 		(기능처리 최소단위) 바이트: 1byte => 1024bute => 1kbyte
	 		킬로바이트 : 1kb => 1024kb -> imb
	 		메가바이트 : imb => 1024mb => 1gb
	 // 인코딩: 2진수를 문자로 표현하는 방법
	  	아스키코드 : 7비트(확장8비트) -> 128문자 표현 1바이트 = 특수문자/숫자/영문
	  	유니코드 : 전세계 공용어 문자 표현				2바이트 = 특수문자/숫자/영문/한글
	 	
	 */
			 
