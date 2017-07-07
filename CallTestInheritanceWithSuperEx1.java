package tw.alan.myproject.opp.inheritance;

class Fish {        //隱藏完整預設為class Fish extends Object{
	//呼叫父親的不帶參數建構子extends Object
	String name = "Nemo";
	
	public Fish(){  //@   因為有不帶參數建構子,所以要建個參數來符合語法
		super();    //此為  隱藏預設
		System.out.println("default action");  //文字打出來只是為了表示這是預設選項
	}
	
	public Fish(String name){     //此為 帶參數建構子
//		super();      一樣會有隱藏預設
		this.name = name;
	}
	
	public void swim(){
		System.out.println(name + ", I can forget lot's of thing.");
	}
}

class Shark extends Fish{    //@ Shark繼承了有不帶參數建構子的父類別Fish
	public Shark(){
		super("Dori");     //此為  隱藏預設
	}
	public void action(){
		super.swim();      //呼叫父類別的成員,系統順序23 >> 5 >> 17 >> 34 >> 35
	}
}

public class CallTestInheritanceWithSuperEx1 {

	public static void main(String[] args) {
		Shark tigerShark = new Shark();
		tigerShark.action();
		System.out.println("Finished");
	}

}