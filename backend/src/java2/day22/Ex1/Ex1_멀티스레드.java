package java2.day22.Ex1;

import java.awt.Toolkit;

public class Ex1_멀티스레드 {
	
	public static void main(String[] args) {
		
		// p.596 예1
		System.out.println("싱글스레드 시작");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // java.awt : JAVAUI제공
		for(int i = 0; i<5; i++) {toolkit.beep(); } // toolkit.beep(); 비프용
		
		// ----------------------------- 싱글 스레드 ------------------------------------ //
		// *5번의 비프음 발생 시키면서 0.5초씩 딜레이
		for(int i =0; i<5; i++) {
			toolkit.beep();
			// * 0.5초간 딜레이 [ 메인스레드 잠깐 멈춤 ] - 밀리초
			try {
				Thread.sleep(500);
			}catch (Exception e) {System.out.println(e);}
		}
			// * 5번의 출력
		for( int i = 0 ; i<5; i++) {
			System.out.println("띵");
			try{
				Thread.sleep(500);
			}catch (Exception e) {System.out.println(e);}
		}
		System.out.println("멀티스레드 시작");
		 // ------------------------------------- -------------- --------- ------------------------------- //
		// --------------------------------------- 멀티 스레드[익명구현체] -------------------------------------------//
		// 1. [main스레드가 작업스레드 생성] main 스레드의 작업스레드 객체 만들기
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i =0; i<5; i++) {
					toolkit.beep();
					// * 0.5초간 딜레이 [ 메인스레드 잠깐 멈춤 ] - 밀리초
					try {
						Thread.sleep(500);
					}catch (Exception e) {System.out.println(e);}
				}
			} // 추상메소드 구현 end
		}); // 생성자 end
		thread.start();
		for( int i = 0 ; i<5; i++) {
			System.out.println("띵");
			try{
				Thread.sleep(500);
			}catch (Exception e) {System.out.println(e);}
		}
		// --------------------------------------------------------- //
		System.out.println("멀테스레드 시작 [ 구현체 ]");
		// ------------------------멀티스레드 시작 [구헌체]-------------------------------- //
		비프음 비프음 = new 비프음();
		Thread thread2 = new Thread(비프음); // Runnable구현체를 Thread객체에게 전달
		thread2.start();	// Thread 클래스에 start() 실행시 run 메소드 실행
	}
}

	
/*
 
 	프로그램 : 명령문의 집합
 		- 프로세스 : 실행중인 프로그램
 		- 멀티태스킹 : 두 가지 이상의 작업을 동시 처리
 		- 멀티프로세스 : 운영체제는 동시에 여러개 프로세스 생성해서 처리
 		
 		*멀티프로세스가 프로그램 단위의 멀티 태스킹
 		*멀티스레드는 프로그램 *내부 에서의 멀티 태스킹
 		
 		- 멀티포르세스 서로 독립접이다.
 			- 한글프로그램(프로세스) , 엑셀프로그램(프로세스) 동시에 사용시 한글에서 오류가 발생하더라도 엑셀은 정상
 		- 멀티스레드에서는 하나의 스레드가 오류 발생하면 프로세스 종료되므로 영향 미친다.
 			- 카카오톡(프로세스[채팅기능/스레드,파일전송기능/스레드] ) 파일전송 스레드에서 오류가 발생하면 카카오톡 프로세스 종료되므로 채팅도 종료된다.
 
 	멀티스레드 : 병렬로 데이터 처리하는 곳
 		1. 사용처 : 앱 , 웹 등등
 		2. 메인스레드 : 모든 자바  프로그램 메인스레드가 main 메소드를 실행하면서 시작된다.
 		3.
 			싱글스레드 : main메소드만 사용하는 경우 [* 메인스레드가 종료되면 프로세스 종료 ]
 			멀티스레드 : main메소드만 새로운 작업스레드를 생성하는 경유 [*모든스레드가 종료되면 프로세스 종료]
 		4. 작업 스레드 생성
 			1. Thread 클래스로 직접 생성
 				1. Thread 변수명 = new Thread(Runnable 구현객체);
 		
 		
 		5.
 			Runnable : 스레드가 작업을 싱행할때 사용하는 인터페이스
 				- run추상메소드 : 클래스가 구현해서 사용 
 			
 		
 */
