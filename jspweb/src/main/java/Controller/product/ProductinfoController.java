package Controller.product;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
	// form전송시 모든 데이터 한번에 요청해서 List 반환
		List<FileItem>fileList = fileUpload.parseRequest(request);
		
		// 5.업로드실행
		int i = 0;
		for(FileItem item : fileList) {
			// 1. 일발 필드 [ isFormField() : 만약에 일반폼필드이면 true / 아니고 첨부파일필드면 false ]
			if(item.isFormField() ) {
				System.out.println(item.getString()); // ..getString() : 해당 요청 input의 value 호
			}else { // 2. file 필드
				// 만약에 파일 필드이면 경로를 file타입으로 제공
				System.out.println("업로드할 파일명: "+item.getName());
				// 6. 업로드 경로 + 파일명 [조합]
				File fileUploadPath = new File(uploadPath+"/"+item.getFieldName());
				item.write(new File(uploadPath+"/"+item.getName()));
					System.out.println("업로드경로와 파일명이 조홥된 경로 : "+fileUploadPath);
					
				item.write(fileUploadPath); // .write("저장할경로
				
				// 7. 업로드 된 파일명을 Map에 저장 [ -DB에 저장할라고 ]
				i++;
				imgList.put(i, item.getName() );
			}
			// 2. file 필드
		}
		// FileItem 으로 가져온 데이터들을 각 필드에 맞춰서 제품Dto에 저장하기
		ProductDto productDto = new ProductDto(
				Integer.parseInt( fileList.get(0).getString()),
				fileList.get(1).getString(),
				fileList.get(2).getString(),
				Integer.parseInt( fileList.get(3).getString()),
				null,null,
				0,
				imgList);
		System.out.println("dto: "+productDto);
		
		
		
		
	}catch (Exception e) {System.out.println(e);}
}
	// 2. 제품조회
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
