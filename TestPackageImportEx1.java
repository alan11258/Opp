package tw.alan.myproject.opp;

public class TestPackageImportEx1 {
	
	//沒有進入點,只能給import使用
	
	int speed = 50;

	public void speedUp(int speed){
		this.speed = speed + 10;       //this.使用外圈資料
	}
	
	public void speedDown(int speed){
		this.speed = speed - 10;       //this.使用外圈資料
	}
	
	public void showInfo(){            
		System.out.println("Speed:" + speed);
	}
}
