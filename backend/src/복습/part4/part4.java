package 복습.part4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class part4 {
	public static void main(String[] args) throws IOException {
		
		while(true) {
			Scanner sc =new Scanner(System.in);
			
			String filePath ="./src/복습/part4/part4.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
			FileInputStream fileInputStream = new FileInputStream(filePath);
			File file = new File(filePath);
			
			byte[] inByteArray = new byte[(int)file.length()];
			String fileInfo = new String(inByteArray);
			String [] 재고관리 =fileInfo.split("\n");
			
			System.out.println("-----------메뉴----------[");
			System.out.println("-1: 제품등록 0: 결제");
			
			
		}
	}
}
