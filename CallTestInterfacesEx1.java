package tw.alan.myproject.opp.myinterfaces;

interface Flyer{                   //介面
	public void takeoff();
	public void fly();
	public void land();
}
abstract class Creature{
	public abstract void eat();
}

class Airplan implements Flyer{   //Airplan實作Flyer介面

	@Override
	public void takeoff() {
		System.out.println("Airplan takeoff");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplan flying");
		
	}

	@Override
	public void land() {
		System.out.println("Airplan lands");
		
	}	
	
}

class Bird extends Creature implements Flyer{  //先有extends才有implements

	@Override
	public void takeoff() {
		System.out.println("Bird takeoff");
		
	}

	@Override
	public void fly() {
		System.out.println("Bird flying");
		
	}

	@Override
	public void land() {
		System.out.println("Bird lands");
		
	}	
	
	@Override
	public void eat() {
		System.out.println("Bird Eats Worms");
	}
	
}

public class CallTestInterfacesEx1 {

	public static void main(String[] args) {
		Flyer flyer;
		flyer = new Bird();
		
		flyer.takeoff();
		flyer.fly();
		flyer.land();
		
		if(flyer instanceof Bird){
			Bird b1 = (Bird)flyer;
			b1.eat();
		}

	}

}
