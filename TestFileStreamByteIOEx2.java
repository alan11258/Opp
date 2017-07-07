package tw.alan.myproject.opp.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStreamByteIOEx2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/source.txt");
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/destination.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/destination.txt",true);
//		加true會在元檔案文字後接續寫
		
		int data;
		while((data = fis1.read()) != -1){
			System.out.print((char)data + ""); 
			fos1.write(data);
		}
		
		fos1.close();  //後建的先關
		fis1.close();  //先建的後關
	}

}
