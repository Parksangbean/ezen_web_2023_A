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
			System.out.println("1.회원가입: 2. 로그인 선택: 3.아이디 찾기 4.비밀번호 찾기 ");
			try {
			int ch = sc.nextInt();
			if(ch == 1) {signupView();}
			if(ch == 2) {loginView() ;}
			if(ch==3) {findById();}
			if(ch==4) {findByPw();}
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
		int result=
		MemberController.getInstance().signupLogic(id,password,name,number);
		
		// 3. 결과에 출력
		if(result==1) {System.out.println("안내] 회원가입이 성공했습니다. 감사합니다!!");}
		else if(result==2){System.out.println("경고] 회원가입시 실패. 관리자에게 문의");}
		else if(result==3){System.out.println("경고] 아이디중복 실패. 관리자에게 문의");}
		else if(result==4){System.out.println("경고] 전화번호중복 실패. 관리자에게 문의");}
	}
	
	//3 . 로그인 화면
	public void loginView() {
		System.out.println("아이디: "); String id = sc.next();
		System.out.println("비밀번호: "); String password = sc.next();
		boolean result=MemberController.getInstance().loginLogic(id,password);
		
		if(result) {
			System.out.println("안내] 로그인 성공했습니다. 감사합니다!!");
			
			// 만약에 로그인 성공하면 다른 view 클래스로 이동
			LoginPage.getInstance().loginMenu();
			}
		else {System.out.println("경고] 로그인실패. 다시확인해주세요!!");}
	}
	
	//4.아이디 찾기
	public void findById() {
		System.out.println("------- 아이디 찾기 페이지 ---------------");
		System.out.println("이름: "); String name = sc.next();
		System.out.println("전화번호: "); String number = sc.next();
		
		String result
		=MemberController.getInstance().findById(name,number);
		
		if(result !=null) {System.out.println("회원님의 아이디 : "+result);}
		else{System.out.println("[경고] 정보가 일치하는 아이디가 없습니다.");}
		}
	 
	//5.비밀번호 찾기
	public void findByPw() {
		System.out.println("------- 비밀번호 찾기 페이지 ---------------");
		System.out.println("아이디: "); String id = sc.next();
		System.out.println("전화번호: "); String number = sc.next();
		
		String result
		=MemberController.getInstance().findByPw(id,number);
		
		if(result !=null) {System.out.println("회원님의 비밀번호 : "+result);}
		else{System.out.println("[경고] 정보가 일치하는 비밀번호가 없습니다.");}
	}
}
