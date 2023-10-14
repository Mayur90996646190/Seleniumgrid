package javapractise;

public class CombinationOftwoNum {
	public static void main(String[] args) {
		int[] a = {7,3,8,6,5,9,2,4};
		//combination num is 11
		int comb = 11;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				sum = a[i] + a[j];
				if(comb==sum) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}
}
