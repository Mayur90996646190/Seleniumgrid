package javapractise;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 6 };
		for(int i = 0; i < a.length; i++) {
			int pos = i;
			for (int j = 0; j < a.length; j++) {
				if (a[pos] < a[j]) {
					pos = j;
				}
			}
			if (pos != i) {
				int temp = a[pos];
				a[pos] = a[i];
				a[i] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
