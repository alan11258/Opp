package tw.alan.myproject.opp.collection;

import java.util.LinkedList;

public class CallTestLinkedListEx1 {
	
	@SuppressWarnings("rawtypes")
	private LinkedList list1;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void processStroeQueue(){
		list1 = new LinkedList();
		list1.offer("signal");   //輸入signal
		list1.offer("traffic");   //輸入traffic
	}
	
	public void processRetreiveQueue(){
		while(list1.peek() != null){   //當list1長度不為空時
			String data = (String) list1.poll(); //先進先出
			System.out.println("data:" + data);
		}
	}

	public static void main(String[] args) {
		CallTestLinkedListEx1 test1 = new CallTestLinkedListEx1();
		test1.processStroeQueue();
		test1.processRetreiveQueue();
	

	}

}
