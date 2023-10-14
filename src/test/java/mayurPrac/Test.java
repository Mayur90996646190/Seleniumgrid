package mayurPrac;

public class Test {
	public static void main(String[] args) {
		String s = "I am from Bangalore";
		String[] s1=s.split(" ");
		String rvw = "";
		String rS = "";
		for (int i = 0; i < s1.length; i++) {
			String word = s1[i];
			for (int j = word.length()-1; j >=0 ; j--) {
				rvw = rvw + word.charAt(j);
			}
			rS = rS + rvw + " ";
		}
		System.out.println(rS);
	}
}
