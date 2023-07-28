package 복습.part2;

import java.util.Scanner;

public class part2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String 재고관리 = "10,0,300\n3,0,200\n2,0,100\n";
		 int 콜라재고=Integer.parseInt(재고관리.split("\n")[0].split(",")[0]);
		 int 콜라바구니=Integer.parseInt(재고관리.split("\n")[0].split(",")[1]);
		 int 콜라가격=Integer.parseInt(재고관리.split("\n")[0].split(",")[2]);
		 
		 int 환타재고=Integer.parseInt(재고관리.split("\n")[1].split(",")[0]);
		 int 환타바구니=Integer.parseInt(재고관리.split("\n")[1].split(",")[1]);
		 int 환타가격=Integer.parseInt(재고관리.split("\n")[1].split(",")[2]);
		 
		 int 사이다재고=Integer.parseInt(재고관리.split("\n")[2].split(",")[0]);
		 int 사이다바구니=Integer.parseInt(재고관리.split("\n")[2].split(",")[1]);
		 int 사이다가격=Integer.parseInt(재고관리.split("\n")[2].split(",")[2]);
		 while(true) {
			 System.out.println("---------- 메뉴 ----------------");
			 System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4. 결제");
			 System.out.println(">>>>>선택 :");int ch=sc.nextInt();
			 
			   if(ch==1) {
				   if(콜라재고>0) {
					   콜라재고--; 콜라바구니++; System.out.println("안내) 콜라를 담았습니다.");
				   }else {
					   System.out.println("안내) 콜라 재고가 없습니다. [관리자에게 문의]");
				   }
			   }
			   else if(ch==2) {
				   if(환타재고>0) {
					   환타재고--; 환타바구니++; System.out.println("안내) 환타를 담았습니다.");
				   }else {
					   System.out.println("안내) 환타 재고가 없습니다. [관리자에게 문의]");
				   }
			   }
			   else if(ch==3) {
				   if(사이다재고>0) {
					   사이다재고--; 사이다바구니++; System.out.println("안내) 사이다를 담았습니다.");
				   }else {
					   System.out.println("안내) 사이다 재고가 없습니다. [관리자에게 문의]");
				   }
			   }
			   else if(ch==4) {
				   System.out.println("-------------------------------");
				   System.out.printf("%10s %10s %10s\n","제품명","수량","가격");
				   System.out.printf("%10s %10d %10d\n","콜라",콜라바구니,콜라바구니*콜라가격);
				   System.out.printf("%10s %10d %10d\n","환타",환타바구니,환타바구니*환타가격);
				   System.out.printf("%10s %10d %10d\n","사이다",사이다바구니,사이다바구니*사이다가격);
				   int 총가격=(콜라바구니*콜라가격)+(환타바구니*환타가격)+(사이다바구니*사이다가격);
				   System.out.printf("총가격 : %7d\n",총가격);
				   System.out.println("--------------------------------");
				   if(콜라바구니==0&&사이다바구니==0&&환타바구니==0) {System.out.println("장바구니에 담긴게 없습니다 다시 확인해주세요!!");}
				   System.out.println("1.결제 2. 취소 :"); int ch2=sc.nextInt();
				   if(ch2==1) {
					   System.out.println("안내 금액 투여:"); int pay=sc.nextInt();
					   if(pay>=총가격) {
						   System.out.println("잔액: "+(pay-총가격));
						   콜라바구니=0; 사이다바구니=0; 환타바구니=0;
					   }else {
						   System.out.println("결제취소");
						   콜라재고+=콜라바구니; 콜라바구니=0;
						   환타재고+=환타바구니; 환타바구니=0;
						   사이다재고+=사이다바구니; 사이다바구니=0;
					   }
				   }
				   else if(ch2==2) {
					   System.out.println("장바구니 초기화");
					   콜라재고+=콜라바구니; 콜라바구니=0;
					   환타재고+=환타바구니; 환타바구니=0;
					   사이다재고+=사이다바구니; 사이다바구니=0;
				   }
			   }
		   }
	}
}
