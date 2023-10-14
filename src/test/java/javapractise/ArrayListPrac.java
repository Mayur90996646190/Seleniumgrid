package javapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPrac {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList<>();
		ls.add(10);
		ls.add(51);
		ls.add(105);
		ls.add(20);
		//ls.add(null);		//System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(50);
		ll.add(80);
		ll.add(90);
		ll.add(100);
		ll.add(100);
		ll.add(null);
		ll.add("Mayur");
		System.out.println(ll);
		
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(20);
		l.add(50);
		l.addFirst(10);
		l.addLast(90);
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}
}
