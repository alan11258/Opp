package tw.alan.myproject.opp.override;

class Parent{
	public void jog(){
		System.out.println("jog slow");
	}
}

class Child extends Parent{
	//Annotation標註
	@Override             //此時如果輸成jog1新增而不是覆載時系統會提示錯誤
	public void jog(){    //子類別的修飾字public不能比父類別小e.g protected,除非修改父類別
//	型別void也必須跟父類別一樣,若輸入e.g int也是會提示錯誤
		System.out.println("jog fast");
	}
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Child Has = new Child();
		Has.jog();

	}

}
