package java1.day13.Ex2.Controller;

import java1.day13.Ex2.Model.BoardDao;
import java1.day13.Ex2.Model.BoardDto;
import java1.day13.Ex2.View.MainPage;

public class BoardController {
	
	// 싱글톤(공유)O : 게시물마다 가 아닌 모든 게시물이 하나의 객체을 통해 동일한 기능 수행
	// 1. 현재클래스안에 현재클래스로 싱글톤 객체 선언[private static ]
private static BoardController boardController = new BoardController();
//2.외부로부터 간접적으로 싱글톤이 호출되도록 하는 함수
public static BoardController getInstance() {return boardController;}
//3. 외부로부터 객체 생성 차단
private BoardController() {}
	// 글등록 처리 기능함수
public boolean writeLogic(String content, String wirter) {
	
	BoardDto boardDto = new BoardDto(content, wirter);
	
	
		
		BoardDao.getInstance().boardDtoList.add(boardDto); 
			
		// 성공[true] 또는 실패[false]
		return true;
	
}
	// 글출력 처리 기능함수
public BoardDto printLogic(int index) {
	// 1. 리스트 안에 있는 객체 호출 . get(인덱스)
	
	BoardDto boardDto =BoardDao.getInstance().boardDtoList.get(index);
	
	
	
	// 2. 호출한 dto 를 리턴하기
		return boardDto;
}	 
	// 글삭제 처리 기능함수
public boolean deleteLogic(int index) {
	// 1. 리스트 안에 있는 객체 호출 .get(인덱스) : 해당 인덱스 객체 호출
	
	return true;
	
}	
	// 글수정 처리 기능함수
public void updateLogic() {
	
	
	}
}
