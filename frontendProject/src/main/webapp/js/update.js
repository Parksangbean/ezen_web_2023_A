// 1. 썸머노트 실행할때 사용되는 코드
$(document).ready(function() {
  // $('#summernote').summernote( {설정객체} );
  $('#summernote').summernote( { 
	lang : 'ko-KR', // 한글 적용 [ 한글.JS CDN 필요]  
	height : 500 , 
	placeholder : '여기에 내용작성'
  });
});

/*--------------------------------*/
// 2. 수정할게시물= 클릭된 게시물=현재 보고있는 게시물 [세션]
let no = sessionStorage.getItem('no');
let boardList = JSON.parse(localStorage.getItem('boardList') ); console.log('boardList');
// 1. 수정 함수 [ 실행조건 : 등록 버튼 클릭했을때]
onView()
function onView(){
	//1. 어디에
	let title= document.querySelector('.title')
	let content = document.querySelector('#summernote')
	
	
	//2. 무엇을
	for(let i = 0; i<boardList.length; i++){
		let b= boardList[i]
		if(b.no ==no){
			//3. 출력/대입
			title.value = b.title
			content.value = b.content
		}
	}
}
function onUpdate(){
	// 누구를 = 현재 보고 있는 게시물
	for( let i = 0; i<boardList.length; i++){
		let b =boardList[i];
		if(b.no ==no){ // 현재 보고 있는 게시물 찾기
			let title=document.querySelector('.title').value
			let content = document.querySelector('#summernote').value
			b.title=title
			b.content = content
			// * 쿠키/세션[js x] 사용중이라면 ... 
			localStorage.setItem('boardList' , JSON.stringify(boardList) );
			// * 알림ㅡ 페이지 전환
			alert=('수정 했습니다.')
			location.href="view.jsp"
			break;
		}
	}
}












