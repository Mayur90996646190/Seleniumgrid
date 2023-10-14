package javaArpMam;


public class Subset {
	public static void main(String[] args) {
		String s = "fun";
		for (int i = 0; i < s.length(); i++) {
			String s1 = "";
			for (int j = i; j < s.length(); j++) {
				s1 = s1 +s.charAt(j) ;
				System.out.println(s1);
			}
		}
	}
}
