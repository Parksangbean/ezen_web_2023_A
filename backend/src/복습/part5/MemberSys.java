package 복습.part5;

import java.util.Arrays;
import java.util.Scanner;

// 목적 : 실행
public class MemberSys {
	public static void main(String[] args) {
		Member[] memberList = new Member[100]; 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------- 회원제 시스템 ------------");
			System.out.println("1.회원가입 2.로그인     >선택"); int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("----------- 회원가입 -------");
				System.out.println("아이디: "); String inputid = sc.next();
				System.out.println("비밀번호: "); String inputpw = sc.next();
				System.out.println("이름: "); String inputname = sc.next();
				System.out.println("전화번호: "); String inputnumber = sc.next();
				System.out.println("나이: ");int inputage =sc.nextInt();
				
				Member member = new Member();
				System.out.println(Arrays.toString(memberList));
				member.id=inputid;
				member.password=inputpw;
				member.name=inputname;
				member.number=inputnumber;
				member.age=inputage;
				
				for(int i =0; i<memberList.length; i++) {
					if(memberList[i]==null) {
						memberList[i]=member;
						break;
					}
				}
			}
			else if(ch==2) {
				System.out.println("----------- 로그인 ---------");
				System.out.println("아이디: "); String inputid = sc.next();
				System.out.println("비밀번호: "); String inputpw = sc.next();
				int login = -1;
				for(int i =0; i<memberList.length; i++) {
					if(memberList[i]!=null&&memberList[i].password.equals(inputpw)) {
						login=i;
					}
				}
				if(login>=0) {
					System.out.println("로그인성공");
				}else {
					System.out.println("로그인실패");
				}
			}
		}
	}
}
