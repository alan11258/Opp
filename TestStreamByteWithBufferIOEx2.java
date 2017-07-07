package tw.alan.myproject.opp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreamByteWithBufferIOEx2 {


	public static void main(String[] args) throws IOException {
//		FileInputStream fis1 = new FileInputStream("c:/temp/test/source.txt");
//		BufferedInputStream bis1 = new BufferedInputStream(fis1);
//		上面兩句合併等於下面,因為fis1一樣
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("c:/temp/test/source.txt"));
			
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/myfile.txt");
//		BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
		
//		上面兩句合併等於下面,因為fos1一樣
		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/test/myfile.txt"));
		
		int data;
		while((data = bis1.read()) != -1){
			System.out.print((char)data);
//			bos1.flush();    //每讀取一個byte就寫出一次,效果好但很耗資源
		}
		bos1.flush();    //全部完成後寫出,避免一直放在站存記憶體裡
			
		bos1.close();    //關閉順序和建立順序相反
//		fos1.close();    //當fis1兩句合併後,這就不用關了
		bis1.close();
//		fis1.close();    //當fos1兩句合併後,這就不用關了
	}

}
