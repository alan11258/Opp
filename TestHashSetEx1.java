package tw.alan.myproject.opp.collection;

import java.util.HashSet;

public class TestHashSetEx1 {


	@SuppressWarnings({ "rawtypes", "unchecked" })  //壓制警告
	public static void main(String[] args) {
		HashSet set1 = new HashSet();//選@Add SuppressWarnings 'rawtypes' to 'main()'壓制警告
		
		set1.add("marry");   //選@....unchecked壓制警告
		set1.add("marry");
		set1.add("john");
		set1.add(6);
		set1.add(new Integer(6));
		set1.add(3.14);
		
		System.out.println("set1:" + set1);
//		結果的排序是由java指定的

	}

}
