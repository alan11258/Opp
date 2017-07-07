package tw.alan.myproject.opp.nestedclass;

abstract class Dinosaur {
	public abstract void attack();
	public abstract void jump();
	public abstract void search();
}
//class Trex extends Dinosaur{
//
//	@Override
//	public void attack() {
//		System.out.println("Speedup and Attack.");
//		
//	}
//
//	@Override
//	public void jump() {
//		System.out.println("Jump 3 Feet.");
//		
//	}
//
//	@Override
//	public void search() {
//		System.out.println("Search For Hunt.");
//		
//	}
//	
//}

public class CallTestNestedClassEx3 {

	public static void main(String[] args) {
//		Trex t1 = new Trex();
//		t1.search();
//		t1.jump();
//		t1.attack();
		
//		new Dinosaur(){                //又達到繼承又達到改寫,以及呼叫方法
//                                     //只用一次,節省繼承關係
//			@Override
//			public void attack() {
//				System.out.println("Speedup and Attack Something.");
//				
//			}
//
//			@Override
//			public void jump() {
//				System.out.println("Jump 5 Feet.");
//				
//			}
//
//			@Override
//			public void search() {
//				System.out.println("Search For Hunt Animal.");
//				
//			}	
//			
//		}.attack();
		
		Dinosaur d1 = new Dinosaur(){  //d1 new好後,Dinosaur物件直接改寫

			@Override
			public void attack() {
				System.out.println("Speedup and Attack Something.");
				
			}

			@Override
			public void jump() {
				System.out.println("Jump 5 Feet.");
				
			}

			@Override
			public void search() {
				System.out.println("Search For Hunt Animal.");
				
			}
			
		};
		
		d1.search();
		d1.jump();
		d1.attack();

	}

}
