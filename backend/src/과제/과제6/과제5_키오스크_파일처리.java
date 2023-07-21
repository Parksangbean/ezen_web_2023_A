package 과제.과제6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class 과제5_키오스크_파일처리 {

	public static void main(String[] args) throws IOException {
		
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			String filePath = "./src/과제/과제6/재고파일.txt";	// 파일경로
			FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
			FileInputStream fileInputStream = new FileInputStream(filePath);
			File file =new File(filePath);
			/* ----------- */
			byte[] inByteArray =new byte[(int)filePath.length()];
			fileInputStream.read( inByteArray ); // 읽어온 바이트를 바이트배열에 저장
			String fileinfo = new String(inByteArray);
			System.out.println(fileinfo);
			
			String 재고관리[] = fileinfo.split("\n"); System.out.println("데이터: "+Arrays.toString(재고관리));
			System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			System.out.print("-1:제품등록 0:결제 ");
			for( int i = 0 ; i<재고관리.length ; i++ ) { // 배열 하나씩 출력
				if( !재고관리[i].equals("") ) { // 만약에 제품이 하나도 없으면
					String name = 재고관리[i].split(",")[0]; // 제품명
					int stock = Integer.parseInt( 재고관리[i].split(",")[1] ); // 재고
					int price = Integer.parseInt( 재고관리[i].split(",")[2] ); // 가격
					int basket = Integer.parseInt( 재고관리[i].split(",")[3] ); // 바구니
					
					if( stock == 0 ) { // 재고 없으면 
						System.out.print( (i+1) + ":" + name+"[재고없음] ");
					}else { // 재고가 있으면
						System.out.print( (i+1) + ":" + name+"["+price+"] ");
					}
				}
			} // for end
		
		System.out.print("\n>>>>>> 선택 : "); int ch = scanner.nextInt();
			
		} // while end 
	} // main end 
} // class end 



