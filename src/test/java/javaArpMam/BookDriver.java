package javaArpMam;

import java.util.ArrayList;

public class BookDriver {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Book(101, "manual testing", 51000));
		al.add(new Book(102,"java",46494));
		al.add(new Book(105,"SQL",946464));
		for(Object a : al) {
			Book b1 = (Book)a;
			b1.display();
		}
	}
}
