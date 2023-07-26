package 과제.과제9;

// 목적 : 설계도 , 객체의 모델링 표본
public class Member {
	// 1. 필드	: 객체의 데이터 를 저장하는곳
	String id;		// 초기값/처음에대입이 없을때 기본값[ 정수0실수0.0불false문자null]
	String password;
	String name;
	String number;
	int age;
	
	// 2. 생성자
		// 1.  매게변수 5개 정의한 생성자
	public Member() {}	// 0.번 [매게변수 없는 ] 생성자
	
	public Member(String id,String password,String name, String number, int age) {	
		this.id = id; 
		this.password = password;
		this.name = name;
		this.number = number;
		this.age = age;	
	}	
	//1. 매게 변수 5개 정의한 생성자
	/*
	public Member(String id,String password,String name,String phone) {	}				//2. 매게 변수 4개 정의한 생성자
	public Member(String id,String password,String name) {	}									//3. 매게 변수 3개 정의한 생성자
	public Member(String id,String password) {	}													//4. 매게 변수 2개 정의한 생성자
	public Member(int age) { }																				//5. 매게 변수 1개 정의한 생성자
	public Member(String id) {	}																			//5. 매게 변수 1개 정의한 생성자
	*/
	
		//기본생성자 자동으로 생성
		
	// 3. 메소드
}
