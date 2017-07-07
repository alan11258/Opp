package tw.alan.myproject.opp.io;

import java.util.HashMap;
import java.util.LinkedList;

public class TestTrackRecordEx1 {
	
	public void trackRecord(){
		LinkedList<HashMap<String,Double>> line = new LinkedList<HashMap<String,Double>>();
		
		for(int i = 1; i <= 5; i++){
		double x = Math.random()*100;
		double y = Math.random()*100;
		
		HashMap<String,Double> point = new HashMap<String,Double>();
		point.put("x", x);
		point.put("y", y);
		
		line.add(point);
		
//		System.out.println(point);
		}
		System.out.println(line);
	}
	

	public static void main(String[] args) {
		TestTrackRecordEx1 record = new TestTrackRecordEx1();
		record.trackRecord();


	}

}
