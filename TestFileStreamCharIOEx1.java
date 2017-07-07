package tw.alan.myproject.opp.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileStreamCharIOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("c:/temp/test/source1.txt");
		FileWriter fw1 = new FileWriter("c:/temp/test/favor.txt");//指定存檔路徑
		
		int data;
		while((data = fr1.read()) != -1){
			System.out.print((char)data + "");
			fw1.write(data);
		}
		
		fw1.close();
		fr1.close();

	}

}
