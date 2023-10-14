package javapractise;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPrac {
	public static void main(String[] args) {
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(70, "hi");
		map.put(30, 50);
		map.put(20, "Hello");
		map.put(null, 50);
		map.put(60, null);
		map.put(null, 70);
		map.put(80, null);
		map.put(null,80);
		System.out.println(map);
		for (Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
	}
}
