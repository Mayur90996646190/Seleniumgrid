package javaArpMam;

public class LowerCaseToUpperCaseWOBuildIn {
	public static void main(String[] args) {
		String s="MayurIsampelliwar";
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] = (char) (ch[i] -('a'-'A'));
				//ch[i]-=32;
			}
			s1 = s1 + ch[i];
		}
		System.out.println(s1);	
		
		String s2 = new String(ch);
		System.out.println(s2);
	}
}
