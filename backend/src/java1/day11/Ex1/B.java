package java1.day11.Ex1;

public class B {
	A a = new A();	// A와B클래스는 같은 패키징리니깐.
	
	public B() {}
	
	// 3. 오류 : C클래스 는 호ㅓ출이 가능하지만 생성자(private)는 호출 불가능
	// C c= new C();
}
