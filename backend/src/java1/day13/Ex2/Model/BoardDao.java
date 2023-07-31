package java1.day13.Ex2.Model;

import java.util.ArrayList;

import java1.day13.Ex2.Controller.BoardController;

public class BoardDao {
	// 싱글톤(공유)O : 게시물마다 가 아닌 모든 게시물이 하나의 객체을 통해 동일한 기능 수행 
	// 1. 현재클래스안에 현재클래스로 싱글톤 객체 선언[private static ]
private static BoardDao boardDao = new BoardDao();
//2.외부로부터 간접적으로 싱글톤이 호출되도록 하는 함수
	public static BoardDao getInstance() {return boardDao;}
	// 3. 외부로부터 객체 생성 차단
	private BoardDao() {}
	// 게시물 여러개 저장하는곳
		//1. 배열
		public BoardDto[] boardDtoArray = new BoardDto[100];
		// 2. 리스트 : 배열을 쉽게 사용할수 있도록 다양한 함수 제공
		public ArrayList<BoardDto> boardDtoList = new ArrayList<>();
			// ArrayList : 배열처럼 사용가능한 클래스 객체 선언
				//<클래스> : 리스트안에 여러개 객체를 저장할 객체의 타입
					// boardList : 리스트객체변수명 
}
