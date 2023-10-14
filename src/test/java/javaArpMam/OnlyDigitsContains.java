package javaArpMam;

public class OnlyDigitsContains {
	public static void main(String[] args) {
		String s = "5456448475";
		
		try {
			Integer.parseInt(s);
			//used to convert string into int and int into string
			System.out.println("Only digits");
		}
		catch(Exception e) {
			System.out.println("not only digits");
		}
	}
}
