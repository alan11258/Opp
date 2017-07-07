package tw.alan.myproject.opp.polymorphism;

public class CallTestPolymorphismEx2 {
//	放在同一個類別理,所以抓得到CallTestPolymorphismEx2的資料
	public void processAction(Mammal m){ //1:Mammal m = garField; -> Mammal m = new Cat();
		m.sleep();                       //2:Mammal m = new Dog();
		if(m instanceof Cat){
			Cat c1 = (Cat)m;        //c1強制轉型為Cat
			c1.jumpAway();          //然後就能使用Cat的功能了
//			((Cat) m).jumpAway();
		}
//		強制轉型要判斷清楚,否則判斷錯但語法會正確,但執行時會錯誤
		if(m instanceof Dog){
			Dog d1 = (Dog)m;        //d1強制轉型為Dog
			d1.bitep();             //然後就能使用Dog的功能了
//			((Dog) m).bitep();
		}
	}

	public static void main(String[] args) {
		CallTestPolymorphismEx2 poly1 = new CallTestPolymorphismEx2();
		
		Cat garFiled  = new Cat();      //參考註解1
		poly1.processAction(garFiled);  //設置garFiled,讓Mammal m = garField;
//		然後Mammal m = new Cat();最後才去執行sleep
		
		poly1.processAction(new Dog()); //參考註解2
//		直接合而唯一,讓Mammal m = new Dog();

	}

}
