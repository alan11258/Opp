package tw.alan.myproject.opp.method;

public class CallTestMethodEx3 {
	
	public int add1(){
		int sum = 0;
		for(int i = 1; i<=10; i++){
			sum = sum +i;
		}
		return sum;
	}
	
	public int add2(){
		int sum = 0;
		for(int i =1; i <=100; i++){
			sum = sum + i;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		CallTestMethodEx3 test3= new CallTestMethodEx3();
		CallTestMethodEx3 test4= new CallTestMethodEx3();
		int value1 = test3.add1();
		int value2 = test4.add2();
		System.out.println("value1= " + value1);
		System.out.println("value2= " + value2);

	}

}
