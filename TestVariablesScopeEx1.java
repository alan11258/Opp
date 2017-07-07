package tw.alan.myproject.opp;

public class TestVariablesScopeEx1 {
	
	int a = 1;                  //instance variable   
	static int b = 2;           //static variables
	
	public void f1 (int c){     //local variables
		int d = 4;              //local variables
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
	}
	
	public static void f2 (int e){        //local variables
//		System.out.println("a1= " + a);   //compile error
		System.out.println("b1= " + b);
//		System.out.println("c1= " + c);   //compile error
//		System.out.println("d1= " + d);   //compile error
		System.out.println("e1= " + e);
	}

	public static void main(String[] args) {
		TestVariablesScopeEx1 scope = new TestVariablesScopeEx1();
		scope.f1(3);
//		scope.f2(6);               //系統建議用class呼叫,如下
		TestVariablesScopeEx1.f2(7);

	}

}
