package mayurPrac;

import org.testng.annotations.Test;

public class PatternPrac {
	@Test
	public void pattern() {
		int n = 4;
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n; j++) {
				if(i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern1() {
		int n = 4;
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n; j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern2() {
		int n = 4;
		char c = 'A';
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n; j++) {
				if(i+j>=n-1) {
					System.out.print(c + " ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern3() {
		int n = 4;
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n; j++) {
				if(i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern4() {
		int n = 4;
		int sp = 0;
		int star = n;
		for(int i=0; i<n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp++;
			star--;
		}
	}
	
//	* * * * 
//	 * * * 
//	  * * 
//	   * 
	
	@Test
	public void pattern5() {
		int n = 4;
		int sp = 0;
		int star = n;
		for(int i = 0;i<n; i++) {
			for(int j=0; j<sp; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			star--;
			sp++;
		}
	}
	
	@Test
	public void pattern6() {
		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern7() {
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern8() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i>=j) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern9() {
		int n = 5;
		for(int i=0;i<n;i++) {
			int k = 5;
			for(int j=0; j<n;j++) {
				if(i>=j) {
					System.out.print(k-- + " ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern10() {
		int n=5;
		int sp=n;
		int star = 1;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<sp; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			sp--;
			star++;
		}
	}
	@Test
	public void pattern11() {
		int n = 5;
		char ch = 'A';
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern12() {
		int n=5;
		for(int i=0; i<n; i++) {
			char ch = 'A';
			for(int j=0; j<n; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
	
	
}
