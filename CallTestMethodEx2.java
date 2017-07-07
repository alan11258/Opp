package tw.alan.myproject.opp;

import java.util.Scanner;

class Calculator{
	Scanner scn = new Scanner(System.in);

	public void plus(int x, int y){
		System.out.println("x+y= " + (x + y));
	}
	public void mius(int a, int b){
		System.out.println("a-b= " + (a - b));
	}	
	public void times(int c, int d){
		System.out.println("cxd= " + (c * d));
	}
	public void divied(int f, int g){
		System.out.println("f%g= " + (f / g));
	}

}


public class CallTestMethodEx2 {

	public static Scanner scn;

	public static void main(String[] args) {	
		System.out.println("Please Inpute x + y Value.");
		Calculator casio = new Calculator();
		scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		casio.plus(x, y);
		System.out.println();

//		System.out.println("Please Inpute a - b Value.");
//		scn = new Scanner(System.in);
//		int a = scn.nextInt();
//		int b = scn.nextInt();
//		casio.mius(a, b);
//		System.out.println();
//		System.out.println("Please Inpute c x d Value.");
//		scn = new Scanner(System.in);
//		int c = scn.nextInt();
//		int d = scn.nextInt();
//		casio.times(c, d);
//		System.out.println();
//		System.out.println("Please Inpute f x g Value.");
//		scn = new Scanner(System.in);
//		int f = scn.nextInt();
//		int g = scn.nextInt();
//		casio.divied(f, g);
		System.out.println("Mission Complete!");
	}

}
