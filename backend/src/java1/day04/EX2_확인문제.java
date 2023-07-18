package java1.day04;

import java.util.Scanner;

public class EX2_확인문제 {
	public static void main(String[] args) {
		/*
		System.out.println("------------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("------------------------------------");
		System.out.println("선택>");*/
		Scanner sc = new Scanner(System.in);
		int 예금액=0;
		// 2.입력객체를 이용한 next~~() 메소드로 입력객채네 입력받은 데이터 형변환 해서 호출
		while(true){
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.println("선택>");
			// 2. 무한입력
			int ch =sc.nextInt();		// 입력받고 변수에 저장 안하면 까먹음 저장 필수!!!
			
			// 3. 입력에 따른 서로 다른 내용 출력
			if(ch==1) {
				System.out.println("예금액) ");
				예금액+=sc.nextInt();
				System.out.println(예금액+"원");
			}
			else if(ch ==2) {
				System.out.println("출금액>");
				예금액 -=sc.nextInt();
				System.out.println(예금액+"원");
			}
			else if(ch ==3) {
				System.out.println("잔고>");
				System.out.println("잔고>"+예금액+"");
				
			}
			else if(ch ==4) {
				System.out.println("\n프로그램 종료");
				break;
			}
		}
	}
}
