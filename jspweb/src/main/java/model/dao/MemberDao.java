package model.dao;

import java.sql.Connection;

import model.dto.MemberDto;

public class MemberDao extends Dao{
	private static MemberDao memberDao = new MemberDao();
	public static MemberDao getInstance() {return memberDao;}
	private MemberDao() {}
	
	
	// 1. 회원가입
	public boolean signup(MemberDto dto) {
		try {
			String sql="insert into member(mid , mpwd, memail , mimg) value(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, dto.getMid());
			ps.setString(2, dto.getMpwd());
			ps.setString(3, dto.getMemail());
			ps.setString(4, dto.getMimg());
			int row=ps.executeUpdate();
			if(row==1)return true;
			
		}catch (Exception e) {System.out.println(e);}
		
		return false;
	}
	
	
	// 2. 로그인
	
	// 3. 아이디찾기
	
	// 4. 비밀번호 찾기
	
	// 5. 내정보 호출
	
	// 6. 아이디/이메일 중복검사 [ 인수 : 검사할아이디 / 반환 true(중복있어) , false(중복없어)
	public boolean findId(String mid) {
		try {
			String sql ="select * from member where mid =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, mid);
			rs=ps.executeQuery();
			// [while : 결과 레코드 여러개 검사 vs if : 결과 레코드 한개 검사]
			if(rs.next()) return true;
		
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	// 7. 회원수정
	
	// 8. 회원탈퇴
}