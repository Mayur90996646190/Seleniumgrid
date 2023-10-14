package javaArpMam;

public class SplitBywithoutSpace {
	public static void main(String[] args) {
		String a = "hello";
		String[] ch = a.split("");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
