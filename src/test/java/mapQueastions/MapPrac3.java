package mapQueastions;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class MapPrac3 {
	public void Occurance() {
		int[] a = { 4, 5, 3, 4, 5, 7, 8, 3 };
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}

		for (Integer m : map.keySet()) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (m == a[i]) {
					count++;
				}
			}
			System.out.println(m + " character occurance is " + count);
		}
	}
	@Test
	public void OccuranceOfDuplicate() {
		int[] a = { 4, 5, 3, 4, 5, 7, 8, 3 };
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}

		for (Integer m : map.keySet()) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (m == a[i]) {
					count++;
				}
			}
			if(count>1)
			System.out.println(m + " character occurance is " + count);
		}
	}

	public void removeDuplicate() {
		int[] a = { 4, 5, 3, 4, 5, 7, 8, 3 };
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}
		for (Integer m : map.keySet()) {
			System.out.println(m);
		}
	}

	@Test
	public void countNumDuplicate() {
		int[] a = { 4, 5, 3, 4, 5, 7, 8, 3 };
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}
		int Num = 0;
		for (Integer m : map.keySet()) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (m == a[i]) {
					count++;
				}
			}
			if (count > 1) {
				Num++;
			}
		}
		System.out.println(Num);
	}

	@Test
	public void printNumDuplicate() {
		int[] a = { 4, 5, 3, 4, 5, 7, 8, 3 };
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}
		int Num = 0;
		for (Integer m : map.keySet()) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (m == a[i]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(m);
			}
		}
		// System.out.println(Num);
	}

}
