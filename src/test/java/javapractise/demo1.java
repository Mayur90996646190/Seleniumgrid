package javapractise;

import java.util.NavigableSet;
import java.util.TreeSet;

public class demo1 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		int [] a = { 2,2,12,21,52};
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		
		NavigableSet<Integer> set1 = set.descendingSet();
		int count = 0;
		for(Integer m : set1) {
			if(count<3) {
			System.out.println(m);
			}
			count++;
		}
	}
}
