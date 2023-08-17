package java2.day22.Ex1;

import java.awt.Toolkit;

public class 비프음 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			try {
				Thread.sleep(500);
			}catch (Exception e) {System.out.println(e);}
		}
		
	}

}
