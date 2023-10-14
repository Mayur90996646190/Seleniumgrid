package javaArpMam;

public class OccuranceOfEachChracter {
	public static void main(String[] args) {
		String s= "156489959610659941";
		char[] num = s.toCharArray();
		boolean[] b = new boolean[num.length];
		for (int i = 0; i < num.length; i++) {
			if(b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(num[i]==num[j]) {
						b[j]=true;
						count++;
					}
				}
				System.out.println(num[i] +" is repeating as " + count);
			}
		}
	}
}
