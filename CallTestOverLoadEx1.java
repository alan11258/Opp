package tw.alan.myproject.opp.overload;

public class CallTestOverLoadEx1 {
	
	public void plus(int x , int y){               //型別不同
		System.out.println("x+y= " + (x+y));
	}
	
	public void plus(double x , double y){         //型別不同
		System.out.println("x+y= " + (x+y));
	}
		


	public static void main(String[] args) {
		CallTestOverLoadEx1 overload = new CallTestOverLoadEx1();
		overload.plus(28, 99);
		overload.plus(8.54213, -3.145);
		overload.plus('a', 9);
		overload.plus('A', 1.65);

	}

}
