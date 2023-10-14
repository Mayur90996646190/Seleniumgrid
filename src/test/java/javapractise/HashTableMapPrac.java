package javapractise;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableMapPrac {
	public static void main(String[] args) {
		Hashtable<Object, Object> map = new Hashtable<Object, Object>();
		map.put(10, "hi");
		map.put(20, 30);
		map.put(30, 50);
		map.put(510,50);
		map.put(70, 80);
//		map.put(null, 50);
//		map.put(66,null); not allowed null
		
		System.out.println(map);	
		
		for (Entry<Object,Object> m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
	}
}
