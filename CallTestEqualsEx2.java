package tw.alan.myproject.opp;

public class CallTestEqualsEx2 {

	public static void main(String[] args) {
		//hello記憶體位置0x3456
		
		String str1 = new String("hello");
		//str1記憶體位置0x1234
		String str2 = new String("hello");
		//str2記憶體位置0x2345
		
		//若直接String str1 = "hello"; String str2 = "hello";的話,兩個的記憶體位置都為0x3456
		
		System.out.println("(str1==str2)=" + (str1 == str2));  //此時住址不同,false
		System.out.println("str1.equals(str2)=" + str1.equals(str2)); //此時字串相同,true
		//若一個為"Hello",一個為"hello",則字串不同,equals為false
		
		
	}

}
