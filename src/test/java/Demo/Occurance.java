package Demo;


public class Occurance {
	public static void main(String[] args) {
		int[] a = {10,20,10,66,10,50};
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}
		
	}
}
