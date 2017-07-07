package tw.alan.myproject.opp.exception;

public class TestAssertionEx1 {

	public static void main(String[] args) {
		int a = 6, b = 0;
		
		assert b!=0:"b=" + b;    //若是false直接擋掉程式,不繼續執行
//		顯示 Exception in thread "main" java.lang.AssertionError: b=0
		System.out.println("a/b= " + (a/b));

	}

}
