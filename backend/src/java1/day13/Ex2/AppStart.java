package java1.day13.Ex2;

import java1.day13.Ex2.View.MainPage;

public class AppStart {
	public static void main(String[] args) {
		
		// - 다른 클래스/객체에 있는 메소드 호출 하는 방법
		// 1. 호출할 메소드가 있는 클래스의 객체를 만들어서 객체를 이용한 메소드 호출
		//Mainpage mainpage = new AppStart();
		// mainpage.mainView();
		
		//2. 호출할 메소드가 정적[static] 메소드 이면 객체 없이 메소드 호출
		//Mainpage.mainView();
		
		//3. 호출할 메소의 클래스가 싱글톤(객체)가 존재하면 싱글톤 호출후 메소드 호출
		MainPage.getInstance().mainView();
			//Mainpage.getInstance() : 클래스 안에 있는 정적맴버 호출후 변환
			// 변환 : 싱글톤을 반환 받는다.
				// MainPage.getInstance().mainPage(); : 싱글톤객체를 이용한 메소드 호출
				// mainpage.mainpage();
	}
	
}
