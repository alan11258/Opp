package tw.alan.myproject.opp.exception;

public class CallTestExceptionEx1 {

	public void processExcept1(){
		int[] data = {1, 2, 3, 4, 5, 6};
//因為陣列的值從0開始,所以長度-1等於data值,也就是說長度6的話,值等於data[5],所以長度<就好,<=長度會超過
		try{
			for(int i = 0; i <= data.length; i++){    
				System.out.println("data[" + i + "]=" + data[i]);
			}
//		這裡是陣列錯誤,所以下面用ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e){  //故意用錯成>>方法錯誤,所以會抓不到,進入下一層
			System.out.println("Hello");
		} catch (Exception e){            //用大範圍直接抓
			System.out.println("e:" + e);
			e.printStackTrace();          //列印程式堆疊,也就是原先會顯示的錯誤
		}
//		抓錯誤要從小到大抓,最上層	
	}
	public void processExcept2(int x, int y){
		try{
			System.out.println("x/y=" + (x / y));
		} catch (ArithmeticException e){  //算術錯誤
			System.out.println("e:" + e);
			System.exit(-1);            //執行到這直接結束,不執行下面finally;輸入任一整數即可
		} finally{         //仍然執行
			System.out.println("Always excute here.");
		}
	}
	
	public static void main(String[] args) {
		CallTestExceptionEx1 except = new CallTestExceptionEx1();
//		except.processExcept1();
		except.processExcept2(6, 0);

	}

}
