package 과제.과제11.Model.Dao;

import java.util.ArrayList;

import 과제.과제11.Controller.BoardController;
import 과제.과제11.Model.Dto.BoardDto;

public class BoardDao extends Dao {
	
	private static BoardDao boardDao = new BoardDao();
	public static  BoardDao getInstance() {return boardDao;}
	private BoardDao() {}
	
	// 9. boardWrite	: 게시물쓰기 페이지
		public boolean boardWrite(BoardDto boardDto) {
			try {
				String sql = "insert into board(btitle,bcontent,mno) values(?,?,?)";
				
				ps = conn.prepareStatement(sql);
				ps.setString(1,boardDto.getBtitle());
				ps.setString(2,boardDto.getBcontent());
				ps.setInt(3,boardDto.getMno());
				
				int row = ps.executeUpdate();
				if(row==1) return true;
			
				
				
			}catch (Exception e) {System.out.println(e);}
			return false;
		}
		// 10. boardPrint 	: 모든 게시물 출력
		public ArrayList<BoardDto> boardPrint() {
			 ArrayList<BoardDto> list = new ArrayList<>();
			try {
				
				 //String sql = "select * from board order by bdate desc;"; // 1. 최신순[desc 내림차순] 으로 모든 레코드 호출
				 String sql = "select b.*,m.mid from member m natural join board b   order by b.bdate desc;";
				 ps = conn.prepareStatement(sql); // 2.
				 // 3. SQL에 ? (매게변수) 없으므로 set~~생략
				 rs=ps.executeQuery(); // 4. 검색결과의 레코드를 여러개 조작하기 위해 resultset 객체 변환
				 // 5. 여러개 레코드 조회
				 while(rs.next()) { // 마지막 레코드까지 하나씩 레코드 이동  (다음 레코드가 존재하지 않을때까지)
					 BoardDto dto = new BoardDto(
							 rs.getInt(1),rs.getString(2),rs.getString(3),
							 rs.getString(4),rs.getInt(5),rs.getInt(6), rs.getString(7));
					 	list.add(dto);
				 }
				 
			}catch (Exception e) {System.out.println(e);}
			
			return list;
			
			
		}
		// 11. boardView	: 개별 게시물 출력
		public BoardDto boardView(int bno) {
			try {
				String sql ="select b.*,m.mid from board b natural join member m where b.bno=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, bno);
				rs=ps.executeQuery();
				if(rs.next()) {
					 BoardDto dto = new BoardDto(
							 rs.getInt(1),rs.getString(2),rs.getString(3),
							 rs.getString(4),rs.getInt(5),rs.getInt(6), rs.getString(7));
					 return dto;
				}
				
			}catch (Exception e) {System.out.println(e);}
			return null;
		}
		// 12. boardUpdate : 게시물 수정 [ 인수 : bno , title , content ] / 반환 : true , false 
		public boolean boardUpdate( BoardDto boardDto ) {
			try {
				String sql = "update board set btitle = ? , bcontent = ? where bno = ?";// 1. 
				ps = conn.prepareStatement(sql); // 2.
				ps.setInt( 3 , boardDto.getBno() ); 	ps.setString( 1 , boardDto.getBtitle() );	 	ps.setString( 2 , boardDto.getBcontent() ); // 3.
				int row = ps.executeUpdate(); // 4. //5.  [select -> rs = ps.executeQuery() / insert,update,delete -> int row = ps.executeUpdate() ]
				if( row == 1 ) return true;	// 6.
			}catch (Exception e) {System.out.println(e);}
			return false;   // DB오류 또는 수정된 레코드가 0 이면 실패 
		}
		// 13. boardDelete	: 게시물 삭제
		public boolean boardDelete(int bno) {
			
			try {
				String sql="delete from board where bno=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, bno);
				int row = ps.executeUpdate();
				if(row==1) {return true;}
				
			}catch (Exception e) {System.out.println(e);}
			return false;
		}
		
}
