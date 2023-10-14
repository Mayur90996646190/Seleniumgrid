package javaArpMam;

public class Book {
	int id;
	String name;
	double price;
	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
}
