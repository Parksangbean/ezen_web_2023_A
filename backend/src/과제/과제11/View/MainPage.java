package 과제.과제11.View;

import java.util.Scanner;

import 과제.과제11.Controller.MemberController;

public class MainPage {
	private static MainPage mainPage = new MainPage();
	public static MainPage getInstance() { return mainPage; }
	private MainPage() { }
	
	private Scanner sc = new Scanner(System.in);
	
	
	
	//1. 메인메뉴
	public void mainView() {
		while(true) {
			System.out.println("\n\n =========회원제 커뮤니티");
			System.out.println("1.회원가입: 2. 로그인 선택: ");
			try {
			int ch = sc.nextInt();
			if(ch == 1) {signupView();}
			if(ch == 2) {loginView() ;}
			}catch(Exception e) {
				System.out.println("경고] 잘못 입력했습니다.");
				sc = new Scanner(System.in);
			}
		}
	}
	
	//2. 회원가입 화면
	public void signupView() {
		System.out.println("아이디: "); String id = sc.next();
		System.out.println("비밀번호: "); String password = sc.next();
		System.out.println("이름: "); String name = sc.next();
		System.out.println("전화번호: "); String number = sc.next();
		boolean result=
		MemberController.getInstance().signupLogic(id,password,name,number);
		
		// 3. 결과에 출력
		if(result) {System.out.println("안내] 회원가입이 성공했습니다. 감사합니다!!");}
		else {System.out.println("경고] 회원가입시 실패. 관리자에게 문의");}
	}
	
	//3 . 로그인 화면
	public void loginView() {
		System.out.println("아이디: "); String id = sc.next();
		System.out.println("비밀번호: "); String password = sc.next();
		boolean result=
		MemberController.getInstance().loginLogic(id,password);
		
		if(result) {System.out.println("안내] 로그인 성공했습니다. 감사합니다!!");}
		else {System.out.println("경고] 로그인실패. 다시확인해주세요!!");}
	}
	
}
