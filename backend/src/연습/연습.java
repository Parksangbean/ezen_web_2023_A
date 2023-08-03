package 연습;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 연습 {
	public static void main(String[] args) throws IOException {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			String filePath = "./src/연습/연습.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
			FileInputStream  fileInputStream = new FileInputStream(filePath);
			File file = new File(filePath);
			
			byte[] inByteArray = new byte[(int)file.length()];
			String fileInfo = new String(inByteArray);
			
			String[] 재고관리 =fileInfo.split("\n");
			
			for(int i =0; i<재고관리.length; i++) {
				String name = 재고관리[i].split(",")[0];
				int stock = Integer.parseInt(재고관리[i].split(",")[1]);
				int price = Integer.parseInt(재고관리[i].split(",")[2]);
				int basket = Integer.parseInt(재고관리[i].split(",")[3]);
				
				if(stock==0) {
					System.out.println((i+1)+":"+name+"[제고부족]");
				}else {
					System.out.println((i+1)+":"+name+"["+stock+"]");
				}
			}
			System.out.println("\n\n>>>>>>선택: "); int ch = sc.nextInt();
			
			if(ch==-1) {
				System.out.println("제품명: "); String name = sc.next();
				System.out.println("초기재고: "); int stock = sc.nextInt();
				System.out.println("가격: "); int price =sc.nextInt();
				int basket=0;
				String outStr=name+","+stock+","+price+","+basket+"\n";
				fileOutputStream.write(outStr.getBytes());
				System.out.println("안내) 제품이 등록 되었습니다.");
			}
		}
	}
}
