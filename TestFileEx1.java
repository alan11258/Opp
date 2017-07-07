package tw.alan.myproject.opp.io;

import java.io.File;
import java.io.IOException;

public class TestFileEx1 {

	public static void main(String[] args) throws IOException {  //拋出exception
		File file1 = new File("c:/temp/test/source.txt");
		
		boolean status = file1.exists();     //檔案是否存在
		System.out.println("status:" + status);
		
		if(status){                   //若為true
			System.out.println("Name:" + file1.getName());     //檔案名稱
			System.out.println("Length:" + file1.length() + " bytes.");//檔案內沒資料,所以會印出0 bytes
			System.out.println("Parent:" + file1.getParent()); //上層目錄名稱
			System.out.println("Path:" + file1.getPath());     //路徑
			file1.delete();                  //執行完上面後刪除檔案
		}else{
			boolean created = file1.createNewFile();    //若檔案不存在就創建.並把exception拋出
			
			if(created){                                //若檔案已創建就列印
				System.out.println("File Created");
			}
		}

	}

}
