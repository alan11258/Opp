package tw.alan.myproject.opp.myabstract;

abstract class Company{
	public abstract void calFuel();
	public abstract void calDistance();
	
	public static void processVehcile(Company corp){ //不能使用物件,所以為了要使用在void前加static
		corp.calFuel();      //這樣子 子類別中都可以使用了
		corp.calDistance();
	}
}

class Truck extends Company{
//	可以標註Override功能
	@Override
	public void calFuel() {
		System.out.println("Truck Calculates Fuel.");		
	}
	@Override
	public void calDistance() {
		System.out.println("Truck Calculates Distance.");		
	}		
}
class Ship extends Company{
	@Override
	public void calFuel() {
		System.out.println("Ship Calculates Fuel.");	
	}
	
	@Override
	public void calDistance() {
		System.out.println("Ship Calculates Fuel.");	
	}
	
}
public class CallTestAbstractClassEx1 {

	public static void main(String[] args) {
//		Truck toyota = new Truck();
//		toyota.calFuel();
//		toyota.calDistance();
//		Ship cargoShip = new Ship();
//		cargoShip.calFuel();
//		cargoShip.calDistance();
		
//		Company corp;        //為了方便,節省步驟,直接一個Company物件corp出來,再用corp來new Truck和Ship
//		corp = new Truck();  //直接用corp new物件出來
//		corp.calFuel();      //然後就可以直接讓Truck使用自己類別的能力了
//		corp.calDistance();
//		corp = new Ship();
//		corp.calFuel();
//		corp.calDistance();
		
		Company.processVehcile(new Truck());  //直接在父類別中加入方法來使用
		Company.processVehcile(new Ship());
		

	}

}
