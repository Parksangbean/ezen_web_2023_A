package model.dao;

import java.util.ArrayList;

import model.dto.VisitDto;


public class VisitDao extends Dao{
	// 0.싱글톤
	private static VisitDao visitDao = new VisitDao();
	public static VisitDao getInstance() {return visitDao;}
	private VisitDao() {}
	
	// 1. 저장 [ 인수 : 저장할내용이 담긴 DTO , 리턴 : 성공/실패(boolean)= true/false ]
	public boolean vwrite(VisitDto visitDto) {
		
		// 0. try{} catch(){}
		try {
			// 1. SQL 작성
			String sql = "insert into visitlog (vwriter , vpwd , vcontent ) values(?,?,?)";
			// 2. SQL 연결
			ps = conn.prepareStatement(sql);
			// 3. SQL 매개변수 대입
			ps.setString(1, visitDto.getVwriter());
			ps.setString(2, visitDto.getVpwd());
			ps.setString(3, visitDto.getVcontent());
			// 4. SQL 실행
			ps.execute();
			// 5. SQL 반환
			return true;
		}catch (Exception e) {System.out.println(e);}
		
		
		return false;
	}
	
	
	// 2. 호출 [ 인수 : x, 리턴 : 여러개의 방문록DTO ]
	public  ArrayList<VisitDto> vread() {
		ArrayList<VisitDto> list = new ArrayList<>();
		try {
			String sql = "select * from visitlog order by vdate desc";
			ps= conn.prepareStatement(sql);
			rs=ps.executeQuery(); // s -> q , i/d/u -> u,
			
			while(rs.next()) {// rs.next() : select 검색결과중 다음레코드 이동 = 존재하면 true /존재하지 않으면 false
				 VisitDto dto = new VisitDto(
						 rs.getInt(1),rs.getString(2),rs.getString(3),
						 rs.getString(4),rs.getString(5));
				 // ** 여러개 dto를 저장할 리스트에 저장				 
						 list.add(dto);
				
			 }

		}catch (Exception e) {System.out.println(e);}
		return list;
		}
	
	// 3. 수정 [ 인수 : 수정할번호(int), 수정할방문록내용(Stirng)/비밀번호검토(String) ,  리턴 : 성공/실패 =true/false]
	public boolean vupdate(int vno , String vcontent , String vpwd) {
		try {
			String sql ="update visitlog set vcontent=? where vno=? and vpwd=? ";
			ps=conn.prepareStatement(sql);
			ps.setInt(2, vno); ps.setString(1, vcontent); ps.setString(3, vpwd);
			int row = ps.executeUpdate(); // 4.SQL 실행
			if(row==1) return true;		// 5. SQL 실행 결과에 따른 제어
			return false;
			
		}catch (Exception e) {System.out.println(e);}
		
		
		return false;
		}
	
	
	// 4. 삭제 [ 인수 : 삭제할방문록번호(int),비밀번호검토(String),  리턴 : 성공/실패(boolean)= true/false ]
	public boolean vdelete(int vno, String vpwd) {
		
		try {
			String sql="delete from visitlog where vno = ? and vpwd=?"; // 1. SQLl 작성
			ps=conn.prepareStatement(sql); // 2. SQL 연동
			ps.setInt(1, vno); // 3. SQL 매개변수 대입
			ps.setString(2, vpwd);
			int row = ps.executeUpdate(); // 4.SQL 실행
			if(row==1) return true;		// 5. SQL 실행 결과에 따른 제어
			return false;
			
		}catch (Exception e) {System.out.println(e);}
		
		
		
		return false;
	}
}
