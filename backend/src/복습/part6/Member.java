package 복습.part6;


// 1.필드
public class Member {
	String id;
	String pw;
	String name;
	String phone;
	int age;
	// 기본생성자
	public Member() {}
	// 풀생성자
	public Member(String id, String pw, String name, String phone, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
}
