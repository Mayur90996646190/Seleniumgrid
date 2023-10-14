package mapQueastions;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class MapPrac2 {
	@Test
	public void Occurance() {
		String s = "I am From I am From TestYantra";
		String[] wList = s.split(" ");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		for (int i = 0; i < wList.length; i++) {
			map.put(wList[i],i);
		}
		for(String sg : map.keySet()) {
			int count=0;
			for (int i = 0; i < wList.length; i++) {
				if(sg.equals(wList[i])) {
					count++;
				}
			}
				System.out.println(sg + "==" +count);
		}
	}
	@Test
	public void Occurancewithoutduplicate() {
		String s = "I am From I am From TestYantra";
		String[] wList = s.split(" ");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		for (int i = 0; i < wList.length; i++) {
			map.put(wList[i],i);
		}
		for(String sg : map.keySet()) {
			int count=0;
			for (int i = 0; i < wList.length; i++) {
				if(sg.equals(wList[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(sg + "==" +count);
			}
		}
	}
	
	public void removeDuplicate() {
		String s = "I am From I am From TestYantra";
		String[] wList = s.split(" ");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		for (int i = 0; i < wList.length; i++) {
			map.put(wList[i], i);
		}
		for(String word:map.keySet()) {
			System.out.println(word);
		}
	}
	
	@Test
	public void countNumberOfDuplicate() {
		String s = "I am From I am From TestYantra";
		String[] wList = s.split(" ");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		for(int i=0; i< wList.length;i++) {
			map.put(wList[i], i);
		}
		int Num = 0;
		for(String c : map.keySet()) {
			int count=0;
			for (int i = 0; i < wList.length; i++) {
				if(c.equals(wList[i])) {
					count++;
				}
			}
			if(count>1) {
				Num++;
			}
		}
		System.out.println(Num);
	}
	
	
	public void printPositionOfDuplicates() {
		String s = "I am From I am From TestYantra";
		String[] wList = s.split(" ");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		for (int i = 0; i < wList.length; i++) {
			map.put(wList[i], i);
		}
		for(String word: map.keySet()) {
			for (int i = 0; i < wList.length; i++) {
				if(word.equals(wList[i])) {
					System.out.println(word + " position is "+ (i+1));
					break;
				}
			}
		}
	}
}
