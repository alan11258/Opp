package tw.alan.myproject.opp.enumerated;

enum Music{
	pop, rockNroll, romantic("Love Me Like You Do"), classic("La Travta"), rnb;
	//pop, rockNroll, romantic, classic, rnb;
	
	private String song = "Nancy Mulligan";
 // 建構子,建構子必須和class相同
	private Music(){
		System.out.println("song:" + song);
	}
//	建構子,預設為private   因為在enum下面,所以就算沒寫也是private
	Music(String song){ //這邊會去抓取String,因此當上面有兩個當有文字時,上面的println song只抓到剩下的3個
		this.song = song;
		System.out.println("SOSO");
	}
//	method
	public void showInfo(){
		System.out.println("Your Favorite Song: " + song);
	}
}

public class CallTestEnumeratedEx2 {

	public static void main(String[] args) {
		Music music = Music.classic;
		System.out.println("music: " + music);
		
		music.showInfo();

	}

}
