package 과제.과제5;

import java.util.Scanner;

public class 과제5_키오스크 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String 재고관리 = "";
		/* 재고관리 변수 샘플  */
		재고관리 = "10,10,10-0,0,0-300,200,500";
	
		
		/* ----------- */
		String 재고 =재고관리.split("-")[0];	// 배열로 나누고 0은콜라 1은 환타 2는사이다
				String 콜라 = 재고.split(",")[0];
				int 콜라재고= Integer.parseInt(콜라);
				String 환타 = 재고.split(",")[1];
				int 환타재고 = Integer.parseInt(환타);
				String 사이다 = 재고.split(",")[2];
				int 사이다재고 = Integer.parseInt(사이다);
				
		String 장바구니 = 재고관리.split("-")[1];
			String 콜라바구니=장바구니.split(",")[0];
			int 콜라장바구니=Integer.parseInt(콜라바구니); 
			String 사이다바구니=장바구니.split(",")[1];
			int 사이다장바구니=Integer.parseInt(사이다바구니); 
			String 환타바구니=장바구니.split(",")[2];
			int 환타장바구니=Integer.parseInt(환타바구니); 
				
		String 가격 =재고관리.split("-")[2];
			String 콜라가격=가격.split(",")[0];
			int 콜라1=Integer.parseInt(콜라가격);
			String 환타가격 = 가격.split(",")[1];
			int 환타1=Integer.parseInt(환타가격);
			String 사이다가격 = 가격.split(",")[2];
			int 사이다1=Integer.parseInt(사이다가격);
			
			int 주문번호=0;
			int 총수량=0;
		while(true) {
			System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				//step2 : 기능 구현
				// 1. 콜라를 선택
				// 1. 콜라 재고가 있으면 바구니에 담아 없으면 재고부족!!
				if(콜라재고>0) {
					콜라장바구니++; //콜라바구니 변수에콜라 1개추가 /중가
					콜라재고--;	// 콜라재고 변수에 콜라 1개 감소 
					총수량++;
					System.out.println("안내) 콜라를 담았습니다.");
					System.out.println("- 현재 장바구니 현황 표시 목록");
					System.out.println("-------------------------------------");
					System.out.printf("%3s %2s %4s\n","제품명","수량","가격");
					System.out.printf("%3s %3d %6d\n","콜라",콜라장바구니,(콜라장바구니*콜라1));
					System.out.println("-------------------------------------");
					System.out.printf("%3s %3d %6d\n","사이다",사이다장바구니,(사이다장바구니*사이다1));
					System.out.println("-------------------------------------");
					System.out.printf("%3s %3d %6d\n","환타",환타장바구니,(환타장바구니*환타1));
					System.out.println("-------------------------------------");
					
					System.out.printf("총합계: %3d",(환타장바구니*환타1)+(사이다장바구니*사이다1)+(콜라장바구니*콜라1));
				}
				else {
					System.out.println("안내) 콜라 재고가 없습니다.[관레자에게 문의]");
				}
			}
			else if(ch==2) {
				if(환타재고>0) {
					환타장바구니++;
					환타재고--;
					총수량++;
					System.out.println("안내) 환타를 담았습니다.");
					System.out.println("- 현재 장바구니 현황 표시 목록");
					System.out.println("-------------------------------------");
					System.out.printf("%3s %2s %4s\n","제품명","수량","가격");
					System.out.printf("%3s %3d %6d\n","콜라",콜라장바구니,(콜라장바구니*콜라1));
					System.out.println("-------------------------------------");
					System.out.printf("%3s %3d %6d\n","사이다",사이다장바구니,(사이다장바구니*사이다1));
					System.out.println("-------------------------------------");
					System.out.printf("%3s %3d %6d\n","환타",환타장바구니,(환타장바구니*환타1));
					System.out.println("-------------------------------------");
					System.out.println("총수량: "+총수량);
					System.out.printf("총합계: %3d",(환타장바구니*환타1)+(사이다장바구니*사이다1)+(콜라장바구니*콜라1));
				}else {
					System.out.println("안내) 환타 재고가 없습니다.[관레자에게 문의]");
				}
			}
			else if(ch==3) {
				if(사이다재고>0) {
					사이다장바구니++;
					사이다재고--;
					총수량++;
					System.out.println("안내) 사이다를 담았습니다.");
					System.out.println("- 현재 장바구니 현황 표시 목록");
					System.out.println("-------------------------------------");
					System.out.printf("%3s %2s %4s\n","제품명","수량","가격");
					System.out.printf("%3s %3d %6d\n","콜라",콜라장바구니,(콜라장바구니*콜라1));
					System.out.println("-------------------------------------");
					System.out.printf("%3s %3d %6d\n","사이다",사이다장바구니,(사이다장바구니*사이다1));
					System.out.println("-------------------------------------");
					System.out.printf("%3s %3d %6d\n","환타",환타장바구니,(환타장바구니*환타1));
					System.out.println("-------------------------------------");
					System.out.println("총수량: "+총수량);
					System.out.printf("총합계: %3d",(환타장바구니*환타1)+(사이다장바구니*사이다1)+(콜라장바구니*콜라1));
				}else {
					System.out.println("안내) 사이다 재고가 없습니다.[관레자에게 문의]");
				}
			}
			else if(ch==4) {
				// 1. 변수/장바구니네 데이터/개수 출력
				System.out.println("- 현재 장바구니 현황 표시 목록");
				System.out.println("-------------------------------------");
				System.out.printf("%3s %2s %4s\n","제품명","수량","가격");
				System.out.printf("%3s %3d %6d\n","콜라",콜라장바구니,(콜라장바구니*콜라1));
				System.out.println("-------------------------------------");
				System.out.printf("%3s %3d %6d\n","사이다",사이다장바구니,(사이다장바구니*사이다1));
				System.out.println("-------------------------------------");
				System.out.printf("%3s %3d %6d\n","환타",환타장바구니,(환타장바구니*환타1));
				System.out.println("-------------------------------------");
				if(콜라장바구니==0&&사이다장바구니==0&&환타장바구니==0) {System.out.println("이미 비어있습니다.[장바구니를 확인해주세요]");}
				int 총가격 =콜라장바구니*콜라1+사이다장바구니*사이다1+환타장바구니*환타1;
				System.out.println("총수량: "+총수량);
				System.out.println("총가격:"+총가격);
				System.out.println("-------------------------------------");
				System.out.println("1.결제 2.취소: "); int ch2 = scanner.nextInt();
				if(ch2==1) {
					System.out.println("안내 금액 투여 : ");int pay=scanner.nextInt();
					//2. 만약에 총가격보다 금액이 더크면 성공 아니면 실패
					주문번호++;
					if(pay>=총가격) {
						System.out.println("잔돈 :" +(pay-총가격));
						// 구맹성공 // 바구니만 초기화
						콜라장바구니 = 0;
						환타장바구니= 0;
						사이다장바구니= 0;
						System.out.println("주문 번호: "+주문번호); 
						;
					}
					else {
						// 구매실패 // 장바구니 초기화 // 재고 원상복귀
						System.out.println("구매실패");
						콜라장바구니 = 0;
						환타장바구니= 0;
						사이다장바구니= 0;
						콜라재고+=콜라장바구니; 콜라장바구니=0;
						사이다재고+=사이다장바구니; 사이다장바구니=0;
						환타재고+=환타장바구니; 환타재고=0;
						System.err.println("안내) 투여 금액이 부족합니다. [초기메뉴로 돌아갑니다.]");
						
					}
				}
				else if(ch2==2) { // 취소 선택 ==2
					// 구매 취소 했기때문에 원상복귀
					콜라재고+=콜라장바구니; 콜라장바구니=0;
					사이다재고+=사이다장바구니; 사이다장바구니=0;
					환타재고+=환타장바구니; 환타재고=0;
					System.err.println("안내) 장바구니를 초기화했습니다. [초기메뉴로 돌아갑니다.]");
				}
			}
			/* ----------- */
			
		} // while end 
	} // main end 
	
} // class end 

/*

	 주제 : 키오스크(변수버전)
	 	- 실행예시 사진은 없습니다.
		조건 
		1. 제품 가격/재고/바구니 상태를 하나의 문자열 변수에서 관리 
			// 샘플 : 
					이름 : 콜라 , 환타 , 사이다
					가격 : 300 , 200 , 100
					바구니 : 0 , 0 , 0
			
		2. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ] 
			1. 콜라 2.사이다 3.환타 4.결제
			[ 1~3 선택시 ]
				- 재고가 있을경우 장바구니 담기 / 없으면 '재고부족' 출력
				 
			[ 4 선택시 ] 
				- 현재 장바구니 현황 표시 목록 
				----------------------------------
				제품명	수량	가격
				사이다	1	400
				환타		2	1000
				총가격 : 1400
				- 결제메뉴 표시
					1. 결제 2.취소 
					[결제]
						- 금액 입력받아 총가격에 뺀 잔액 출력 -> 결제 성공시 장바구니 초기화 
						- 만약에 금액이 부족하면 결제 취소 -> 장바구니 초기화 / 재고 다시 되돌리기
					[취소]
						- [ 장바구니 초기화 / 재고 다시 되돌리기 ]
 
 */







