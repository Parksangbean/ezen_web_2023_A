package 복습.part6;

import java.util.Scanner;

public class MemberSys {
	public static void main(String[] args) {
		Member[] MemberList = new Member[100];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------- 회원 시스템 -----------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기        선택>>"); int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("--------- 회원가입 --------");
				System.out.println("아이디: "); String id = sc.next();
				System.out.println("비밀번호: "); String pw = sc.next();
				System.out.println("이름: "); String name = sc.next();
				System.out.println("전화번호: "); String phone = sc.next();
				System.out.println("나이: "); int age=sc.nextInt();
				
				Member member = new Member( id,  pw,  name, phone , age);
				for(int i=0; i<MemberList.length; i++) {
					if(MemberList[i]==null) {
						MemberList[i]=member;
					}
				}
				System.out.println("안내) 회원가입 성공");
			}
			else if (ch==2) {
				System.out.println("-------- 로그인 -------");
				System.out.println("아이디: "); String id = sc.next();
				System.out.println("비밀번호: "); String pw = sc.next();
				int login=-1;
				for(int i = 0; i<MemberList.length; i++) {
					if(MemberList[i]!=null&&MemberList[i].pw.equals(pw)) {
						login=i;
					}
				}
				if(login>=0) {
					System.out.println("안내) 로그인 성공");
				}else {
					System.out.println("안내) 로그인 실패 : 아이디와 비밀번호가 일치하지 않습니다.");
				}
			}
			else if (ch==3) {
				System.out.println("--------- 아이디 찾기 ----------");
				System.out.println("이름: "); String name = sc.next();
				System.out.println("전화번호: "); String phone = sc.next();
				for(int i=0; i<MemberList.length; i++) {
					if(MemberList[i]!=null&&MemberList[i].phone.equals(phone)) {
						System.out.println("안내)회원님의 아이디 : "+MemberList[i].id+"입니다.");
						break;
					}
				}
			}
			else if (ch==4) {
				System.out.println("이름: "); String name = sc.next();
				System.out.println("전화번호: "); String phone = sc.next();
				for(int i =0; i<MemberList.length; i++) {
					if(MemberList[i]!=null&&MemberList[i].name.equals(name)) {
						System.out.println("안내) 회원님의 비밀번호 :"+MemberList[i].pw+"입니다.");
						break;
					}
				}
			}
		}
	}
}
