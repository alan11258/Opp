package tw.alan.myproject.opp.mypackage;

import tw.alan.myproject.opp.TestPackageImportEx1;
//可用Ctrl+Shift+o來載入,或者由TestPackageImportEx1 test1輸入時的系統提示輸入

public class CallTestPackageImportEx1 {

	public static void main(String[] args) {
		TestPackageImportEx1 test1 = new TestPackageImportEx1();
		test1.speedUp(50);
//		test1.speedDown(0);
		test1.showInfo();              //呼叫顯示資料

	}

}
