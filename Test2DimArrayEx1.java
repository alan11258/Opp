package tw.alan.myproject.opp.array;

public class Test2DimArrayEx1 {

	public static void main(String[] args) {
		int[][] data = { {1, 2, 3}, {4, 5, 6, 7, 8, 9} };
		
		for(int i = 0; i < data.length; i++){      //i值為有幾個一維空間
			for(int j = 0; j < data[i].length; j++){   //j值為這個空間有幾個變數
				System.out.println("data[" + i +"]= " + "data[" + j + "]= " + data[i][j]);
			}
		}
		System.out.println("----------------------------");
		for(int[] nums : data){              //從二維中找到每一個一維度
			for(int value : nums){           //從每個一維度中找出變數
				System.out.println("value=" + value);
			}
		}
	}

}
