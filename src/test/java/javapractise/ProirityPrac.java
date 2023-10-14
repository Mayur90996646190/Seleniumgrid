package javapractise;

import java.util.PriorityQueue;

public class ProirityPrac {
	public static void main(String[] args) {
		//stores only homogenious elements
		PriorityQueue<Object> q  = new PriorityQueue<Object>();
		q.add(10);
		q.add(20);
		q.add(60);
		q.add(70);
		System.out.println(q);	
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		//q.add(null); null not accept
		//q.add("mayur");
	}
}
