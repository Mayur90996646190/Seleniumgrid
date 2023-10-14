package javaArpMam;

public class RightriaBangalore {
	public static void main(String[] args) {
		int num = 4;
		String s= "Bangalore*";
		int n=0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i>=j) {
					System.out.print(s.charAt(n)+ " ");
					n++;
				}
			}
			System.out.println();
		}
	}
}