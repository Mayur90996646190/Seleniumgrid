package javaArpMam;

public class StringPalindrome {
	public static void main(String[] args) {
		String m = "Malayalam";
		String s = m.toLowerCase();
		String sum = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				sum = sum + s.charAt(i);
				//concating to converting to string directly
			}
		}
		if(sum.equalsIgnoreCase(s)) {
			System.out.println(s + " is a palyndrome");
		}
	}
}
