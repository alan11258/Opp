package tw.alan.myproject.opp;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data = "abcdefghij";
		
		System.out.println("data.charAt(5)= " + data.charAt(5));   //取得第5個字元
		System.out.println("data.length()= " + data.length());     //取得全部字元長度
		System.out.println("data.indexOf('cd')= " + data.indexOf("cd"));     //取得cd的位置
		System.out.println("data.substring(3, 5)= " + data.substring(3, 5)); //取得字元,從第3個開始,第5個之前
		System.out.println("+data.toUpperCase()= " + data.toUpperCase());    //轉換為大寫字元
		System.out.println("data.charAt(5)= " + data.codePointAt(1)); //取得第1個字元的Unicode編碼
		
		System.out.println("-----------------");
		String nickname1 = "emma-lin-jen-chao";    
		String[] names1 = nickname1.split("-");  //拆取-符號間隔的字串,若為*號則較特殊,必須打\\*才能拆解
		for(String name1 : names1){
			System.out.println("name1: " + name1);
		}
		
		System.out.println("-----------------");
		String nickname2 = "rose*toph*nova*korra";
		String[] names2 = nickname2.split("\\*");   //*號則較特殊,必須打\\*才能拆解
		for(String name2 : names2){
			System.out.println("name2: " + name2);
		}	

	}

}
