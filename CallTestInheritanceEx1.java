package tw.alan.myproject.opp;

class Employee{                      //一般職員的基本屬性
	String name = "mary";
	String address = "Taipei";
	String phone = "130-672-88192";
	int salary = 22000;              //一般職員薪水
	
	public void getDetails(){
		System.out.println("Name:" + name);
		System.out.println("Address:" + address);
		System.out.println("Phone:" + phone);
	}
	public int getSalary(){          //取得薪水的值
		return salary;
	}
}
class Engineer extends Employee{     //工程師繼承一般職員的屬性
	public void program(){           //工程師自己擁有的能力
		System.out.println("I can write Java coad.");
		}
	
}
public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Engineer softEngineer = new Engineer();
		
		softEngineer.name = "Sen";    //設定工程師的名字
		softEngineer.salary = 55000;  //設定工程師的薪水
		softEngineer.getDetails();    //列印基本屬性資料
		
		int salary = softEngineer.getSalary();  //取得工程師的薪水資料
		System.out.println("Salary:" + salary);
		
		softEngineer.program();       //工程師能力

	}

}
