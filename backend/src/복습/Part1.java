package 복습;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int 콜라재고 = 10 ; int 환타재고 = 3; int 사이다재고 = 2;
		  int 콜라바구니 = 0 ; int 환타바구니 = 0 ; int 사이다바구니 = 0;
		  int 콜라가격 = 300 ; int 환타가격 = 200 ; int 사이다가격 = 100 ;
		  int 주문번호 = 1;
		 while(true) {
			 System.out.println("------------------ 메뉴 -----------------------");
			 System.out.println("1.콜라[300] 2. 환타[200] 3. 사이다[100] 4. 결제");
			 System.out.println(">>>>>> 선택 : "); int ch =sc.nextInt();
			 if(ch==1) {
				 if(콜라재고>0) {
					 콜라재고--; 콜라바구니++;
					 System.out.println("안내 ) 콜라를 담았습니다.");
				 }else {
					 System.out.println("콜라재고 부족 [관리자에게 문의]");
				 }
			 }
			 if(ch==2) {
				 if(환타재고>0) {
					 환타재고--; 환타바구니++;
					 System.out.println("안내 ) 환타를 담았습니다.");
				 }else {
					 System.out.println("환타재고 부족 [관리자에게 문의]");
				 }
			 }
			if(ch==3) {
				 if(사이다재고>0) {
					 사이다재고--; 환타바구니++;
					 System.out.println("안내 ) 사이다를 담았습니다.");
				 }else {
					 System.out.println("사이다 재고가 없습니다. [관리자에게 문의]");
				 }
			 }
			else if(ch==4) {
				// 1. 변수/장바구니네 데이터/개수 출력
				System.out.println("- 현재 장바구니 현황 표시 목록");
				System.out.println("-------------------------------------");
				System.out.printf("%3s %2s %4s\n","제품명","수량","가격");
				System.out.printf("%3s %3d %6d\n","콜라",콜라바구니,(콜라바구니*콜라가격));
				System.out.println("-------------------------------------");
				System.out.printf("%3s %3d %6d\n","사이다",사이다바구니,(사이다바구니*사이다가격));
				System.out.println("-------------------------------------");
				System.out.printf("%3s %3d %6d\n","환타",환타바구니,(환타바구니*환타가격));
				System.out.println("-------------------------------------");
				int 총가격 =콜라바구니*콜라가격+사이다바구니*사이다가격+환타바구니*환타가격;
				System.out.println("총가격:"+총가격);
				if(콜라바구니==0&&사이다바구니==0&&환타바구니==0) {System.out.println("이미 비어있습니다.[장바구니를 확인해주세요]");}
				System.out.println("-------------------------------------");
				System.out.println("1.결제 2.취소: "); int ch2 = sc.nextInt();
				if(ch2==1) {
					System.out.println("안내 금액 투여 : ");int pay=sc.nextInt();
					//2. 만약에 총가격보다 금액이 더크면 성공 아니면 실패
					
					if(pay>=총가격) {
						System.out.println("잔돈 :" +(pay-총가격));
						// 구맹성공 // 바구니만 초기화
						콜라바구니 = 0;
						환타바구니= 0;
						사이다바구니= 0;
						System.out.println("주문 번호: "+주문번호);
						
						주문번호++;
					}
					else {
						// 구매실패 // 장바구니 초기화 // 재고 원상복귀
						System.out.println("구매실패");
						
						콜라재고+=콜라바구니; 콜라바구니=0;
						사이다재고+=사이다바구니; 사이다바구니=0;
						환타재고+=환타바구니; 환타재고=0;
						System.err.println("안내) 투여 금액이 부족합니다. [초기메뉴로 돌아갑니다.]");
						
					}
				}
				else if(ch2==2) { // 취소 선택 ==2
					// 구매 취소 했기때문에 원상복귀
					콜라재고+=콜라바구니; 콜라바구니=0;
					사이다재고+=사이다바구니; 사이다바구니=0;
					환타재고+=환타바구니; 환타재고=0;
					System.err.println("안내) 장바구니를 초기화했습니다. [초기메뉴로 돌아갑니다.]");
				}
			}
			
			
			/* ----------- */
			
			
		} // while end 
	} // main end 
	
} // class end 