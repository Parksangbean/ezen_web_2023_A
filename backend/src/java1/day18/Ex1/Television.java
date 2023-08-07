package java1.day18.Ex1;

// 클래스에서 인터페이스를 구현하기
public class Television implements RemoteControl{
	private int Volume;

	// 클래스명 implements 인터페이스명
	// 인터페이스가 선언한 추상메소드를 해당 클래스가 구현 대신 하기.
	// !!!!! : implements 키워드 사용했으면 추상메소드를 
	@Override
	public void turnOn() {System.out.println("TV를 켭니다");}
	
	@Override
	public void trunOff(){System.out.println("TV를 끕니다.");}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		}else {
			this.Volume = volume;
			System.out.println("현재 텔리비전 소음 :"+this.Volume); 
		}
		
	}
}
