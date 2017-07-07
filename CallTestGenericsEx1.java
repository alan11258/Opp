package tw.alan.myproject.opp.collection.generics;

class TestInteger{
	private Integer i1;

	public Integer getI1() {   //做get & set讓別人能夠存取
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}
}
class TestDouble{
	private Double d1;

	public Double getD1() {
		return d1;
	}

	public void setD1(Double d1) {
		this.d1 = d1;
	}
}
//.....做8個

class TestObject{          //做8個太麻煩,用Object去做
	private Object o1;

	public Object getO1() {
		return o1;
	}

	public void setO1(Object o1) {
		this.o1 = o1;
	}
}
class TestGenericsEx1<T>{    //型別不指定
	private T t1;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
}
public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		TestInteger test1 = new TestInteger();
		test1.setI1(6);
		int value1 = test1.getI1();   //getI1 > = > value1 > int >>>用value1去接收
		System.out.println("value1+1=" + (value1+1));
		
		TestObject obj1 = new TestObject();
		obj1.setO1(3.14);
		double value2 = (Double)obj1.getO1();  //getI1 > = > value2 > (Double) > double
		
//		int vvalue2 = (Integer)obj1.getO1();  //compile error
		System.out.println("value2+2=" + (value2+2));
		
		
		TestGenericsEx1<Integer> test2 = new TestGenericsEx1<Integer>();//泛型寫的時候要指定型別
		test2.setT1(7);
		int value3 = test2.getT1();
		System.out.println("value3+3=" + (value3+3));
	}

}
