package 복습.part5;

import java.util.Arrays;
import java.util.Scanner;

public class MemberSys {
	public static void main(String[] args) {
		Member[] memberList = new Member[100];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------- 회원 시스템 -----------");
			System.out.println("1. 회원가입 2. 로그인    선택>"); int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("아이디: "); String id = sc.next();
				System.out.println("아이디: "); String pw = sc.next();
				System.out.println("아이디: "); String name = sc.next();
				System.out.println("아이디: "); String number = sc.next();
				System.out.println("아이디: "); int age = sc.nextInt();
				
				Member member  = new Member();
				System.out.println(Arrays.toString(memberList));
				
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.number=number;
				member.age=age;
				
				for(int i=0; i<memberList.length; i++) {
					if(memberList==null) {
						memberList[i]=member;
						break;
					}
				}
			}
	
		}
	}
}