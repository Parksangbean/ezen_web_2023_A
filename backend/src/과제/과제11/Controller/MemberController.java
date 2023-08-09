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
	public int signupLogic(String id,String password,String name,String number) {
		
		// 1. 아이디
		if(MemberDao.getInstance().infoCheck("mid", id)) return 3;
		
		if(MemberDao.getInstance().infoCheck("mnumber", number)) return 4;
		// 1. 객체화 : 5개 변수들이 이동 할때마다 매개변수의 코드 길어지니까..패키지화
		MemberDto dto = new MemberDto(0 , id,password,name,number);
		// 2. Dao 에게 전달하고  SQL 결과 받기
		boolean result=
		MemberDao.getInstance().signupSQL(dto);
		
		//3. 결과를 view 에게 전달
		if(result)return 1;
		else return 2;
	}
	
	// 0. 로그인된 회원번호를 저장하는 필드 = 웹세션
	private int loginSession = 0; // 0: 로그인 안한상태 1이상 : 로그인된 회원의 번호
	public int getLoginSession() {return loginSession;} 
	
	
	//3. 로그인 처리
	public boolean loginLogic(String id, String password) {
		
		
		int result= MemberDao.getInstance().loginSQL(id,password);
		// 로그인 성공했을때 기록 하기 [ -로그인 이후 로그인된정보로 활동 ]
		if(result>=1) {this.loginSession=result;  return true;}
		else{return false;}	
	}	
	
	// 3-2 로그아웃 처리
	public void logOut() {this.loginSession = 0;}
	
	
	//4.
		public String findById(String name, String number) {
			System.out.println(name+number);
			String result = MemberDao.getInstance().findById(name, number);
	
			return result;
		}
		
		//5.
		public String findByPw(String id , String number) {
			String result = MemberDao.getInstance().findByPw(id, number);
			return MemberDao.getInstance().findByPw(id, number); 
			
		}
		// 6.
		public MemberDto info() {
			// 현재 로그인된 회원번호[loginSessioon] view에서 전달 받지않고 컨트롤안에 저장
			// 현재 로그인된 회원번호로 회원정보 요청하기
			return MemberDao.getInstance().info(this.loginSession);
		}
		
	
		public boolean infoUpdate(String newPw) {
			
			return MemberDao.getInstance().infoUpdate(newPw, loginSession);
		}
		
		public boolean infoDelete() {
			
			return MemberDao.getInstance().infoDelete(loginSession);
		}
}
