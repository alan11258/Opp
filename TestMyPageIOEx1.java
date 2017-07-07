package tw.alan.myproject.opp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class TestMyPageIOEx1 {
	
	private String pageUrl = "https://tw.news.yahoo.com/%E5%8F%B2%E4%B8%8A%E6%9C%80%E5%A4%A7%E5%86%B0%E5%B1%B1-%E5%BF%AB%E8%88%87%E5%8D%97%E6%A5%B5%E6%B4%B2%E5%88%86%E5%AE%B6-175000861.html";
	
	private void showMypage() throws IOException{
		URL url = new URL(pageUrl);
		
		InputStream is = url.openStream();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/myPage.html")));
	
		String data;     
		
		while((data = br1.readLine()) != null){     
			System.out.println(data);
			bw1.write(data);
		}
			bw1.flush();
			bw1.close();
			br1.close();          
			is.close();
	}

	public static void main(String[] args) throws IOException {
		TestMyPageIOEx1 page = new TestMyPageIOEx1();
		page.showMypage();

	}

}
