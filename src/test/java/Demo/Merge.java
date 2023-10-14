package Demo;

import java.util.Scanner;

public class Merge {
	public static int[] read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element of an array");
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = read();
		int[] b = read();
		
		int[] c = new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length+i] = a[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] +" ");
		}
		
	}
}
