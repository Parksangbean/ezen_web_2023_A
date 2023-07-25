package java1.day09.Ex2;

public class Korean {
	
	// 1. 필드
		String nation = "대한민국";		//1. 객체마다 동일한 값을 갖고 있다면 
		String name;						//2. 객체마다 다른 값을 가져야 한다면	/ 객체의 필드값 기본값 --> 생성자 이용 권장
		String ssn ;
	
	// 2. 생성자
		//1. 기본 생성자
		public Korean() {}
		//1. 매게변수가 1개 인 생성자;
		public Korean(String name) {}
		//2. 매게변수2개 인 생성자
	public Korean( String name, String ssn) {	// 가독성 (읽기좋게) 매게 변수명은 필드명과 
		//String n = "박자바"
		//String s = "0101235-1526345"
		// this : 현재 클래스 뜻		[매게 변수 : 외부로부터 들어온 변수명 동일할때]
			// this.필드명	this.메소드명()
		 this.name =name;		this.ssn=ssn;
	}
		// 3. 매게변수 2개인  생성자
	public Korean(String name, String ssn,String nation) {
		this(name,ssn); this.nation =nation;
	}
		//5. 매게변수2 개 인 생성자
	public  Korean(String name , int ssn) {}
		//5. 매게변수2개 인 생성자 [3. ㄱ매게변수와 타입순서가 다를경우]
	public Korean(int ssn , String name) {	}
	// 3. 메소드
	
	
}
