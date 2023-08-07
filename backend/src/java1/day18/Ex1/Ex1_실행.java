package java1.day18.Ex1;

public class Ex1_실행 {
	public static void main(String[] args) {
		
		//1. 인터페이스타입의 변수 선언
		RemoteControl rc;
		
		//2. 인터페이스 변수에 텔레비전 객체의 대입[주소ㅓ대입]
		rc = new Television();
		// 구현객체 : 추상메소드가 존재한 인터페이스를 구현해준 클래스로 객체 상성
		
		// 3. 인터페이스 메소드 실행
		rc.turnOn();
		// 4. 오디오 변경
		rc = new Audio();
		rc.turnOn();
		
		// 5. 리모콘의 상수필드 호출
		System.out.println("리모콘의 최대 불륨 : "+rc.MAX_VOLUME);
		System.out.println("리모콘의 최저 불륨 : "+rc.MIN_VOLUME);
		
		// 6. 메소드 실행
		rc.setVolume(100);
		
		//7. 리모컨 교체
		rc = new Television();
		rc.setVolume(-10);
		
		/*
		 		인터페이스			vs 			상속
		 		implements 		vs				ewtends
		 		구현하다								연장하다
		 		여러개 구현							1개 상속
		 		추상메소드							메소드
		 		*버전[다양한메소드제공]
		 		목적 : 메소드 통합					빠른 개발 / 설계 모듈화[쪼개서]
		 		게임패드								직급별 사원
		 		
		 */
	}
	
}

