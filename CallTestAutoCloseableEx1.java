package tw.alan.myproject.opp.io;
//07/07 PM
//關閉資源
class MyResource implements AutoCloseable{   //AutoCloseable在java.lang裡,所以會自動載入
	
	public void processResource(){
		System.out.println("Resource Processing...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resource Closed !!");
		
	}
	
}

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
		try(MyResource resource= new MyResource()){   //拋出exception
			resource.processResource();
		} catch (Exception e) {            //這邊要接住exception
			e.printStackTrace();
		}
	}

}
