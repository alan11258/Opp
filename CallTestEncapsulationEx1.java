package tw.alan.myproject.opp.encapsulation;

class TestEncapsulationEx1{
//	private int a = 1;
	public int b = 2;
}

public class CallTestEncapsulationEx1 {
	
	public static void main(String[] args) {
		TestEncapsulationEx1 encap = new TestEncapsulationEx1();
//		System.out.println("encap.a=" + encap.a);  //compile error因為a=1是private 
		System.out.println("encap.b=" + encap.b); //因為b是public所以看的到抓的到
	}
}
