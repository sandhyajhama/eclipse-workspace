package string;

public class Ex1declarnformat {

	public static void main(String[] args) {
		
		String s1 = "Sandhya Mahaseth";
		String s2 = new String("Sandhya Purbey Mahaseth");
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		String s3 = String.format("%5d", len1);
		String s4 = String.format("%5d", len2);
		
		System.out.println("The string is "+s1);
		System.out.println("Length of the string is"+s3);
		System.out.println("The string is "+s2);
		System.out.println("Length of the string is"+s4);

	}
	
}
