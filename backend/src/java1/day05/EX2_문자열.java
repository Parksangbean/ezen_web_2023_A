package java1.day05;

public class EX2_문자열 {
	public static void main(String[] args) {
		// [p.153]
		String name = "홍길동";	//10번지
		String name2 = "홍길동";	//10번지
		int a=1;
		int b=1;
			//???? : 두 스택영역의 지역변수가 참조하는 주소는 같을까?
		System.out.println(name==name2);
		System.out.println(a==b);
		
		// [p.155]
		String name3 = new String("홍길동");		//11번지
		String name4 = new String("홍길동");		//12번지
			// " ": 문자열 리터럴 아닌 new 연산자를 이용한 객체 생성시에는 객체 생성시에는 같을까??
		System.out.println(name3==name4);		// 다르다 false
		if(name==name2) {// " " 문자열 리터럴생성된 문자열객체 비교
			System.out.println("두 문자열은 같습니다.");
		}else {
			System.out.println("두 문자열은 다릅니다.");
		}
		if(name3==name4) {
			System.out.println("두 문자열은 같습니다.");
		}else {
			System.out.println("두 문자열은 다릅니다.");
		}
		// [p.157] 문자열 내에서 특정 문자 추출/꺼내기/
		String ssn ="990105-4229613";		// 문자열 객체를 선언 // 글자수13 //인덱스 0~12 (길이-1)
		char sex = ssn.charAt(7);				// 9[0]8[1
		if(sex=='1'|| sex=='3') {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		//[p.158] .length() 문자열의 길이 구하기
		System.out.println("주민번호의 길이: "+ssn.length());
		//[p.159] . replace() 문자열내 특정 문자열 교체/치환/대체
		String oldstr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		// 문자열내 "자바" --> "JAVA " 로 교체후 교체된 문자열 반환
		String newstt =oldstr.replace("자바", "JAVA");		// 치환된 결과를 새로운 변수에 저장
		System.out.println(oldstr);
		System.out.println(newstt);
		
		// [p.160]  .substring() 	:문자열 자르기 
		String ssn2="880815-132456";
		//01234567
		String ssn3=ssn2.substring(7);	// 인덱스7 부터 마지막 까지 호출
		
		System.out.println(ssn3);
		
		String firftNum2=ssn2.substring(0, 6);		//[0~5까지]
		System.out.println(firftNum2);
		// [p.164] .split()			:문자열 분리
			//ss2.split("-")	: -기준으로 분리
			// "880815-1234567"	--> 분리		{880815 , 1234567}
		System.out.println(ssn2.split("-")[1] );
		
		//[p.165]	.inextOf()
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("자바"); // "자바 프로그래밍" 문자열내 "프로그래밍" 문자열 찾기
		if(location==-1) { // -1 이면 못찾았다
			System.out.println("프로그래밍책이 아니군요.");
		}else { // -1아니면 찾았다
			System.out.println("프로그래밍 책이군요.");
		}
		String ref="자바";
		String ref2=null;
		System.out.println(ref==ref2);
		
		
		// 찾은 문자열의 위치[인덱스] 변환/ 없으면 -1
	}	
}
/*
	자바 문자열 사용하는 방법
		1. String 변수명 = "문자열"
		2. String 변수명 = newSring("문자열");
	자바 문자열에서 제공해주는 라이브러리 도구 = 미리 만들어진 함수들
		 문자열객체.메소드명()
		1. 문자열객체.equals(문자열객체2) 		: 두 문자열객채네 문자열이 동일하면 true 아니면 false 아니면 false 반환 [주소x] 
		2.문자열 객체.charAt(인덱스)				: 문자열내 해당 인덱스의 문자 1개 추출 [첫번째글자=0]
		3.문자열객체.length()						: 문자열에서 문자의 개수 변환
			vs 배열면.length
		4. 문자열객체 .replace("기존문자열","새로운문자열") :문자열내 기존문자열이 존재하면 새로운문자열로 치환해서 변환
		5. 문자열객체.substring(인덱스 1) 				: 해당 인덱스 부터 끝까지 문자열 추출
			문자열객체.substring(인덱스 , 인덱스)		: 시작 인덱스 부터 마지막 인덱스전까지 문자열 추출
			문자열객체.split("분리기준문자")				: 문자열내 분리기준문자로 분리해서 배열로 변환
		6. 문자열객체..inextOf("찾고싶은문자열")		: 문자열내 찾을문자열이 존재하면 찾은 인덱스 변환 / 없으면 -1
*/