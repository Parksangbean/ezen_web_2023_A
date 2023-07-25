package java1.day09.Ex2;

public class Ex2_필드초기화 {
	public static void main(String[] args) {
		//1. 필드초기화
		//1. 객체 생성
			//1. 기본생성자
			Korean k = new Korean();
				System.out.println(k.nation);	// String nation ="대한민국"
				System.out.println(k.name);		//String name;	-->기본값 null
			//2. 정의한 생성자 : 객체 생성시 해당 매게변수를 초기화o
		Korean k1 =new Korean("박자바","0101235-1526345");
			System.out.println(k1.nation);
			System.out.println(k1.name);
			System.out.println(k1.ssn);
			
			//3. 정의한 생성자2 :
		Korean k2 = new Korean("김자바","930025-06547");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
			//4. 
		
		String string = new String();
		// 2. 생성자 오버로딩
		
	}
}

// 오버로딩 : 동일한 메소드명을 선언 불가능 --> 식별이 불가능 하니까..
	// 해결책 : 매게변수의 개수/타입 이용한 메소드 식별

