package tw.alan.myproject.opp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayListWithGenericsEx1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("nova");       //第0
		list1.add("mikasa");     //第1
		list1.add("sasha");      //第2
		list1.add("korra");      //第3
		list1.add("rose");       //第4
		list1.add("kerrigan");   //第5
		
		System.out.println("list1=" + list1);
//		ListIterator<String> listIterator = list1.listIterator();
		ListIterator<String> listIterator = list1.listIterator(2);//從0,1,2 >>第2個開始
		
//		while(listIterator.hasNext()){  //如果有下一個
//			String data = listIterator.next();
//			System.out.println(data);
//		}
		
		while(listIterator.hasPrevious()){  //如果有上一個
			String data = listIterator.previous();
			System.out.println(data);
		}
		
		

	}

}
