package javaArpMam;

public class RepeatingOfCharcters {
	public static void main(String[] args) {
		String s = "35654642366";
		char[] s1 = s.toCharArray();
		boolean[] b = new boolean[s.length()];
		for(int i=0; i<s1.length; i++) {
			if(b[i]==false) {
				int count = 1;
				for (int j = i+1; j < s1.length; j++) {
					if(b[i]==false) {
						if(s1[i]==s1[j]) {
							b[j] = true;
							count++;
						}
					}
				}
				if(count>1) {
					System.out.println(s1[i]+" repeating "+count);
				}
			}
		}
		
	}
}
