package tw.alan.myproject.opp.exception;

class Cat{
	public void play(){
		System.out.println("Cat Play Ball.");
	}
}
class Kitty extends Cat{
	
}
class Dog{
	public void bark(){
		System.out.println("Dog Bark.");
	}
}

public class CallTestExceptionWithThrowsEx1 {
	
	public void processAction() throws ClassCastException, Exception{
//		throws把例外狀況丟下去
//		可以throws要求checked Exception,不能要求unchecked Exception
		Object c1 = new Kitty();
		Dog d1 = (Dog) c1; //變數前面的就是強制轉型
		d1.bark();
	}

	public static void main(String[] args) {  //throws Exception{
		CallTestExceptionWithThrowsEx1 except2 = new CallTestExceptionWithThrowsEx1();
		try{
			except2.processAction();
		} catch (Exception e){
			System.out.println("Finished");
		}
	}

}
