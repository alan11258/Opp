package tw.alan.myproject.opp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteConvertCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please Input Your Message:(Use Q or q To Exit)");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/hack.txt")));
		
		String data;     //宣告字串data
		
		while((data = br1.readLine()) != null){     //當data!=null代表有讀取到資料
			if(data.equalsIgnoreCase("Q")){      //當data是Q不分大小寫時
				
				bw1.flush();
				bw1.close();
				br1.close();          //結束程式前要先關閉才能釋放記憶體
				System.out.println("See You Next Time.");
				System.exit(-1);      //執行結束程式
			}
			System.out.println("Data= " + data);    //列印輸入所儲存至data的字元
			bw1.write(data);      //一定要記得寫入資料
		}
	}

}