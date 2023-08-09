package 과제.과제11.View;

import java.util.Scanner;

import 과제.과제11.Controller.MemberController;
import 과제.과제11.Model.Dto.MemberDto;

public class LoginPage {
	// 0.싱글톤
	private static LoginPage loginPage = new LoginPage();
	public static  LoginPage getInstance() {return loginPage;}
	private LoginPage() {}
	
	// 0.입력객체
	private Scanner sc = new Scanner(System.in);
	// 1. loginMenu	:  로그인했을때 메뉴
	public void loginMenu() {
		while(MemberController.getInstance().getLoginSession() !=0) { // 로그인이 되어 있는 경우에만 반복문
			System.out.println("\n\n ======= ======== =========");
			System.out.println("1. 로그아웃 2. 회원정보 3. 글쓰기 선택");
			
			try {
				
				int ch = sc.nextInt();
				if(ch == 1) {MemberController.getInstance().logOut();}
				if(ch == 2) {info() ;}
				if(ch==3) {boardWrite();} 
				}catch(Exception e) {
					System.out.println("경고] 잘못 입력했습니다.");
					sc = new Scanner(System.in);
			} // c end
		} // w end
	}// f end
	// 2. info			: 회원정보 페이지
	public void info() {
		System.out.println("\n\n ======= info =========");
		MemberDto result = MemberController.getInstance().info();
		System.out.println(" id : "+result.getMid());
		System.out.println(" name : "+result.getMname());
		System.out.println(" number : "+result.getMnumber());
		
		System.out.println("1.비밀번호수정 2. 회원탈퇴 3. 뒤로가기 선택>>");
		int ch = sc.nextInt();
		if(ch==1) {infoUpdate();}
		if(ch==2) {infoDelete();}
		if(ch==3) {return;}
		
		
	}
	// 3. infoUpdate	: 회원정보수정 페이지
	public void infoUpdate() {
		System.out.println("======== password update ========");
		System.out.println("새로운 비밀번호 :"); String newPw = sc.next();
		
		 boolean result =MemberController.getInstance().infoUpdate(newPw);
		 if(result) {
			 System.out.println("안내] 비밀번호수정완료:로그아웃됩니다.");
			 MemberController.getInstance().logOut();
		 }
		 else {System.out.println("경고] 비밀번호수정실패 : 관리자에게문의");}
		 
	}
	// 4. infoDelete 	: 회원탈퇴 페이지
	public void infoDelete() {
		System.out.println("========== member delete ========");
		System.out.println("정말 탈퇴하시겠습니까? 1. 예 2. 아니요" );
		int ch= sc.nextInt();
		if(ch==1) {
			
			boolean result=
			MemberController.getInstance().infoDelete();
			if(result) {
				System.out.println("안내] 회원탈퇴성공 : 로그아웃");
			}else {
				System.out.println("안내] 회원탈퇴실패 : 관리자에게 문의");
			}
		}
	}
	// 5. boardWrite	: 게시물쓰기 페이지
	public void boardWrite() {}
	// 6. boardPrint 	: 모든 게시물 출력
	public void boardPrint() {}
	// 7. boardView	: 개별 게시물 출력
	public void boardView() {}
	// 8. boardUpdate: 게시물 수정
	public void boardUpdate() {}
	// 9. boardDelete	: 게시물 삭제
	public void boardDelete() {}
}
