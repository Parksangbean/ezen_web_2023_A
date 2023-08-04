package 과제.과제11.Controller;

import 과제.과제11.Model.Dao.MemberDao;
import 과제.과제11.Model.Dto.MemberDto;

public class MemberController {
	private static MemberController memberController = new MemberController();
	// 2. 외부로부터 싱글톤 호출할수 있도록 get~~
	public static MemberController getInstance() { return memberController; }
	// 3. 외부에서 객체 생성 차단 위한 생성자 잠금
	private MemberController() { }
	
	//2. 회원가입 처리
	public boolean signupLogic(String id,String password,String name,String number) {
		
		// 유효성검사 했다치고
		// 1. 객체화 : 5개 변수들이 이동 할때마다 매개변수의 코드 길어지니까..패키지화
		MemberDto dto = new MemberDto(0 , id,password,name,number);
		// 2. Dao 에게 전달하고 SQL 결과 받기
		boolean result=
		MemberDao.getInstance().signupSQL(dto);
		
		//3. 결과를 view 에게 전달
		return result;
	}
	
	//3. 로그인 처리
	public boolean loginLogic(String id, String password) {
		
		
		boolean result=
		MemberDao.getInstance().loginSQL(id,password);
		
		return result;
	}	
}
