package java1.연습;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 연습 {
	public static void main(String[] args) throws IOException {
		while(true) {
			
			Scanner sc =new Scanner(System.in);
			String filePath ="./src/복습/part4/part4.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
			FileInputStream fileInputStream = new FileInputStream(filePath);
			File file =new File(filePath);
			byte[] inByteArray = new byte[(int)file.length()];
			String fileInfo = new String(inByteArray);
			String[] 재고관리 = fileInfo.split("\n");
			
			System.out.println("---------------");
			System.out.println("-1 제품등록 0 결제");
			for(int i=0; i<재고관리.length; i++) {
				if(!재고관리[i].equals("")) {
					String name = 재고관리[i].split(",")[0];
					int stock = Integer.parseInt(재고관리[i].split(",")[1]);
					int price = Integer.parseInt(재고관리[i].split(",")[2]);
					int basket = Integer.parseInt(재고관리[i].split(",")[3]);
					
					return;
				}
			}
		}
	}
}
