package Controller.member;

import java.io.IOException;

import javax.mail.Multipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.multi.MultiButtonUI;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.MemberDao;
import model.dto.MemberDto;


@WebServlet("/MemberinfoController")
public class MemberinfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MemberinfoController() {
        super();
    }

 // 1. [C] (첨부파일 있을때 form )회원가입
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   	// ----------------------------------------------- 파일 업로드 : 서버폴더에 --------------------------------------------- //	
   		
   		String uploadpath = request.getServletContext().getRealPath("/Member/img");
   		// 첨부파일 저장할 폴더의 절대경로
   		// String uploadpath ="C:\\Users\\504\\git\\ezen_web_2023_A\\jspweb\\src\\main\\webapp\\Member\\img"; // 첨부파일 저장할 경로
   		
   		// 3. 서버 pc 경로 ( 상대경로 = 서버경로 찾아주는 함수 )
   			// 서버에 build(배포)된 파일/폴더 외 경로 찾기
   			// request.getSession().getServletContext().getRealPath("프로필명이하 경로");
   		request.getSession().getServletContext().getRealPath("/Member/img");
   		System.out.println("member 폴더 img 폴더 실제(서버) 경로 :"+uploadpath);
   		// 첨부파일 전송 했을때.
   			// 1. 첨부파일 서버PC에 업로드( COS.jar 라이브러리 ) 
   				// MultipartRequest : 파일 업로드 클래스 
   			MultipartRequest multi = new MultipartRequest(
   					request , 		// 1. HttpServletRequest 요청방식 
   					uploadpath , 	// 2. 첨부파일을 저장할 폴더 경로 
   					1024*1024*10,	// 3. 첨부파일 용량 허용 범위 [ 바이트단위 ] 10MB
   					"UTF-8" , 		// 4. 한글인코딩타입 
   					new DefaultFileRenamePolicy()	// 5. [파일명중복제거] 만약에 서버내 첨부파일의 동일한 이름이 있을때 이름뒤에 숫자를 자동으로 붙이기 
   					);
   			
   		// ----------------------------------------------- DB처리 : 업로드된 파일명  --------------------------------------------- //	
   			// 2. form 안에 있는 각 데이터 호출 
   		// 일반input : multi.getParameter("form객체전송시input name");		
   		// 첨부파일input : multi.getFilesystemName( );
   		String mid =  multi.getParameter("mid");			System.out.println("mid : "  + mid);
   		String mpwd =  multi.getParameter("mpwd");		System.out.println("mpwd : "  + mpwd);
   		String memail =  multi.getParameter("memail");	System.out.println("memail : "  + memail);
   		//String mimg =  multi.getParameter("mimg");		System.out.println("mimg : "  + mimg);
   		String mimg =  multi.getFilesystemName("mimg");		System.out.println("mimg : "  + mimg);
   		
   		// 1. 만약에 사진업로드 안했으면 기본프로필 사용하도록 변경 = defult.webp
   		if(mimg==null) {mimg ="defult.webp";}
   		
   		// 2. (선택) 객체화.
   		MemberDto memberDto = new MemberDto(mid, mpwd, memail, mimg);
   		// 2. (선택) 유효성검사.
   		
   		// 3. Dao 에게 전달하고 결과 받는다.
   		boolean result = MemberDao.getInstance().signup(memberDto);
   		
   		// 4. AJAX 통신으로 결과 데이터를 응답을 보낸다. [ response ]
   		response.setContentType("application/json;charset=UTF-8");
   		response.getWriter().print(result);
   		
   	}
   	/*
    // 1. [C] (첨부파일 없을때)회원가입
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. AJAX 통신받은 data객체의 '속성명' 요청한다. [ request ] 
		String mid =  request.getParameter("mid");			System.out.println("mid : "  + mid);
		String mpwd =  request.getParameter("mpwd");		System.out.println("mpwd : "  + mpwd);
		String memail =  request.getParameter("memail");	System.out.println("memail : "  + memail);
		String mimg =  request.getParameter("mimg");		System.out.println("mimg : "  + mimg);
		
		// 2. (선택) 객체화.
		MemberDto memberDto = new MemberDto(mid, mpwd, memail, mimg);
		// 2. (선택) 유효성검사.
		
		// 3. Dao 에게 전달하고 결과 받는다.
		boolean result = MemberDao.getInstance().signup(memberDto);
		
		// 4. AJAX 통신으로 결과 데이터를 응답을 보낸다. [ response ]
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(result);
	}
	*/
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}


/*
	용량 단위
		bit : 0 or 1 
		byte: 01010101 -> 1byte
		kb : 1024byte -> 1kb
		mb : 1024kb -> 1mb
*/
