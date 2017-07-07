package tw.alan.myproject.opp.enumerated;

enum Poker{                     //用enumerated列舉限制值域,一定要宣告符合命名規則的變數名稱
	spade, heart, diamond, club 
}

public class CallTestEnumeratedEx1 {

	public static void main(String[] args) {
		Poker suit = Poker.heart;
		
		switch(suit){
		case spade:
			System.out.println(Poker.spade);
			break;
		case heart:
			System.out.println(Poker.heart);
			break;
		case diamond:
			System.out.println(Poker.diamond);
			break;
		case club:
			System.out.println(Poker.club);
			break;
			default:       //加入default,若產生意外執行.基本上設定好後不會執行default.
				assert false;    //加入斷言,若發生就終止.  VM argument輸入-ea以啟動斷言
		}
		Poker[] suits = Poker.values();   //Poker這列舉行別用.value抓值,放到suits一維度陣列
		
		for(Poker mysuit : suits){           //列印mysuit輸入,java指定給值進一維度
			System.out.println(mysuit + ":" + mysuit.ordinal());
		}
	}

}
