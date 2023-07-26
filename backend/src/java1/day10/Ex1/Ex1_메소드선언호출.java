package java1.day10.Ex1;


public class Ex1_메소드선언호출 { // c s
	// 실행목적
	public static void main(String[] args) { // m s
			
			// 1. 메소드를 호출하기위한 객체 생성
		Calculator myCalc = new Calculator();
		
		// 2. 객체 통한 메소드 호출 / 매게변수 전달 = 2개 리턴o
		myCalc.powerOn();  
		
		// 3. 객체 동안 메소드 호출 / 매게 변수 전달 = 2개 / 리턴 o
		int result = myCalc.plus(5, 6);
		
		System.out.println("result1: "+result);
		
		// 4. 객체 동안 메소드 호출 / 매게변수 전달 = 2개 '변수값(값,주소)
		
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
			
	}// main e
}  // c e
