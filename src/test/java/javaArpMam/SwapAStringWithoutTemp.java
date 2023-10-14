package javaArpMam;

import org.testng.annotations.Test;

public class SwapAStringWithoutTemp {
	public static void main(String[] args) {
		String a = "Mayur";//5
		String b = "Isampelliwar";//12
		a = a+b;
		b=a.substring(0,a.length()-b.length());
		a =a.substring(b.length(),a.length());
		System.out.println(a);
		System.out.println(b);
		
	}
	
	@Test
	public void inter() {
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
}
