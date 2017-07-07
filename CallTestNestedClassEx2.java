package tw.alan.myproject.opp.nestedclass;

class E {
	private String name = "Amanda";
	public void execNested(){
		int age = 26;
		
		class F {           //定義一個方法
			public void buy(int money){
			System.out.println(name+"bought a ticket cost "+money+"\n"+"Name:"+name+" Age:"+age);
			}
		}
		F f1 = new F();      //先有定義F才能再去呼叫別的東西
		f1.buy(290);
	}
}

public class CallTestNestedClassEx2 {

	public static void main(String[] args) {
		E e1 = new E();     
		e1.execNested();

	}

}
