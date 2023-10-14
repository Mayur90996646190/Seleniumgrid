package javapractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		set.add(40);
		set.add(50);
		set.add("Hello");
		set.add("hi");
		set.add(50);
		set.add(null);
		set.add(null);
		System.out.println(set);
		ArrayList<Object> list = new ArrayList<Object>(set);
		list.add(10);
		list.add(null);
		list.add("Mayur");
		list.add(null);
		list.add(10);
		System.out.println(list);
		Iterator<Object> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
