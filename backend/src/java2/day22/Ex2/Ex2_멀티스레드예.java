package java2.day22.Ex2;

public class Ex2_멀티스레드예 {
	public static void main(String[] args) {
		
		// -- 스레드 현황 : [main] -[작업스레드1] - 멀티스레드
		작업스레드1 작업스레드1 = new 작업스레드1(); // 구현객체 생성
		Thread thread = new Thread(작업스레드1); // 구현객체를 Thread객체에게 전달
		
		// 0. 작업스레드1 객체에서 작업스레드 시작
		thread.start();
		
		// 1. main 스레드가 1초 마다 출력
		try {
			int count = 1;
			while(true) {
				
				System.out.println("[main Thread] output : "+count);
				Thread.sleep(1000);
				count++;
			}
		}catch (Exception e) {System.out.println(e);}
	}
}
