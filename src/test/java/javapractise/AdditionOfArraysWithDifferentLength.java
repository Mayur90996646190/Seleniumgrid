package javapractise;

public class AdditionOfArraysWithDifferentLength {
	public static void main(String[] args) {
		int[] a = { 5, 2, 6, 7, 3 };
		int[] b = { 2, 1, 7, 4 };
		// 7 3 13 11 3

		int length = a.length;
		if (a.length < b.length) {
			length = b.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				System.out.print(a[i] + b[i] + " ");
			} catch (Exception e) {
				if (a.length < b.length) {
					System.out.print(b[i] + " ");
				} else
					System.out.print(a[i] + " ");
			}
		}
	}
}
