package java2.day24_제네릭.Ex3;

public class Ex3_제네릭 {
	public static void main(String[] args) {
		
		// 1. 홈 렌탈  구현체
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent(); // 2. 해당 대리점 렌탈...
		home.turnOnLight();
		
		Home 유재석집 = homeAgency.rent();
		유재석집.turnOnLight();
		
		Home 강호동집 = homeAgency.rent();	// 2. 해당대리점에서 새로운 Home 객체를 생성
		강호동집.turnOnLight();
		
		// 2. 자동차 렌탈 구현체
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}
}
