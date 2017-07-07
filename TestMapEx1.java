package tw.alan.myproject.opp.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map1 = new HashMap();
		
		map1.put("1st", "korra");   //輸入key和value
		map1.put("2nd", "rose");
		map1.put("3rd", "kerrigan");
		map1.put("3rd", "nova");
		
		Set keys = map1.keySet();                //抓取key值
		Collection values = map1.values();       //抓取value值
		Set mapping = map1.entrySet();           //回傳抓取到的值
		
		System.out.println("keys:" + keys);
		System.out.println("values:" + values);
		System.out.println("mapping:" + mapping);
		
		String Second = (String)map1.get("2nd");
		System.out.println("Second:" + Second);
	}

}
