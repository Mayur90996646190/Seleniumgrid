package stringPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Bangalore";
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			s1 = s1 + ch[i];
		}
		System.out.println(s1);
		reversed();
		reverse();
		stringbufferreverse();
		DirectPrint();
		System.out.println();
		NoofUpperandLowerCasechar();
		NoofUpperandLowerCasechar2();
		stringpalindrome();
		reversestring();
		System.out.println();
		reverseEachWordInSTring();
		reverseEachWordInSTring2();
		System.out.println();
		swap1standLastWordGivenString();
		System.out.println();
		swap1standLastWordGivenString2();
		System.out.println();
		findlengthofStringWothoutusingLength();
		findlengthofStringWothoutusingLength2();
		System.out.println();
		// reverse1();
		removeDuplicateUsingcoll();
		occuranceOfEachCharacter();
		System.out.println();
		countNoOfDupliactesInStringWithCount();
		printThePositionOfEachCharc();
		System.out.println();
		printThePositionOfEachCharcReverse();
		System.out.println();
		countTheDuplicateWord();
		System.out.println();
		countTheDuplicateWordposition();
		System.out.println();
		countTheDuplicateNumber();
		System.out.println();
		countTheDuplicateposition();
	}

	public static void reversed() {
		String s2 = "Bangalore";
		String s3 = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			s3 = s3 + s2.charAt(i);
		}
		System.out.println(s3);
	}

	public static void reverse() {
		int count = 0;
		String st = "Bangalore";
		char[] ch1 = st.toCharArray();
		for (char ch : ch1) {
			count++;
		}
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(ch1[i]);
		}
		System.out.println();
	}

	public static void stringbufferreverse() {
		StringBuffer sb = new StringBuffer("Bangalore");
		System.out.println(sb.reverse());
	}

	public static void DirectPrint() {
		String s = "Bangalore";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	public static void NoofUpperandLowerCasechar() {
		String s = "Bangalore";
		char[] ch = s.toCharArray();
		int uppercase = 0;
		int lowercase = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				uppercase++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lowercase++;
			}
		}
		System.out.println(uppercase + " Number of uppercase");
		System.out.println(lowercase + " Number of Lowercase");
	}

	public static void NoofUpperandLowerCasechar2() {
		String s = "Bangalore";
		int uppercase = 0;
		int lowercase = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				uppercase++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lowercase++;
			}
		}
		System.out.println(uppercase + " Number of uppercase");
		System.out.println(lowercase + " Number of Lowercase");
	}

	public static void stringpalindrome() {
		String s = "abcba";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println(s + " is a Palindrome");
		} else
			System.out.println(s + " is not Palindrome");
	}

	@Test
	public static void reversestring() {
		String s = "I am From Bangalore";
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
	}

	@Test
	// my program
	public static void reverseEachWordInSTring() {
		String s = "I am From Bangalore";
		String[] s1 = s.split(" ");
		String rS = "";

		for (int i = 0; i < s1.length; i++) {
			String r = s1[i];
			String rw = "";
			for (int j = r.length() - 1; j >= 0; j--) {
				rw = rw + r.charAt(j);
			}
			rS = rS + rw + " ";
		}
		System.out.println(rS);

	}

	@Test
	public static void reverseEachWordInSTring2() {
		String s = "I am From Bangalore";
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			String r = s1[i];
			for (int j = r.length() - 1; j >= 0; j--) {
				System.out.print((r.charAt(j)));
			}
			System.out.print(" ");
		}
	}

	// my program
	public static void swap1standLastWordGivenString() {
		String s = "I am from Bangalore"; // Bangalore am from I
		String[] s1 = s.split(" ");
		String fs = s1[0];
		String last = s1[s1.length - 1];

		String temp = fs;
		fs = last;
		last = temp;

		s1[0] = fs;
		s1[s1.length - 1] = last;
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}

	}

	// sir program
	public static void swap1standLastWordGivenString2() {
		String s = "I am from Bangalore"; // Bangalore am from I
		String[] s1 = s.split(" ");

		String temp = s1[0];
		s1[0] = s1[s1.length - 1];
		s1[s1.length - 1] = temp;

		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
	}

	// my program
	public static void findlengthofStringWothoutusingLength() {
		String s = "Testyantra";
		char[] ch = s.toCharArray();

		int count = 0;
		for (char ch1 : ch) {
			count++;
		}
		System.out.println(count);
	}

	// sir
	public static void findlengthofStringWothoutusingLength2() {
		String s = "testYantra";
		int i = 0;
		while (true) {
			try {
				s.charAt(i);
				i++;
			} catch (Exception e) {
				System.out.println(i);
				break;
			}
		}
	}

//	public static void reverse1() {
//		String s = "I am from Bangalore";
//		char[] ch = s.toCharArray();
//		String[] s1 = s.split(" ");
//	
//		for (int i = s.length()-1; i >= 0;  i--){
//			System.out.print(s.charAt(i));
//		}
//	}

	public static void removeDuplicateUsingcoll() {
		String st = "Tester";
		String s = st.toLowerCase();
		// Character is bcoz using only one word
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

	public static void occuranceOfEachCharacter() {
		String st = "Tester";
		String s = st.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch + " is repeating " + count + " time");
		}

	}

	@Test
	public static void countNoOfDupliactesInStringWithCount() {
		String st = "Tester";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(s.charAt(i));
		}
		int num = 0;
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
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
	public static void printThePositionOfEachCharc() {
		String st = "Tester";
		// t=1 e=2 s=3 r=6
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					System.out.println(ch + " position is " + (i + 1));
					break;
				}
			}
		}
	}

	public static void printThePositionOfEachCharcReverse() {
		String st = "Tester";
		// r=6 e=5 t=4 s=3
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = s.length() - 1; i >= 0; i--) {
				if (ch == s.charAt(i)) {
					System.out.println(ch + " position is " + (i + 1));
					break;
				}
			}
		}
	}

	@Test
	public static void countTheDuplicateWord() {
		String s = "I am I am from Bangalore";
		// int[] a = {2,3,2,5,4,5,1};
		String[] wList = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < wList.length; i++) {
			set.add(wList[i]);
		}
		int num = 0;
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < wList.length - 1; i++) {
				if (word.equalsIgnoreCase(wList[i])) {
					count++;
				}
			}
			if (count > 1) {
				num++;
			}
		}
		System.out.println(num);
	}

	public static void occuranceTheDuplicateWord() {
		String s = "I am I am from Bangalore";
		// int[] a = {2,3,2,5,4,5,1};
		String[] wList = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < wList.length; i++) {
			set.add(wList[i]);
		}
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < wList.length - 1; i++) {
				if (word.equals(wList[i])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(word + " is repeating word " + count + " time");
			}

		}
	}

	public static void countTheDuplicateWordposition() {
		String s = "I am I am from Bangalore";
		// int[] a = {2,3,2,5,4,5,1};
		String[] wList = s.split("\\s+");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < wList.length; i++) {
			set.add(wList[i]);
		}
		for (String word : set) {
			for (int i = 0; i < wList.length; i++) {
				if (word.equals(wList[i])) {
					System.out.println(word + " is position as " + (i + 1));
					break;
				}
			}
		}
	}

	@Test
	public static void countTheDuplicateNumber() {
		int[] a = { 2, 3, 2, 5, 4, 5, 1, 3 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		int num = 0;
		for (Integer m : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (m == a[i]) {
					count++;
				}
			}
			if (count > 1) {
				num++;
			}
		}
		System.out.println(num);
	}

	public static void countTheDuplicateposition() {
		int[] a = { 2, 3, 2, 5, 4, 5, 1 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer m : set) {
			for (int i = 0; i < a.length; i++) {
				if (m == a[i]) {
					System.out.println(m + " is position " + (i + 1));
					break;
				}
			}
		}
	}

	@Test
	public void reverseWithSpace() {
		String str = "I am From Bangalore";
		//e ro lagn aBmorFmaI
		String str1 = str.replace(" ","");
		String rs = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			rs = rs + str1.charAt(i);
		}
		System.out.println(rs);
		
		int b = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.print(" ");
			}
			else {
				System.out.print(rs.charAt(b));
				b++;
			}
		}
	}

	

}
