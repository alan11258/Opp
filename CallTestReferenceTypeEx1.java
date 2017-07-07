package tw.alan.myproject.opp;

class Shirt{                       //class要放在public class之上
	int price = 2500;
	char size = 'L';
}

public class CallTestReferenceTypeEx1 {
	
	public static void main(String[] args) {
		Shirt myshirt = new Shirt();
		myshirt.price = 2200;
		myshirt.size = 'S';
		
		Shirt yourshirt = new Shirt();
		yourshirt.price = 4000;
		yourshirt.size = 'M';
		
		System.out.println("myshirt" + myshirt);
		System.out.println("yourshirt" + yourshirt);
		
		System.out.println("myshirt.price= " + myshirt.price);
		System.out.println("myshirt.size= " + myshirt.size);
		
		System.out.println("yourshirt.price= " + yourshirt.price);
		System.out.println("yourshirt.size= " + yourshirt.size);
		
		yourshirt = myshirt;         //記憶體位置變相同
		yourshirt.size = 'X';
		yourshirt.price = 6200;
		
		System.out.println("myshirt_1" + myshirt);       //記憶體位置變相同
		System.out.println("yourshirt_1" + yourshirt);   //記憶體位置變相同
		
		System.out.println("yourshirt.price= " + yourshirt.price);
		System.out.println("yourshirt.size= " + yourshirt.size);

	}

}
