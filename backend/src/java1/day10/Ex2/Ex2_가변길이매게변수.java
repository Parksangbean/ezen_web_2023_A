package java1.day10.Ex2;

public class Ex2_가변길이매게변수 {
	public static void main(String[] args) {
		// 1. 다른 클래스에 있는 메소드 호출하기 위한 객체 생성
		
		Computer myCom=new Computer();	
		
		int result = myCom.sum("유재석",1,2,3);
		System.out.println("result: "+result);
		
		int result1 = myCom.sum("ㅋㅋ",1,2,3,4,5);
		System.out.println("result1: "+result1);
		
		int[]value = {1,2,3,4,5,6};
		System.out.println(myCom.sum("ㄴㄴ",value));
		
		int result2 = myCom.sum("유재석",1,2,3);
		System.out.println("result: "+result);
		
		int[]value2 = {1,2,3,4,5,6};
		System.out.println(myCom.sum("ㄴㄴ",value));
	}
}
