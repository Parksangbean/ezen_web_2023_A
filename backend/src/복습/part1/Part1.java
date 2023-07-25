package 복습.part1;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		
	Scanner scanner= new Scanner(System.in);
		
	int 콜라재고 =10; int 환타재고=3; int 사이다재고=2;
	int 콜라바구니=0; int 환타바구니=0; int 사이다바구니=0;
	int 콜라가격 =300; int 환타가격=200; int 사이다가격=100;
	
	int 주문번호=0;
		while(true) {
			System.out.println("1.콜라[300] 2. 환타[200] 2. 사이다[100] 4.결제");	
			System.out.println(">>>>>선택 : ");	int ch=scanner.nextInt();
			if(ch==1) {
				if(콜라재고>0) {
					콜라재고--; 콜라바구니++;
					System.out.println("콜라가 담겼습니다.");
				}else {
					System.out.println("재고부족");
				}
			}
			else if(ch==2) {
				if(환타재고>0) {
					환타재고--; 환타바구니++;
					System.out.println("환타가 담겼습니다.");
				}else {
					System.out.println("재고부족");
				}
			}
			else if(ch==3) {
				if(사이다재고>0) {
					사이다재고--; 사이다바구니++;
					System.out.println("사이다가  담겼습니다.");
				}else {
					System.out.println("재고부족");
				}
			}
			else if(ch==4) {
				System.out.println("- 현재 장바구니 현황 표시 목록");
				System.out.println("-------------------------------------");
				System.out.printf("%3s %2s %4s\n","제품명","수량","가격");
				System.out.printf("%3s %3d %6d\n","콜라",콜라바구니,(콜라바구니*콜라가격));
				System.out.println("-------------------------------------");
				System.out.printf("%3s %3d %6d\n","사이다",사이다바구니,(사이다바구니*사이다가격));
				System.out.println("-------------------------------------");
				System.out.printf("%3s %3d %6d\n","환타",환타바구니,(환타바구니*환타가격));
				System.out.println("-------------------------------------");
				if(콜라바구니==0&&사이다바구니==0&&환타바구니==0) {System.out.println("이미 비어있습니다.[장바구니를 확인해주세요]");}
				int 총가격 =콜라바구니*콜라가격+사이다바구니*사이다가격+환타바구니*환타가격;
				System.out.printf("총가격: %6d\n",총가격);
				System.out.println("-------------------------------------");
				
				System.out.println("1.결제 2. 취소 :");int ch1=scanner.nextInt();
				if(ch1==1) {
					System.out.println("안내 금액 투여 :"); int pay=scanner.nextInt();
					if(총가격>=pay) {
						System.out.println("잔돈 :" +(pay-총가격));
						콜라바구니=0;
						사이다바구니=0;
						환타바구니=0;
						System.out.println("주문 번호 : "+주문번호);
						주문번호++;
					}else {
						콜라바구니 = 0;
						환타바구니= 0;
						사이다바구니= 0;
						콜라재고+=콜라바구니; 콜라바구니=0;
						사이다재고+=사이다바구니; 사이다바구니=0;
						환타재고+=환타바구니; 환타재고=0;
					}
				}
				else if(ch==2) {
					콜라재고+=콜라바구니; 콜라바구니=0;
					사이다재고+=사이다바구니; 사이다바구니=0;
					환타재고+=환타바구니; 환타재고=0;
					System.err.println("안내) 장바구니를 초기화했습니다. [초기메뉴로 돌아갑니다.]");
				}
			}		
		}
	}
}