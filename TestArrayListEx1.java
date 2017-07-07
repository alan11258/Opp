package tw.alan.myproject.opp.collection;

import java.util.ArrayList;

public class TestArrayListEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		list1.add("marry");   
		list1.add("marry");
		list1.add("john");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(3.14);
		
		list1.remove(2);        //移除第2個
		list1.set(1, "rose");   //重設第1個,設為rose
		
		System.out.println("list1:" + list1);
//		因為用ArrayList,所以列印結果會按輸入順序排序
		System.out.println("list1.contains('marry'):" + list1.contains("marry"));//檢查是否有"marry"
		System.out.println("list1.contains('john'):" + list1.contains("john"));//檢查是否有"john"
		System.out.println("size:" + list1.size());
	}

}
