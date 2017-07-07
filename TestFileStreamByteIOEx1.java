package tw.alan.myproject.opp.io;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileStreamByteIOEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("c:/temp/test/source.txt");//拋出exception
		
		int data;
		while((data = file.read()) != -1){
//			System.out.print(data + "");   //沒有強制轉型成char的話,顯示為數字
			System.out.print((char)data); //強制轉型成char,還原成文字
		}
		
		file.close();

	}

}
