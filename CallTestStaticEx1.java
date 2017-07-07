package tw.alan.myproject.opp;

class Bird{
	static String food = "rice"; 
	
	public static void eat(){
		System.out.println("Bird can eat some food: " + food + ".");
	}
}

public class CallTestStaticEx1 {

	public static void main(String[] args) {
		Bird.eat();                          //不用new即可呼叫
		System.out.println(Bird.food);       //可直接使用class bird裡的static

	}

}
