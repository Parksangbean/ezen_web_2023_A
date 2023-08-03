package java1.day16.Ex2_매게변수의다형성;

public class Ex2_실행 {
	public static void main(String[] args) {
		
		// 0.
		Driver driver = new Driver();
		
		// 1. 부모객체
		Vehicle vehicle = new Vehicle();
			driver.drive(3, vehicle); // 객체의 타입과 매개변수 타입 일치 가능
		// 2. 자식객체
		Bus bus = new Bus();
			driver.drive(5, bus);		//객체의 타입[bus] 매개변수의 타입[Venhicle]
		//3. 자식객체
		Taxi taxi = new Taxi();
			driver.drive(3, taxi);
	}
}
