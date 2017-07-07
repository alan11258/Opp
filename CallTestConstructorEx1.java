package tw.alan.myproject.opp;

public class CallTestConstructorEx1 {               //a
	
	public CallTestConstructorEx1(String name) {    //a此處名稱必須與上一個a點相同
		System.out.println("My Constructor." + name);
	}
	public void play(){                             //新增一個類別出來
		System.out.println("Play Chess!!");
	}

	public static void main(String[] args) {
		CallTestConstructorEx1 test1 = new CallTestConstructorEx1("Mary");  //new一個物件出來
		test1.play();
		
		//anonymous object未命名物件,行數少效率高,但運用次數多時降低效率
		new CallTestConstructorEx1("John").play();;           //new一個物件出來
		System.out.println("Ok~");
		
		//int i = 1;
		//i = i + 1;
		//System.out.println("i= " + i);
		//System.out.println("1 + 1= " + (1 + 1));
	}

}
