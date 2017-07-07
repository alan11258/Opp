package tw.alan.myproject.opp.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TestLotterySystemEx1 {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>(); //用只能出現一次不排序的Set
		
		while(numbers.size()<6){  //長度不超過6個(0~5)
			int richnum = (int)(Math.random()*42)+1;
//			System.out.println("richnum" + richnum);
			
			numbers.add(richnum);
		}
		
		System.out.println(numbers);
		
//		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Integer> set1 = new TreeSet<Integer>(new Comparator<Integer>(){
//			匿名巢狀類別
			@Override
			public int compare(Integer o1, Integer o2) {  //比較兩數o1, o2
				return o2-o1;  //o2要比o1大,排列由大到小
			}
			
		});
		set1.addAll(numbers);   //輸入所有
		
		System.out.println(set1);
	}

}
