package mapQueastions;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MAPPrac {

	public void occuranceOfEachCharUsingmap() {
		String st = "TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}

		for (Entry<Character, Object> m : map.entrySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey() == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(m.getKey() + "==" + count);
		}
	}

	public void removeduplicate() {
		String st = "TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m : map.entrySet()) {
			System.out.print(m.getKey());
		}
		// System.out.println(st);
	}

	public void countnumberOfDuplicate() {
		String st = "TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		int num = 0;
		for (Entry<Character, Object> m : map.entrySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey() == s.charAt(i)) {
					count++;
				}
			}
			if (count > 1) {
				num++;
			}
		}
		System.out.println(num);
	}

	@Test
	public void printPostiionWithoutDuplicate() {
		String st = "TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for (Character c : map.keySet()) {
			for (int i = 0; i < s.length(); i++) {
				if (c== s.charAt(i)) {
					System.out.println(c + " is position" + (i + 1));
					break;
				}
			}
		}
	}
	
	@Test
	public void countvowelsWithoutduplicate() {
		String s = "i am from bangalore";
		String st = s.toLowerCase();
		char[] ch= st.toCharArray();
		
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], i);
		}
		int count= 0;
		for(Character c : map.keySet()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count + " no of vowels");
	}
	
	@Test
	public void countvowelsWithoutduplicateUsingSET() {
		String s = "i am from bangalore";
		String st = s.toLowerCase();
		char[] ch= st.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(ch[i]);
		}
		int count= 0;
		for(Character c : set) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count + " no of vowels");
	}
	
	
}
