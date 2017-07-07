package tw.alan.myproject.opp.encapsulation;

class RoomMate{
	private String name = "mary";
	private int age = 18;
//	按右鍵 >>> Source >>> Generate Getters and Setters >>> 勾選所要設定的 >>> 再選取public等類別
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		RoomMate mate = new RoomMate();
		mate.setName("judy");    //重設名字,若不使用則結果就是原先的mary
		String hername = mate.getName();
		System.out.println("herName:" + hername);

	}

}
