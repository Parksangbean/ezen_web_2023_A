package 과제.과제11.View;

import java.util.ArrayList;
import java.util.Scanner;

import 과제.과제11.Controller.BoardController;
import 과제.과제11.Controller.MemberController;
import 과제.과제11.Model.Dto.BoardDto;
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
			System.out.println("1. 로그아웃 2. 회원정보 3. 글쓰기 선택 4. 글조회 선택:");
			boardPrint();
			try {
				
				int ch = sc.nextInt();
				if(ch == 1) {MemberController.getInstance().logOut();}
				if(ch == 2) {info() ;}
				if(ch==3) {boardWrite();} 
				if(ch==4) {boardView();}
				}catch(Exception e) {
					System.out.println("경고] 잘못 입력했습니다."+e);
					
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
		
		System.out.println("1.비밀번호수정 2. 회원탈퇴 3. 뒤로가기 선택 4. 쪽지 확인>>");
		int ch = sc.nextInt();
		if(ch==1) {infoUpdate();}
		if(ch==2) {infoDelete();}
		if(ch==3) {return;}
		if(ch==4) {}
		
		
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
	// 9. boardWrite	: 게시물쓰기 페이지
	public void boardWrite() {
		System.out.println("--------- post write ----------");
		System.out.println("제목 >"); String title =sc.next();
		System.out.println("내용 >"); String content =sc.next();
		
		boolean result=
		BoardController.getInstance().boardWrite(title, content);
		if(result) {System.out.println("안내] 글쓰기 등록");}
		else {System.out.println("안내] 글쓰기 실패 : 제목 1~50 사이로 필수 입력");}
	}
	// 10. boardPrint 	: 모든 게시물 출력
	public void boardPrint() {
		System.out.println("----- POST LIST -------");
		// 1. 여러개의 게시물을 요청해서 반환된 결과 저장
		ArrayList<BoardDto> result=
				BoardController.getInstance().boardPrint();
		// 2. 출력
		System.out.printf("%-3s %-3s %-19s %-10s %s \n","bno","view","date","mid","title");
		for(int i=0; i<result.size(); i++) {
			BoardDto dto = result.get(i);
			
			System.out.printf("%-3s %-3s %-19s %-10s %s \n",
					dto.getBno(),dto.getBview(),dto.getBdate(),dto.getMid(),dto.getBtitle());
			
		}
	}
	// 11. boardView	: 개별 게시물 출력
	public void boardView() {
		System.out.println("----- POST VIEW -------");
		// 1. 보고자하는 게시물의 게시물번호를 입력받기[식별번호]
		System.out.println("게시물번호: "); int bno = sc.nextInt();
		// 2.
		BoardDto result = BoardController.getInstance().boardView(bno);
		
		System.out.printf("bno : %-3s view : %-3s mid : %-10s date : %-19s \n" , 
				result.getBno() , result.getBview() , 
				result.getMid() , result.getBdate() );
		
		System.out.printf("title : %s \n",result.getBtitle());
		System.out.printf("content : %s \n ",result.getBcontent());
		
		// 4. 추가메뉴
		System.out.println("1.뒤로가기 2. 수정 3. 삭제 4.쪽지 보내기 선택>"); int ch = sc.nextInt();
		if(ch==1) {}
		if(ch==2) {boardUpdate(bno,result.getMno());}	// 보고있는 게시물 번호와 작성자 회원번호
		if(ch==3) {boardDelete(bno, result.getMno());}	// 보고있는 게시물 번호와 작성자 회원번호
		if(ch==4) {  }
	}
	// 12. boardUpdate: 게시물 수정
	public void boardUpdate(int bno , int mno ) {
		System.out.println("수정할제목 >"); String title =sc.next();
		System.out.println("수정할내용 >"); String content =sc.next();
		
		// 2.
		int result =
				BoardController.getInstance().boardUpdate(bno,mno,title,content);
		if(result == 1) {System.out.println("안내] 글 수정 성공");}
		else if(result==2) {System.out.println("경고] 글 수정 실패 : 관리자 오류");}
		else if(result==3) {System.out.println("경고] 본인 글만 수정 가능합니다.");}
		else if(result==4) {System.out.println("경고] 수정할 제목을 1~50글자 사이로 입력해주세요.");}
	
	}
	// 13. boardDelete	: 게시물 삭제
	public void boardDelete(int bno, int mno) {
		int result=
		BoardController.getInstance().boardDelete(bno,mno);
		if(result==1) {System.out.println("안내] 글 삭제 성공");}
		else if(result==2) {System.out.println("경고] 글 삭제 실패 : 관리자 오류");}
		else if(result==3) {System.out.println("경고] 본인 글만 삭제 가능합니다.");}
	}
	
	

}
