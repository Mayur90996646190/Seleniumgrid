package stringPractice;

public class ReverseSpaceString {
	public static void main(String[] args) {
		String str = "I am From Bangalore";
		//e ro lagn aBmorFmaI
		char[] ch = str.toCharArray();
		String rs = "";
		String str1 = str.replace(" ", "");
		 
		for (int i = str1.length() - 1; i >= 0; i--) {
			rs = rs + str1.charAt(i);
		}
		System.out.println(rs);
		int count = 0;
		int sp = 0;
		int b = 0;
		for(int i=0;i<4;i++) {
			while (b<str.length()) {
				if(ch[b] >= 'a' && ch[b] <= 'z' || ch[b] >= 'A' && ch[b] <= 'Z') {
				count++;
				b++;
				}
				else
				{
					b++;
					break;
				}
				
			}

			for (int j = 0; j < count; j++) {
				System.out.print(rs.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
