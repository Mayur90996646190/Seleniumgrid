package javapractise;

import org.testng.annotations.Test;

public class demo {

	@Test
	
	public void find1stMinNumInArrayWithoutBBsort() {
		int[] a = {5,3,0,1,4};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("first min " + min);
	}
	
	@Test
	public void find1stAnd2ndMinNumInArrayWithoutBBsort() {
		int[] a = {0,1,5,4,1};
		int fmin = a[0];
		int smin = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin) {
					smin = fmin;
				}
				fmin = a[i];
			}else if(smin == fmin || a[i]<smin)//smin 5 1
			{
				smin = a[i];
			}
		}
		System.out.println(fmin + " " + smin);
	}
	
	@Test
	public void find1stAnd2ndMaxNumInArrayWithoutBBsort() {
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
