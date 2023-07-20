package java1.day06;

import java.util.Arrays;

public class Ex_01배열 {
	public static void main(String[] args) {
		
		// [p.168]
		String[] season= {"spring","summer","fall","winter"};
		// String [ ] : string 클래스 (타입)으로 배열 선언 = string 데이터만 저장 가능 !!
		// {값1,값2,값3,} : 배열에 저장할때 데이터 순서대로 작성
		
		// 2. 호출
		System.out.println(season); // season변수는 배열주소값을 가지고 있는 스택영역
		System.out.println(Arrays.toString(season) );
		//Arrays.toString(배열 변수명)		// 주소를 찾아서 배열의 정보 호출
		
		System.out.println(season[0]);		//인덱스 0번호출
		System.out.println(season[1]);		//인덱스 1번호출
		System.out.println(season[2]);		//인덱스 2번호출
		System.out.println(season[3]);		//인덱스 3번호출
		
		// 3. 변경 (새로운 값 대입 = )
		season[1] ="여름";		//season[1] "summer" ="여름" 
		System.out.println(season[1]);
		
		//4. 삭제 (없음 : 배열은 선언될때 고정!!) 해당 인덱스를 null 로 만든다.
		season[1] = null;
		System.out.println(Arrays.toString(season));
		
		
		//5. 추가 (없음 : 배열은 선언될때 고정!!)	* 인덱스중에 null 있으면 해당위치에 데이터 추가
		if(season[1]==null) season[1]="초여름";
		else System.out.println("공간이 부족합니다.");
		System.out.println(Arrays.toString(season) );
		
		//
		int[] score = { 83, 90, 87 };
		int sum = 0;
		for (int i = 0; i < 3; i++) { // i는 0부터 3미만까지 1씩증가 [0~2] // score 배열은 [0~2]
			sum += score[i];
			// 1회전 : sum + = 83 // // 2회전 : sum +=90 // 3회전 : sum +=87
			System.out.println("총점 : " + sum);
			System.out.printf("평균 : %.2f\n ", sum / 3.0);
		}
		int[] arr1 = new int[3];
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < 3; i++) {System.out.println(arr1[i]);}
			
			// 3. 배열내 값 변경
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			System.out.println(Arrays.toString(arr1));
			
			//2. double형 배열
				//1. new 연산자를 이용한 배열 선언 
			double[] arr2 =new double[3]; // double 3개를 저장할 수있는 배열 선언
				System.out.println(Arrays.toString(arr2));
				//2. 배열내 모든 데이터 호출 // 길이를 모르는 경우 => 배열명.length : 배열의 길이 호출
																			//		배열명.length , 문자열.length()
			for(int i = 0; i<arr2.length; i++) {System.out.println(arr2[i]);}
			
			//3. 배열내 값 변경
			arr2[0] = 0.1;		arr2[1] = 0.2;		arr2[2] = 0.3;
			// arr2.push() [x] : js 에서 사용되는 함수이므로 자바 불가능
			//arr2[3]=0.4; //길이:3 인덱스:0~2		이므로 없는 인덱스 호출 불가능
			
		//3. String 클래스 배열
			String[] arr3=new String[3]; 	// String 객체(문자열) 를 3개를 저장할수 있는 배열 선언 [NULL.NULL.NULL]
			for(int i=0; i<arr3.length; i++) {System.out.println(arr3[i]);}
			// 3. 값변경
			arr3[0] ="1월"; arr3[1] ="2월"; arr3[2] ="3월";
			System.out.println(Arrays.toString(arr3));
			
		// * 값 삭제 ( 불가능: 배열은 선언시 고정 길이 이므로 , 값 대신에 기본값으로 변경 ) 
			arr3[1]=null;		System.out.println(Arrays.toString(arr3));
			// * 삭제된 인덱스 뒤로 한칸 당기기
			for(int i=1; i<arr3.length; i++) {
				// 만약에 마지막 인덱스에 도착했으면 다음인덱스가 없으므로 당기기 할 필요 x
				if(i==arr3.length-1) {arr3[i]=null; break;}
				// 마지막 인덱스가 아니면 한칸씩 당기기
				arr3[i]=arr3[i+1];
			}
			System.out.println(Arrays.toString(arr3) );
		// * 값 추가 (불가능 : 배열은 선언시 고정 길이 이므로 , null 빈공간을 있으면 값 변경 )
			for(int i =0; i<arr3.length; i++) {
				if(arr3[i]==null) {	//  만약에 i번째 인덱스에 값이 비어 있으면
					arr3[i] = "5월"; 	
					
				}
			}
			
			int count = 0; // 모든 경우의수 if { } 에서 공유하기 위해 if { } 밖에서 선언 
			int[] scores = new int[count]; 
			System.out.println(Arrays.toString(scores));
			
 	}
}
/*
	변수 : 하나의 데이터를 저장
	배열 : 여러개의 데이터를 저장
		1. 연속적인 공간에 데이터 저장하고 나열
		2. 각 데이터공간에 인덱스를 부여 [ 인덱스 : 0~]
		3. 특징
			1. 배열은 선언된 타입에 값만 저장할수 있다.
				int[] intArray = {1 ,"dd" } [x]
				* int로 선언된 배열은 int 형 데이터 저장가능
				* int[] intArray = {1 ,3 } [o]
			2. 배열의 길이는 선언될때 고정되므로 늘리거나 줄일 수 없다.
				int[] intAreeay = new int[3];
				int,Array[0],intArray[1],intArray[2]
				* 추가하거나 줄일수 없다..[고정길이] vs 가변길이
			
				
		4. 선언
		 	1.타입[] 변수명:		int[] intAraay;
		 	2. 선언과 동시에 값을 대입 해서 생성
		 		타입[] 변수명:{값1,값2,값3,}
			3. new 연산자로 배열 생성 (기본값) 으로 생성
				타입[] 변수명 = new타입[길이]; 	* 길이 : 배열에 저장할 데이터 개수 




*/