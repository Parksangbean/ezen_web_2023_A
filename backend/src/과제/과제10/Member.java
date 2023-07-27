package 과제.과제10;

public class Member {
   String id;      
   String password;
   String name;
   String number;
   int age;
   
   // 2. 생성자
      // 1.  매게변수 5개 정의한 생성자
   
   public Member(String id,String password,String name, String number, int age) {   
      this.id = id; 
      this.password = password;
      this.name = name;
      this.number = number;
      this.age = age;   
   }   
}


/*

		JVM: 자바 가상(논리적으로 만들어낸) 메모리
		
		Member.java -----클래스로더-------->Member.class------------>메소드영역
		자바코드파일									바이트 코드 파일					클래스 코드,메소드 코드.
																							정적맴버
																							
	this 		: 인스턴트맴버 : new 힙생성시 할당 되고 힙 초기화할때(gc)
				-static 이 없으면
	static		: 정적맴버	  : 프로그램 시작 할당되고 프로그램 종료할때 [ 전역 / 공통 / 공용 / 공유]
				-static 키워드 있으면
				-클래스 통해 사용
	final			: 수정불가	: 초기화할때 대입만 가능하고 수정 불가능
	
	static final 	:  상수 : 프로그램내에서 1개만저장(static) 수정불가(final) 합친 키워드




*/