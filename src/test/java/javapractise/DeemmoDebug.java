package javapractise;

public class DeemmoDebug {
	public static void main(String[] args) {
		int[] a = {0,1,5,4,1};
		int fmax = a[0];
		int smax = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=fmax)
			{
				if(a[i]!=fmax) {
					smax = fmax;
				}
				fmax = a[i];
			}else if(smax==fmax || a[i]>smax)//smin 5 1
			{
				smax = a[i];
			}
		}
		System.out.println(fmax + " " + smax);
	}
	
}
