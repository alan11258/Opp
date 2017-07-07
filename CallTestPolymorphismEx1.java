package tw.alan.myproject.opp.polymorphism;

class Mammal{
	public void sleep(){
		System.out.println("I can sleep.");
	}
}
class Cat extends Mammal{

	@Override
	public void sleep() {
		System.out.println("Cat sleep.");
	}
	public void jumpAway(){
		System.out.println("Cat jumps away.");
	}	
}
class Dog extends Mammal{
//右鍵 >> Source >> Override/Implement Methods... >> 勾選sleep
	@Override
	public void sleep() {
		System.out.println("Dog sleep.");
	}
	public void bitep() {
		System.out.println("Dog bites bone.");
	}
}
public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {	
//		Cat kitty = new Cat();   //Cat sleep
//		kitty.sleep();
		
//		Mammal m = new Mammal();  //Cat sleep
//		m = kitty;
//		m.sleep();

//		Mammal m = new Cat();    //Cat sleep
//		m.sleep();
		
		Mammal m;             //共用Mammal
		m = new Cat();        //Cat sleep
		m.sleep();
		
		m = new Dog();        //Dog sleep
		m.sleep();
	}

}
