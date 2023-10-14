package javapractise;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPrac {
	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(40);
		set.add(50);
		set.add(10);
		set.add(5);
		System.out.println(set);
		//System.out.println(set.descendingSet());
		set.descendingIterator();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
		
	}
}
