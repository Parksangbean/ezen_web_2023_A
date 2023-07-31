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
	
	
	
	// 2. 호출한 Dto 를 리턴하기
		return boardDto;
}	
// 글수정 처리 기능함수
public boolean updateLogic(int index , String content , String writer) {
	// 1. 입력받은 인덱스의 개시물을 호출해서 새로운 입력받은 값으로 대입
	BoardDao.getInstance().boardDtoList.get(index).setContent(content);
		// BoardDao.getInstance().boardDtoList.get(index) = content 	// * DTO 필드의 직접접근X -> set , get 간접접근o
	BoardDao.getInstance().boardDtoList.get(index).setWriter(writer);
	return true;

}


	// 글삭제 처리 기능함수
public boolean deleteLogic(int index) {
	// 1. 리스트 안에 있는 객체 호출 .get(인덱스) : 해당 인덱스 객체 호출
	BoardDao.getInstance().boardDtoList.remove(index);
	return true;
	}
}

