package tw.alan.myproject.opp;

public class TestWrapperClassEx1 {

	public static void main(String[] args) {
		String number = "12345";             //變成文字串接
		System.out.println(number + "+1=" + (number+1));
		System.out.println("-------------------");
		
		Integer i1  = new Integer(number);   //將文字宣告為整數
//		int value1 = i1.intValue();          //將整數值存入value1
//		System.out.println(value1 + "+1=" + (value1+1));
		System.out.println(i1 + "+1=" + (i1+1));
		System.out.println("-------------------");
		
		int value2 = Integer.parseInt(number);    //直接用static parseInt將文字轉換為整數
		System.out.println(value2 + "+1=" + (value2+1));
		System.out.println("-------------------");

		Integer i2 = 6;
		int num1 = i2;
		System.out.println("num1:" + (++num1));    
		System.out.println("i2++:" + (++i2));   //Integer型別也可以利用自動裝箱與拆箱直接轉換數字計算
	}

}
