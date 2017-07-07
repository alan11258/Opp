package tw.alan.myproject.opp;

class Car{
	String brand = "Java";
	
	public void drive(){    //有一個行為
		System.out.println("Drive a " + brand + " car.");
	}
}

public class CallTestEqualsEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();     //new的動作是實體化一個物件,新一個住址
//		假設car1記憶體位置為0x1234. 當car1=car2後,car1記憶體位置也變為0x2345
		Car car2 = new Car();
//		假設car2記憶體位置為0x2345
		
		System.out.println("(car1==car2)=" + (car1==car2)); //此時比較記憶體發現不相同
		System.out.println("(car1.equals(car2)=" + (car1.equals(car2))); 
		//此時比較物件發現不相同
		
		System.out.println("--------------------------");
		car1=car2;
		
		System.out.println("(car1==car2)_1=" + (car1==car2)); //此時比較記憶體發現相同
		System.out.println("(car1.equals(car2)_1=" + (car1.equals(car2)));
		//此時比較物件發現相同
	}

}
