package lastDayJava;

import org.testng.annotations.Test;

public class FactorialOfaNum {
	@Test
	public void factorial() {
		//factorial of 5
		int n = 5;
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

	@Test
	public void fibonacciSeries() {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		System.out.println(fib1);
		System.out.println(fib2);
		for (int i = 1; i <=10; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
	}

	@Test
	public void integerPalyndrome() {
		int num = 121;
		int r;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palyndrome");
		} else
			System.out.println("not palyndrome");
	}

	@Test
	public void palyndromeprac() {
		int num = 121;
		int sum = 0;
		int temp = num;
		int r;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palyndrome");
		}
	}

	@Test
	public void printNo() {
		// 1 3 7 15 31 63
		int num = 1;
		int sum = 0;
		while (num <= 6) {
			sum = sum * 2 + 1;
			num++;
			System.out.println(sum);
		}

	}
	
	

	// check the given num is prime or not (7)
	// find prime no in an array 4,5,2,3,6,8,9
	// print prime nos from 1-30
	@Test
	public void primeNum() {
		int num = 7;
		int n = 2;
		int count = 0;
		while (n < num / 2) {
			if (num % n == 0) {
				count++;
			}
			n++;
		}
		if (count == 0) {
			System.out.println(num + " Is a prime no");
		} else {
			System.out.println(num + " Is not a prime no");
		}
	}

	@Test
	public void primenosinarray() {
		int[] a = { 4, 5, 2, 3, 6, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			int j = 2;
			int count = 0;
			while (j <= a[i] / 2) {
				if (a[i] % j == 0) {
					count++;
				}
				j++;
			}
			if (count == 0) {
				System.out.println(a[i] + " is a prime no");
			}
		}
	}

	@Test
	public void printPrimeNum() {
		int num = 30;
		for (int i = 1; i <= num; i++) {
			int num1 = i;
			int n = 2;
			int count = 0;
			while (n <= num1/2) {
				if (num1 % n == 0) {
					count++;
				}
				n++;
			}
			if (count == 0) {
				System.out.println(num1);
			}
			
		}
	}
	
	@Test
	public void patternS() {
		
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void p2() {
		int n = 5;
		for(int i =0 ; i<n ; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j>=n-1)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	@Test
	public void p3() {
		int n = 5;
		for(int i =0 ; i<n ; i++) {
			for (int j = 0; j < i; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void p4() {
		int n=5;
		for(int i=1; i<=n; i++) {
		
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*
	
	@Test
	public void p5() {
		int n=5;
		for(int i=1; i<=n; i++) {
		
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
	
	@Test
	public void p6() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//   *
	//  **
	// ***
	//****
	
	@Test
	public void p7() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//	* * * * * 
//	  * * * * 
//	    * * * 
//	      * * 
//	        * 
	
	//Two patterns are left
	@Test
	public void p8() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
	@Test
	public void p9() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//	 * * * * * 
//	  * * * * 
//	   * * * 
//	    * * 
//	     * 

	@Test
	public void pattern10() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
//	1 1 1 1 1 
//	2 2 2 2 2 
//	3 3 3 3 3 
//	4 4 4 4 4 
//	5 5 5 5 5 
	
	@Test
	public void pattern11() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5
	
	@Test
	public void pattern12() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 
	
	@Test
	public void pattern13() {
		int n=5;
		for(int i=1; i<=n; i++) {
			int k = 5;
			for (int j = 1; j <=i; j++) {
				System.out.print(k--+" ");
			}
			System.out.println();
		}
	}
//	5 
//	5 4 
//	5 4 3 
//	5 4 3 2 
//	5 4 3 2 1 
	
	@Test
	public void pattern14() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
	
	@Test
	public void pattern15() {
		int n= 5;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
	}
//	A B C D E 
//	F G H I J 
//	K L M N O 
//	P Q R S T 
//	U V W X Y 
	
	@Test
	public void pattern16() {
		int n= 5;
		
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= n; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
	}
//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 
}
