package stringPractice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Vowels {

	public void countNoofVowelsInString() {
		String s = "Software";
		int vowels = 0;
		int consonents = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) >= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) >= 'z') {
				if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
						|| s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
						|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {
					vowels++;
				} else
					consonents++;
			}
		}
		System.out.println(vowels + " no of vowels");
		System.out.println(consonents + " no of consonents");
	}

	// sir
	public void countNoofVowelsInString2() {
		String str = "Software";
		String st = str.toLowerCase();
		char[] s = str.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
				count++;
				System.out.println(s[i]);
			}
		}
		System.out.println(count);
	}
	@Test
	public void countVowelsWithoutDuplicates() {
		String s = "India";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		int count = 0;
		for (Character c : set) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count + " no of vowels");
	}

	@Test
	public void segaragateNumberAlphandcharInaString() {
		String s = "a2B&c3/";
		String alpha = "";
		String Num = "";
		String sp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				alpha = alpha + s.charAt(i);
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				Num = Num + s.charAt(i);
			} else
				sp = sp + s.charAt(i);
		}
		System.out.println(alpha + "  " + Num + "  " + sp);
	}
	@Test
	public void addNumInaString() {
		String s = "a3b2d4";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum = sum + (s.charAt(i) - 48);
			}
		}
		System.out.println(sum);
	}

	@Test
	public void sumOf2DigitsUptoalph() {
		String s = "a10b11c3";
		int sum = 0;
		int tsum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int n = s.charAt(i) - 48;
				tsum = tsum * 10 + n;
			} else {
				sum = sum + tsum;
				tsum = 0;
			}
		}
		sum = sum + tsum;
		System.out.println(sum);
	}
	
	public void finminLengthValuesInStringArray() {
		String[] s = {"abcd","a","bcdf","edf","d"};
		String minLength = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<minLength.length())
			{
				minLength = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==minLength.length()) {
				System.out.println(s[i]);
			}
		}
	}
	
	public void finmaxLengthValuesInStringArray2() {
		String[] s = {"abcd","a","bcdf","edf","d"};
		String maxLength = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>maxLength.length())
			{
				maxLength = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==maxLength.length()) {
				System.out.println(s[i]);
			}
		}
	}
	
	@Test
	public void findminLengthInaString() {
		String[] s = {"1223","997450","54","556"};
		String minLength = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<minLength.length()) {
				minLength = s[i];
			}
			
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==minLength.length()) {
				System.out.println(s[i]);
			}
		}
	}
	
	public void findmaxLengthOfInt() {
		String[] s = {"1223","997450","54","556"};
		String maxlength = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>maxlength.length()) {
				maxlength = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==maxlength.length())
			{
				System.out.println(s[i]);
			}
		}
	}
	@Test
	public void occuranceOfEachCharUsingmap() {
		String st = "TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		
		for (Entry<Character, Object> m  : map.entrySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(m.getKey()==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(m.getKey()+ "==" + count);
		}
	}

}
