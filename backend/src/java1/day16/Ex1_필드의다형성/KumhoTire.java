package java1.day16.Ex1_필드의다형성;

public class KumhoTire extends Tire {
		// 상속받으면 자식클래스에셔 부모클래스의 맴버(필드,메소드,생성자) 사용할수 있다.
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		
		System.out.println("금호 Tire 회전");
	}
	
}
