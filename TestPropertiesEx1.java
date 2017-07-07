package tw.alan.myproject.opp.collection.generics;

import java.util.Enumeration;
import java.util.Properties;

public class TestPropertiesEx1 {

	public static void main(String[] args) {
		Properties p1 = System.getProperties();
		Enumeration<?> e1 = p1.propertyNames();//用e1點系統Create Local Variable 'e1'
		
		while(e1.hasMoreElements()){   //是否有下一筆資料
			String key = (String)e1.nextElement(); //nextElement() > key > (String)強制轉型
			String value = p1.getProperty(key); //用value來接收
			
			System.out.println(key + ":" + value);
		}

	}

}
