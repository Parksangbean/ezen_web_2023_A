package Controller.product;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.ProductDao;
import model.dto.MemberDto;
import model.dto.ProductDto;


@WebServlet("/ProductinfoController")
public class ProductinfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductinfoController() {
        super();
    }

    // 1. 제품등록
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// * commons.jar 이용한 업로드 구현
	// commons-io.jar , commons-fileupload.jar 빌드 필요!!!
	
	// 1.저장경로 [ 첨부파일이 저장된 폴더위치]
	String uploadPath = request.getServletContext().getRealPath("/Product/img");
	
	//2 . 파일아이템저장소 객체 : 업로드 할 옵션 [import org.apache.commons.fileupload.disk.DiskFileItemFactor;]
	DiskFileItemFactory itemFactory = new DiskFileItemFactory(); 
	itemFactory.setRepository(new File(uploadPath)); // 2.저장하기
	itemFactory.setSizeThreshold(1024 * 1024 *1024); // 3.용량
	itemFactory.setDefaultCharset("UTF-8"); // 4.한글인코딩
	System.out.println(request.getServletContext().getRealPath("/Product/img"));
	// 3. 파일 업로드 객체
	ServletFileUpload fileUpload = new ServletFileUpload(itemFactory);
	
	// 4. 파일 업로드 요청 [요청방식 : request]
	try {
		
		Map< Integer , String > imgList = new HashMap<>();
		// form전송시 input/select/textarea 등 태그의 모든 데이터 한번에 요청해서 결과를 List 반환 
					List< FileItem > fileList = fileUpload.parseRequest( request );
						// FileItem : 각 요청한 데이터 
					// 5. 업로드 실행 
					int i = 0;
					for( FileItem item : fileList ) { // 요청한 input 들의 데이터를 반복문으로 하나씩 꺼내기.
						// 1. 일반 필드 [ isFormField() : 만약에 일반폼필드이면 true / 아니고 첨부파일필드이면 false  ] 
						if( item.isFormField() ) { System.out.println( item.getString() ); } // .getString() : 해당 요청 input의 value 호출 
						else { // 2. file 필드
							// 만약에 파일 필드이면 업로드 진행
								System.out.println( "업로드할 파일명 : " + item.getName() ); // .getName()
							// 6.업로드 경로 + 파일명 [ 조합 ] 
							
								// 파일명에 중복이 있을때 식별 생성 
								UUID uuid = UUID.randomUUID();
									// UUID 클래스 : 고유성을 보장하는 ID를 만들기 위한 식별자 표준 규약  [ - 하이픈 4개 구역 ]
								String filename = uuid+"-"+ item.getName().replaceAll("-", "_");
														// 만약에 파일명에 - 하이픈 존재하면 _언더바로 변경 
														// 왜?? 파일명과 UUID 간의 식별하기 위해 구분 -하이픈 사용하기 때문에.
														// 추후에 파일명만 추출시 사용자가 파일명에 - 이 있으면 파일명 추출시 쪼개기가 힘듬.
								// UUID[ - - -  ] - 파일명 : 추후에 파일명만 추출시 -하이픈 기준으로 쪼개기 
								
							File fileUploadPath = new File( uploadPath +"/"+ filename ) ;
							
								System.out.println( "업로드경로와 파일명이 조합된 경로 : " + fileUploadPath );
							item.write( fileUploadPath ); // .write("저장할경로[파일명포함]") 파일 업로드할 경로를 file타입으로 제공 
							// 7. 업로드 된 파일명을 Map에 저장 [ -DB에 저장할려고  ]
							i++;	// i는 임의의 값 
							imgList.put( i , filename  ); // 저장시 에는 이미지번호가 필요 없음
							// MAP 컬렉션은 키 와 값으로 구성된 엔트리 [ * 키는 중복 불가능 ]
			}
			// 2. file 필드
		}
		// FileItem 으로 가져온 데이터들을 각 필드에 맞춰서 제품Dto에 저장하기
					
		// 회원번호
		Object object = request.getSession().getAttribute("loginDto");
		MemberDto memberDto = (MemberDto)object;
		int mno = memberDto.getMno();
					
		
		ProductDto productDto = new ProductDto(
				Integer.parseInt( fileList.get(0).getString()),
				fileList.get(1).getString(),
				fileList.get(2).getString(),
				Integer.parseInt( fileList.get(3).getString()),
				fileList.get(4).getString(),
				fileList.get(5).getString(),
				mno , // 현재 로그인된[제품등록한] 회원의 번호 호출			
				imgList); // 여러개 이미지를 위에
		System.out.println("dto: "+productDto);
		
		//  Dto를 Dao 처리
		boolean result = ProductDao.getInstance().register(productDto);
		
		response.setContentType("applicateion/json; charset=UTF-8");
		response.getWriter().print(result);
		
		
	}catch (Exception e) {System.out.println(e);}
}
	// 2. 제품조회
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		
		String json = ""; // DAO 로 부터 응답된 결과를 JSON 형식의 문잠열 타입을 저장하는 변수
		ObjectMapper mapper = new ObjectMapper();
		
		if(type.equals("findByTop")) {
			int count = Integer.parseInt(request.getParameter("count") );
			 List<ProductDto> result = ProductDao.getInstance().findByTop(count);
			json = mapper.writeValueAsString(result);
		}
		else if(type.equals("findByLatLng")) {
			String east = request.getParameter("east");	 	String west = request.getParameter("west");
			String south = request.getParameter("south"); 	String north = request.getParameter("north");
			
			 List<ProductDto> result = ProductDao.getInstance().findByLatLng(east,west,south,north);
			 json = mapper.writeValueAsString(result);
		}
		else if(type.equals("findByPno")) {
			int pno = Integer.parseInt(request.getParameter("pno") );
			ProductDto result =ProductDao.getInstance().findByPno(pno);
			json = mapper.writeValueAsString(result);
		}
		else if(type.equals("findByAll")) {
			 List<ProductDto> result = ProductDao.getInstance().findByAll();
			 json = mapper.writeValueAsString(result);
		}
		
			response.setContentType("applicateion/json; charset=UTF-8");
			response.getWriter().print(json);
	}

	// 3. 제품 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	// 4. 제품 삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}































/*---------------------------------------------------------- 업로드 ------------------------------------------------------
 MultipartRequest multi = new MultipartRequest(
				request,
				request.getServletContext().getRealPath("/Product/img"),
				1024*1024*1204,
				"UTF-8",
				new DefaultFileRenamePolicy());
		// -------------------------------------------------------------------------- //
		System.out.println(request.getServletContext().getRealPath("/Product/img"));
		// -------------------------------------------------------------------------- //
		String pcno = multi.getParameter("pcno");
		String pname = multi.getParameter("pname");
		String pcontent = multi.getParameter("pcontent");
		String pprice = multi.getParameter("pprice");
		
		Enumeration pimg = multi.getFileNames();
		System.out.println(pimg);
		System.out.println(pimg.nextElement().toString());
		// .getF
*/
