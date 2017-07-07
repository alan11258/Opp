package tw.alan.myproject.opp;

class Person{                       //新增的class必須在public class之上
	public void sayHello(){         //一個方法
		System.out.println("Hola");
		sayGoodBye();               //看得到的話可以直接放下面呼叫
	}
	public void sayGoodBye(){
		System.out.println("Adios");
	}
}

public class CallTestMethodEx1 {

	public static void main(String[] args) {
		Person mike = new Person();            //新增一個物件Person
		mike.sayHello();
//		mike.sayGoodBye();
		System.out.println("Finished");
	}

}
