package javapractise;

import org.testng.annotations.Test;

public class BubbleSortALL {
	@Test
	public void sortAnArrayInAscendingOrder() {
		int[] a = { 5, 3, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	
	@Test
	public void sortAnArrayInDescendingOrder() {
		int[] a = { 5, 3, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	@Test
	public void firstMinNoArrayUsingBbSort() {
		int[] a = { 5, 3,0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("First min no is "+a[0]);
		System.out.println();
	}
	@Test
	public void sumOfFisrtThreeMinInArray() {
		int[] a = { 5, 3,0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of first 3 no is " + sum);
		System.out.println();
		
	}
	
	@Test
	public void mulOf1stThreeMaxNum() {
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("from mul of first three max num");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int mul = 1;
		for (int j = 0; j < 3; j++) {
			mul = mul * a[j];
		}
		System.out.println();
		System.out.println(mul);
		
	}
	@Test
	public void find1stMinNumInArrayWithoutBBsort() {
		int[] a = {5,3,1,4};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("first min without bbsort " + min);
	}
	
	@Test
	public void find1stMaxNumInArrayWithoutBBsort() {
		int[] a = {5,3,1,4};
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("first max without bbsort " + max);
	}
	
	@Test
	public void find1stAnd2ndMaxNumInArrayWithoutBBsort() {
		int[] a = {0,1,5,4,1};
		int fmax = a[0];
		int smax = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=fmax)
			{
				if(a[i]!=fmax) {
					smax = fmax;
				}
				fmax = a[i];
			}else if(smax==fmax || a[i]>smax)//smin 5 1
			{
				smax = a[i];
			}
		}
		System.out.println(fmax + " " + smax);
	}
	@Test
	public void find1stAnd2ndMinNumInArrayWithoutBBsort() {
		int[] a = {0,1,5,4,1};
		int fmin = a[0];
		int smin = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin) {
					smin = fmin;
				}
				fmin = a[i];
			}else if(smin == fmin || a[i]<smin)//smin 5 1
			{
				smin = a[i];
			}
		}
		System.out.println(fmin + " " + smin);
	}
	
	@Test
	public static void test() {
		int[] a = { 10, 5,10,5,3, 9, 64 };
		int fmax = a[0];
		int smax = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=fmax)
			{
				smax = fmax;
				fmax = a[i];
			}
			else if(a[i]>smax) {
				smax = a[i];
			}
		}
		System.out.println(fmax + " " + smax);
	}
}
