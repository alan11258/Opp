package tw.alan.myproject.opp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestByteConvertCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please Input Your Message:(Use Q or q To Exit)");
		
//		InputStream is1 = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader br1 = new BufferedReader(isr1);	
//		上面三行可以整合成一行
//		...br1=...(isr1) > ...isr1=...(is1) > ...isr=...System.in
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String data;     //宣告字串data
		
		while((data = br1.readLine()) != null){     //當data!=null代表有讀取到資料
			if(data.equalsIgnoreCase("Q")){      //當data是Q不分大小寫時
				
				br1.close();          //結束程式前要先關閉才能釋放記憶體
//				isr1.close();         //結束程式前要先關閉才能釋放記憶體;寫成一行後不需要.
//				is1.close();          //結束程式前要先關閉才能釋放記憶體;寫成一行後不需要.
				System.out.println("See You Next Time.");
				System.exit(-1);      //執行結束程式
			}
			System.out.println("Data= " + data);    //列印輸入所儲存至data的字元
		}
	}

}
