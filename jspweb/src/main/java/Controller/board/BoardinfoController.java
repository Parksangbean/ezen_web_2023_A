package Controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.BoardDao;
import model.dto.BoardDto;
import model.dto.MemberDto;


@WebServlet("/BoardinfoController")
public class BoardinfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BoardinfoController() {
        super();
        
    }
    // 1. 전체조회 , 2. 개별조회
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 첨부파일 업로드
				MultipartRequest multi = new MultipartRequest(
						request,
						request.getServletContext().getRealPath("/board/upload"),
						1024*1024*1024, // 1GB
						"UTF-8",
						new DefaultFileRenamePolicy() // 만약에 업로드파일명이 서버내 존재하면 (중복) 자동으로 파일명뒤에 숫자 붙이기
						);
				System.out.println(request.getServletContext().getRealPath("/board/upload"));
				
				// 1. (입력받은 매개변수) 요청
				String btitle = multi.getParameter("btitle");
				String bcontent = multi.getParameter("bcontent");
				String bfile = multi.getFilesystemName("bfile");
				
				int mno = ((MemberDto)request.getSession().getAttribute("loginDto")).getMno();
				int bcno = Integer.parseInt(multi.getParameter("bcno"));
				
				// 2. 유효성검사/객체화
				BoardDto boardDto = new BoardDto(btitle, bcontent,bfile,mno,bcno);
				System.out.println(boardDto);
				// 3. Dao 처리
				boolean result = BoardDao.getInstance().bwrite(boardDto);
				// 4. (Dao 결과) 응답
				response.setContentType("application/json;charset=UTF-8");
				response.getWriter().print(result);
		}

	// 2. 쓰기
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	// 3. 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	// 4. 삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
