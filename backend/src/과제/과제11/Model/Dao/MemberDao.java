package 과제.과제11.Model.Dao;

import 과제.과제11.Model.Dto.MemberDto;

public class MemberDao extends Dao{
	private static MemberDao memberDao = new MemberDao();
	// 2. 외부로부터 싱글톤 호출할수 있도록 get~~
	public static MemberDao getInstance() { return memberDao; }
	// 3. 외부에서 객체 생성 차단 위한 생성자 잠금
	private MemberDao() { }
	
	
	//2. 회원가입SQL
	public boolean signupSQL(MemberDto dto) {
		System.out.println("----------signupSQL 도착");
		System.out.println(dto);
		//1. 회원가입 필요한 SQL을 문자열에 작성해서 작성
			//테이블에 레코드 삽입 : insert into 테이블명(필드명, 필드명, 필드명) values(값 , 값 , 값);
		String sql = "insert into member(mid ,mpw,mname,mnumber) values( ? , ? , ? , ? )";
		
		try {
		//2. 위에서 작성한 SQL를 DB연동객체에 대입 // 3. 대입된 SQL 조작하기 위해 반환된 prepareStatement를 ps 대입
		ps =conn.prepareStatement(sql); // db연동객체.prepareStatement(조작할SQL문자열)
		// conn,ps 필드는 Dao 부모클래스에게 물려받음
		//4. SQL에서 작성한 매개변수 ()? 에 대해 값 대입
		ps.setString(1, dto.getMid());	
		ps.setString(2, dto.getMpw());
		ps.setString(3, dto.getMname());
		ps.setString(4, dto.getMnumber());
		 // 5. SQL 실행									[ps.executeUpdate(); :SQL 실행 ]
		ps.executeUpdate();
		// 4. 리턴 [회원가입성공 =true / 회원가입 실패 =false]
		return true;
		}catch(Exception e) {System.out.println(e);}
		// 4. 리턴 [회원가입성공 =true / 회원가입 실패 =false]
		return false;
	}
	
	//3. 로그인SQL
	public boolean loginSQL(String id , String password) {
		
		//1단계 : sql 작성한다. [ 추천: mysql 워크밴치에서 임의값 테스트하고]
		try {
		String sql="select * from member where mid=? and mpw=?";
		
		// 2단계 : SQL 조작할 prepareStatement() 반환받기
		ps=conn.prepareStatement(sql);
		// 3단계 : SQL 조작 [SQL 안에 있는 매게변수[?] 에 값 대입
		ps.setString(1, id);
		ps.setString(2, password);
		
		rs=ps.executeQuery();
		// 5단계 : sql 실행 결과 조작 [rs.next() : 결과중에서 다음 레코드객체 호출 ]
			//만약에 결과의 레코드 3개 가정 [ rs = null -> 레코드1 -> 레코드2 -> 레코드3]
			//																.next()
		if(rs.next() ) { // 로그인은 레코드가 1개 또는 0개 이므로 if 사용해서 .next() 1번 호출
			return true;			
			}
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
}
