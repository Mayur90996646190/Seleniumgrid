package mayurPrac;

public class FibonacciSeries {
	public static void main(String[] args) {
		//0 1 1 2 3 5
		int a  = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int count= 0;
		int sum;
		while(count<=10) {
			
		sum  = a+b;
		a = b ;
		b = sum;
		System.out.println(sum);
		count++;
		}
	}
}
