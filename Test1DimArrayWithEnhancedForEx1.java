package tw.alan.myproject.opp.array;

public class Test1DimArrayWithEnhancedForEx1 {

	public static void main(String[] args) {
		int[] data= {1, 2, 3, 4, 5, 6, 7, 8};   //(a)若為byte,只要int改為byte即可
		
		for(int num : data){                    //(a)若為byte,只要int改為byte即可
			System.out.println("num:" + num);
		}
	}

}
