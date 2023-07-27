package 과제.과제9;

import java.util.Arrays;
import java.util.Scanner;

// 목적 : 실행
public class MemberSys {
	public static void main(String[] args) {
		
		// 0 . 여러개 Member객체를 저장 예정인 배열 100개=100명회원 를 저장하는 배열 선언
		Member[] memberList = new Member[100];
		Scanner scanner =new Scanner(System.in);
		//배열 선언 : 타입명[] 배열명 = new 타입명[길이];
				// 타입 : 기본타입,참조(String ,직접만든클래스=Member 등)타입
		
		while(true) { //while s
			// 1. 무한 출력
			
			System.out.println("--------회원 시스템---------------");
			System.out.println("1. 회원가입 2. 로그인       선택>");	
			int ch=scanner.nextInt();		// 2. 무한 입력
			if(ch==1) {
				System.out.println("--------------회원가입 --------------");
				// 1. 각 입력받아 저장
				System.out.println("아이디: ");		String inputId= scanner.next();
				System.out.println("비밀번호: ");	String inputPw= scanner.next();
				System.out.println("이름: ");			String inputName= scanner.next();
				System.out.println("전화번호: ");	String inputNumber= scanner.next();
				System.out.println("나이: ");			int inputAge= scanner.nextInt();
				// 2. 5가지를 하나서 묶음 = 문자열vs객체
				// * 객체선언 : 클래스명 객체변수명 = new 생성자명();
				// 1안
				Member member =new Member(inputId, inputPw, inputName, inputNumber, inputAge);
				
				for(int i=0; i<memberList.length; i++) {
					// 만약에 i번째 인덱스에 null 이면 해당 i번째 객체 타입
					if(memberList[i]==null) {memberList[i]=member; break;}
				} // for e
			}
			else if(ch==2) {
				System.out.println("--------------로그인 --------------");
				System.out.println("아이디: ");		String inputId= scanner.next();
				System.out.println("비밀번호: ");	String inputPw= scanner.next();
				
				// 2. 입력받은 데이터 배열내 찾기
				int login = -1; // 로그인 여부를 저장하는 변수 -1: 못찾았다 0이상이면 찾고 싶은 인덱스버ㅏㄴ호 저장 = 로그인ㅅ ㅓㅇ공 기록
				for(int i=0; i<memberList.length; i++) {
					if(memberList[i] !=null&&memberList[i].password.equals(inputPw)) {
						// 로그인 성공
						login = i;	//로그인 성공후 변수에 성공한 인덱스 저장 = 추후에 로그인 상태 활용
						System.out.println(Arrays.toString(memberList));
						break;					
					}
					
				}// for e
				//로그인 실패:
				if(login>=0) {System.out.println("로그인성공");}	//추후에 로그인시 새로운 메뉴 메소드 호출
				else {
					System.out.println("안내)로그인실패");
				}
			}
			
			
		} //while e
	} // main e
} // class e


/*
			주제 : 회원제 시스템
			0. 저장
				아이디,비밀번호 , 이름 , 전화번호,나이
				* 5가지(서로가진타입) 필드 /변수 / 데이터 를 하나의 묶음방법
				--> 문자열 이용 : "아이디, 비밀번호, 이름 , 전화번호,나이"	: , 수미표 이용한 필드 구분
				--> 클래스(필드) 이용	: 
					1. 클래스 설계 = 새로운 클래스.java 파일 생성
					2. 클래스 맴버 구성 : 필드 ,생성자 ,메소드
				* 하나로 묶인 (기준동일 = 타입동일) 여ㅑ러개 저장
				---> 문자열 배열 : String[] 문자열배열 = new String[100];
				---> 클래스 배열 : Member[] 객체배열 = new Member[100];
				
			1. 초기 메뉴
				1. 회원가입	2. 로그인
				
			2. 조건 기능
				1. 회원가입 
					1.아이디,비밀번호 , 이름 , 전화번호,나이 각 입력받아 저장
					2. Member 객체화
					3.객체를 배열 저장
				2. 로그인
					1. 아이디 , 비밀번호 입력받아 저장
					2. 배열내 입력받은 값과 동일한 값 찾기
						-만약에 동일한 값 있으면 로그인 성공
						-아니면 실패
					
				
			
			
			
			
*/