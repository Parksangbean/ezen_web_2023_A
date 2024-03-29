package java1.day19.Ex1;

public interface RemoteControl { // 인터페이스 선언
	// 인터페이스 : 두 장치(객체)를 연결하는 접속기
	// 구성맴버
		// 1. public 상수 필드				[public static final ]
		int MAX_VOLUME = 10;
		public static final int MIN_VOLUME =0;
		// 2. public 추상 메소드			[public static final ]		: 선언부			=> 구현객체	O
		void trunon();
		public abstract void trunOff();
		void setVolume (int volume);
		// 3. public 디폴트 메소드   	[public]	default : 선언부 :선언부				=> 구현객체 O
		default void setMute (boolean mute) {
			if(mute) {System.out.println("무음 처리합니다."); setVolume(MIN_VOLUME);}
			else {System.out.println("무음 해제합니다.");}
		}
		public default void getMute() {System.out.println();}
		// 4. public 정적(객체없이) 메소드 [public] static : 선언부 + 실행부 => 구현객체 x
		static void changeBattery() {System.out.println("리모컨 건전지를 교환합니다.");}
		public static void checkBattery() {System.out.println("건전지 확인합니다.");}
		// 5. private 메소드			: 디플트메소드 안에서만 호출 가능
		private void defaultCommon() {System.out.println("디폴트메소드");}
		// 6. private 정적메소			: 디폴트메소드, 정적메소드 에서 호출 가능
		private static void staticCommon() {System.out.println("정적메소드");}
	
	
}
/*
	인스턴스맴버	: 객채 생성시 메모리 할당되는 필드,메소드[static없는]
	정적맴버		: 객체가 없어도 메모리 우선할당된 필드,메소드 [static있는]
		- 정적맴버는 인스턴스맴버에 접글할수 없다 . [p.249]





*/