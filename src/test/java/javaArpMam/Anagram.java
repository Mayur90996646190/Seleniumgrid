package javaArpMam;

public class Anagram {
	public static void main(String[] args) {
		String a = "Silent";
		String b = "Listen";
		
		int[] a1 = frequency(a);
		int[] b1 = frequency(b);
		
		boolean res = isAnagram(a1, b1);
		if(res)
			System.out.println("is anagram");
		else
			System.out.println("is not a anagram");
		
		
	}
	
	public static int[] frequency(String a) {
		int[] b = new int[26];
		char[] ch = a.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				b[ch[i]-97]++;
			}
		}
		return b;
	}
	
	public static boolean isAnagram(int[] a1,int[] b1) {
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]!=b1[i]) {
				return false;
			}
		}
		return true;
	}
}