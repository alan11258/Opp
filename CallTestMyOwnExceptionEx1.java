package tw.alan.myproject.opp.exception;

class MyOwnException extends Exception{   
//按黃色提示,自動產生一個Exception編碼
	private static final long serialVersionUID = 1L;
//繼承Exception
	
	private Object server;
	private Object port;
	private Object errMsg;

	public MyOwnException(String server, int port, String errMsg){
		this.server = "Deep Blue";//this.server & port & errMsg,鼠標上去,按系統提示自動宣告建一個屬性
		this.port = 80; 
		this.errMsg = "System Error";
	}
	
	public void showInfo(){
		System.out.println("Server: " + server);
		System.out.println("Port: " + port);
		System.out.println("Error Message: " + errMsg);
	}
}

public class CallTestMyOwnExceptionEx1 {

	public static void main(String[] args) {
		int code = 006;
		if(code%2 == 0){
//			用throw new..拋出例外狀況完之後,利用系統提示,選Surround with try catch去新建完成
			try {
				throw new MyOwnException("Blade", 12345, "Unauthorized Access Intruder.");
			} catch (MyOwnException e) {
//				e.printStackTrace();
				e.showInfo();    //利用上面的showInfo列印資訊
			}
		} else {
			System.out.println("Welocme, Amigo." );
		}

	}

}
