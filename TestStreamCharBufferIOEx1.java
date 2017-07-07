package tw.alan.myproject.opp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStreamCharBufferIOEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/source.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/test/iamvirus.txt"));

		String data;
		
		while((data = br1.readLine()) != null){   //讀取整行資料
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();    //換行
		}
		
		bw1.flush();   //使用緩衝區後建議用flush寫出
		
		bw1.close();
		br1.close();
	}

}
