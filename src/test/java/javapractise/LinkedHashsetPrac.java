package javapractise;

import java.util.LinkedHashSet;

public class LinkedHashsetPrac {
	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(40);
		set.add("hi");
		set.add("Hello");
		set.add(20);
		set.add(40);
		set.add(null);
		set.add(null);
		System.out.println(set);
	}
}
