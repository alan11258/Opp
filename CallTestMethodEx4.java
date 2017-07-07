package tw.alan.myproject.opp.method;

class TestMethodEx4 {
	
	public boolean addEvolution(int count) {
		
		for (int i = 1; i <= count; i++) {
			System.out.println("Hi");
		}
		
		return true;
	}
	
}

public class CallTestMethodEx4 {

	public static void main(String[] args) {
		TestMethodEx4 test4 = new TestMethodEx4();
		
		boolean status = test4.addEvolution(10);
		System.out.println("status:" + status);

		if (status) {
			System.out.println("Success!!!");
		}
	}

}


