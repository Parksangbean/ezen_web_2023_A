package 과제.과제11.Model.Dao;

import 과제.과제11.Model.Dto.MemberDto;

public class MemberDao extends Dao{
	private static MemberDao memberDao = new MemberDao();
	// 2. 외부로부터 싱글톤 호출할수 있도록 get~~
	public static MemberDao getInstance() { return memberDao; }
	// 3. 외부에서 객체 생성 차단 위한 생성자 잠금
	private MemberDao() { }
	
	
	// 1. 회원정보 Check SQL : type = 1 아이디중복체크 type = 2전화번호중복체크
	public boolean infoCheck(String 검색할필드명 , String 검색할값) {
		
		try {
				String sql ="select * from member where "+검색할필드명+" = ?"; 
				ps = conn.prepareStatement(sql);
				ps.setString(1, 검색할값);
				rs=ps.executeQuery();
				if(rs.next()) {return true;}
			
			
		}catch (Exception e) {System.out.println(e);}
		
		return false;
	}
	
	
	
	
	
	
	
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
	public int loginSQL(String id , String password) {
		
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
			return rs.getInt(1);	//  검색된 회원번호를 반환		
			}
		}catch (Exception e) {System.out.println(e);}
		return 0; // 로그인 실패 
	}
	
	//4.
		public String findById(String name, String number) {
			try {
				// try{} 안에 예외가 발생할것 같은 , 일반예외 : jdbc
				// 1단계 : sql 작성
				String sql="select mid from member where mname = ? and mnumber = ?";
				// 2단계 : 작성된 sql를 조작할 prepareStatement 객체를 연동객체로 부터 반환
				ps=conn.prepareStatement(sql);
				// 3단계 : sql조작[매개변수 대입]
				ps.setString(1, name);
				ps.setString(2, number);
				// 4단계 : sql 실행 select =executeQuery
				rs=ps.executeQuery();
				// sql 결과 조작
					// rs.next()					: 검색된 레코드중 다음레코드 이동
					// rs.getNString()		: 현재 위치한 레코드의 필드값 호출 
				if(rs.next()) {return rs.getString(1);} // 검색된 레코드중 1번째 필드인 id값을 반환
				
			}catch (Exception e) {System.out.println(e);}
			
			return null; // 실패
		}
		
		//5.
		public String findByPw(String id, String number) {
			try {
				String sql="select mpw from member where mid = ? and mnumber = ?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, number);
				rs=ps.executeQuery();
				if(rs.next()) {return rs.getString(1);}
			}catch (Exception e) {System.out.println(e);}
			
			return null; // 실패
		}
		
		// 6. 회원번호를 가지고 회원정보 찾기 .. 회원번호가 존재하는 레코드 찾기
		public MemberDto info(int mno) {
			try {
				String sql = "select * from member where mno=? ";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, mno);
				// 4. sql 실행 //5. sql결과 조작 객체
				rs = ps.executeQuery();
				//6. sql 결과 조작
				if(rs.next()) { // 만약에 다음레코드가 존재하면
					// 현재 레코드를 DTO로 만들기
					MemberDto dto = new MemberDto(
						rs.getInt(1) , rs.getString(2),rs.getString(3), 
						rs.getString(4),rs.getString(5));
					return dto;
				}
			}catch (Exception e) {System.out.println(e);}
			
			return null;
		}
		
		public boolean infoUpdate(String newPw , int mno) {
			try {
			String sql="update member set mpw = ? where mno= ? ";
			ps=conn.prepareStatement(sql);
			ps.setString(1, newPw); 
			ps.setInt(2, mno);
			int row = ps.executeUpdate();
			if(row ==1) return true;
			}catch (Exception e) {System.out.println(e);}
			return false;
		}
		
		public boolean infoDelete( int mno ) {
			try {
				String sql = "delete from member where mno= ? ";
				ps = conn.prepareStatement(sql);
				ps.setInt( 1 , mno); 
				int row = ps.executeUpdate();	// [ 삭제한 레코드 개수 반환 ] 
				if( row == 1 ) return true;
			}catch (Exception e) {System.out.println(e);}
			return false; // 실패 
		}
}
