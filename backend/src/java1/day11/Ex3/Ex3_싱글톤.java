package java1.day11.Ex3;

public class Ex3_싱글톤 {
	public static void main(String[] args) {
		Member member1 = Member.getrInstace();
		Member member2 = Member.getrInstace();
		// 오류 : 생성자를 private 되어 있는 클래스 외부에서 객체 생성불가능
		// Member member = new Member()
		
		System.out.println(member1==member2);
		//2 . Member 객체 호출
	}
	
}
