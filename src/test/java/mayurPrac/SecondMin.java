package mayurPrac;

public class SecondMin {
	public static void main(String[] args) {
		int[] a = {10,20,3,0,51};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		System.out.println(a[1]);
	}
}
