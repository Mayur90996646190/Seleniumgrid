package javaArpMam;

public class Panagram {
	public static void main(String[] args) {
		String a ="qwertyuiopasdfghjklzxcvbnm";
		
		int[] b =isFrequency(a);
		boolean res =isPanagram(b);
		if(res)
			System.out.println("Is panagram");
		else
			System.out.println("Is not a panagram");
	}
	
	public static int[] isFrequency(String a) {
		int[] b = new int[a.length()];
		char[] ch = a.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			b[ch[i]-97]++;
		}
		return b;
	}
	
	public static boolean isPanagram(int[] b) {
		for (int i = 0; i < b.length; i++) {
			if(b[i]==0) {
				return false;
			}
		}
		return true;
	}
	
}
