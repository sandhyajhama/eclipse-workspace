package string;

public class CharAtEx {

	public static void main(String[] args) {
		
		String s = new String("This house is beautiful.");
		int len = s.length();
		
		System.out.println("The first character of this line is "+s.charAt(0));
		System.out.println("The last character of this line is "+s.charAt(len-1));
	}

}
