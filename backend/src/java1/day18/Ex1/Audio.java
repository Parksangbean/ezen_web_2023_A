package java1.day18.Ex1;

public class Audio implements RemoteControl{
	
	private int Volume;
	@Override
	public void turnOn() {
		
		System.out.println("Audio를 켰습니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("오디오 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		}else {
			this.Volume = volume;
			System.out.println("현재 오디오 소음 :"+this.Volume);
		}
		
	}
	
}
