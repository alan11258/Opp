package tw.alan.myproject.opp.array;

public class TestVarArysEx1 {
	
	public void sum(int...data){
		int total = 0;
		for(int value : data){                //value的值參考data
			total = total + value;
		}
		System.out.println("total:" + total);
	}

	public static void main(String[] args) {
	
		TestVarArysEx1 varArgs = new TestVarArysEx1();
		varArgs.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);   //輸入值會統計出來,若為空就回傳total:0
		
		int[] log = {6, 5, 4, 3, 2, 1};
		varArgs.sum(log);                //直接用sum統計另一維度陣列log的值
	}

}
