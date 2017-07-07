package tw.alan.myproject.opp;

public class TestThisEx1 {
	
	int age = 18;
	int grade = 90;
	
	public TestThisEx1 (){
		System.out.println("first");
	}
	
	public TestThisEx1 (int age){
		this();
		System.out.println("second");
	}
	
	
	public void setScore (int age, int grade){
		this.age = age;
		this.grade = grade;
		
		System.out.println("this= " + this);
	}

	public static void main(String[] args) {
		TestThisEx1 test1 = new TestThisEx1(50);
		test1.setScore(22, 85);
		
		System.out.println("test1= " + test1);
		System.out.println("test1.age= " + test1.age);
		System.out.println("test1.grade= " +test1.grade);

	}

}
