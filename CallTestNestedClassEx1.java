package tw.alan.myproject.opp.nestedclass;

class A {          //instance class
	class B {                 
		public void travel(){           //class B裡頭放一個方法
			System.out.println("Travel To Japan.");
		}
	}
	public void processNested() {  //在A類裡頭看得到,直接呼叫B,並new一個物件,再用物件呼叫travel
		B b1 = new B();            //但沒很常用,因為裡面方法常用private
		b1.travel();
	}
}

class C { 
private static String gameName = "Fable:The Last Chapter";  //加static才能使用
//static class
	static class D {
		public void play(){
			System.out.println("Play Game: "+gameName);//create field gameName in type C
		}
	}
}

public class CallTestNestedClassEx1 {

	public static void main(String[] args) {
		A a1 = new A();        //new一個a1物件
		a1.processNested();    //用a1呼叫processNested,從裡頭呼叫B,用B執行travel
//		或者可以直接new,(先有外再有內)先用外面A去.B,然後直接用b2去new以a1的B類裡
		A.B b2 = a1.new B(); 
		b2.travel();
		
		C.D d1 = new C.D();    //static的new很簡單,直接C.D即可
		d1.play();
	}

}
