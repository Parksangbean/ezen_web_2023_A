// 1. 쿠키에 있는 배열 호출[페이지[JS] 열리면]
let boardList = JSON.parse(localStorage.getItem('boardList'))
	// 쿠키/세션에 저장된 객체/배열 호출시 JSON.parse()
	// 쿠키/세션에 저장된 객체/배열 저장시 JSON.stringify()
	
if(boardList == null) boardList = []

boardPrint()
//1. 게시물 출력함수
function boardPrint(){
	let tcontent = document.querySelector('.tcontent')

	let html = ''
		// html 구성 : 쿠키에서 꺼내온 배열을 반복문해서 html 누적 더하기
		for(let i=0; i<boardList.length; i++){
			let board = boardList[i]
			html +=
			`<tr>
	             <td>${board.no}</td><td onclick="onViewLoad(${board.no})">${board.title}</td><td>${board.writer}</td>
	             <td>${board.date}</td><td>${board.view}</td><td>${board.like}</td>
	         </tr>`
		}
	
	tcontent.innerHTML = html
} // f end

//2. 상세 페이지 이동 [실행조건 : 클릭한 게시물 제목 ]
function onViewLoad(no){
	console.log('현재 클릭된 제목(게시물)의 번호'+no);
	// 클릭된 결과를 다른페이지로 옮기는 방법
		// js는 페이지가 전환/새로고침 초기화 ->// 세션/쿠키
	sessionStorage.setItem('no', no) // 클릭된 게시물번호
	increaseView(no);
	//2. 페이지이동
	location.href="view.jsp"
}
// 3. 조회수 증가함수 [실행조건 : 제목 클릭후 페이지 전환 전에]
function increaseView(no){
	// 1. 클릭된 게시물 번호의 게시물 찾기
	for(let i=0; i<boardList.length; i++){
		if(boardList[i].no==no){ // 찾았다
			boardList[i].view++; 
			//만약에 세션/쿠기를 사용중이라면 업데이트
			localStorage.setItem('boardList', JSON.stringify(boardList));
			break;
		}
	}
}

