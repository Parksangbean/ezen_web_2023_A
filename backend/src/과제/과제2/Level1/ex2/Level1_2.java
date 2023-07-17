package 과제.과제2.Level1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean bool= true;
		byte a = 100;
		char b ='A';
		short c = 30000;
		int d = 200000000;
		long e = 2000000000;
		float f = 3.123123f;
		double g = 3.123123123;
		
		System.out.printf("%-10s %15s  %30s\n", "boolean",bool, "true or false");
		System.out.printf("%-10s %15s %30s\n", "byte",a, "-128 ~ 127");
		System.out.printf("%-10s %15s %30s\n", "char",b, "0~65535[ charcher 1 ]");
		System.out.printf("%-10s %15s %30s\n", "short",c, "-32768 ~32767");
		System.out.printf("%-10s %15s %30s\n", "int",d, "-+2000 million");
		System.out.printf("%-10s %15s %30s\n", "long",e, "-+2000 million Excess");
		System.out.printf("%-10s %15s %30s\n", "float",f, "8 decimal places");
		System.out.printf("%-10s %15s %30s\n", "double",g, "17 decimal places");
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
